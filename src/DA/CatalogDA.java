package DA;
import Model.Catalog;
import java.sql.*;
import javax.swing.*;


/**
 *
 * @author lamzn
 */
public class CatalogDA {
        private String host = "jdbc:derby://localhost:1527/DSA_Database";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "Catalog";
    private Connection conn;
    private PreparedStatement stmt;
    


public CatalogDA() {
        createConnection();
    }

    public Catalog getRecord(String ID) {
        String queryStr = "SELECT * FROM " + tableName + " WHERE Prodid = ?";
        Catalog catalog;
            catalog = null;
        try {
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, ID);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                catalog = new Catalog(ID, rs.getString("Name"), rs.getString("Type"),rs.getDouble("Price"), rs.getInt("Stock")) {};
          
             
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return catalog;
    }

public void addRecord(Catalog catalog) {
       String insertStr = "INSERT INTO "+ tableName +" VALUES(?,?,?,?,?)";
        try {
             
              
              
               stmt = conn.prepareStatement(insertStr);
               stmt.setString(1, catalog.getProdid());
               stmt.setString(2, catalog.getName());
               stmt.setString(3, catalog.getType());
               stmt.setDouble(4, catalog.getPrice());
               stmt.setInt(5, catalog.getStock());
               stmt.executeUpdate();
          
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void createConnection() {
        try {
            conn = DriverManager.getConnection(host, user, password);
            System.out.println("***TRACE: Connection established.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void shutDown() {
        if (conn != null)
            try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public static void main(String[] args) {
        CatalogDA Da = new CatalogDA();
        Catalog catalog = Da.getRecord("C0001");
        System.out.println(catalog);
    }




}