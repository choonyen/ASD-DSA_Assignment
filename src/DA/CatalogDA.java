package DA;
import Model.Catalog;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import java.util.*;

public class CatalogDA {

    private String host = "jdbc:derby://localhost:1527/DSA_Database";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "CATALOG";
    private Connection conn;
    private PreparedStatement stmt;
    
    public CatalogDA() {
        createConnection();
    }
    
    public Catalog getCatalog(String ID) {
        String queryStr = "SELECT * FROM " + tableName + " WHERE Prodid = ?";
        Catalog catalog = null;
        try {
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, ID);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                catalog = new Catalog(ID, rs.getString("Name"), rs.getString("Type"), rs.getDouble("Price"),rs.getString("Description"), rs.getInt("Stock")) {};
                //customer.setCustid(ID);
                //customer.setCustname(rs.getString("Name"));
                //customer.setCustphoneno(rs.getString("PhoneNo"));
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return catalog;
    }
   
     public void addCatalog(Catalog catalog) {
       String insertStr = "INSERT INTO "+ tableName +" VALUES(?,?,?,?,?,?)";
        try {
              //insert a new table row refer chap 5 slides 28, change .getText to getCode refer programme.java in domain
              
              
              
               stmt = conn.prepareStatement(insertStr);
               stmt.setString(1, catalog.getProdid());
               stmt.setString(2, catalog.getName());
               stmt.setString(3, catalog.getType());
               stmt.setDouble(4, catalog.getPrice());
               stmt.setString(5, catalog.getDescription());
               stmt.setInt(6, catalog.getStock());
               stmt.executeUpdate();
          
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
     public void DeleteCatalog(Catalog catalog){
         String insertStr ="DELETE FROM CATALOG WHERE Prodid = ?";
          try {

              stmt = conn.prepareStatement(insertStr);
                stmt.setString(1,  catalog.getProdid());
              stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
     }  
     public void updateCatalog(Catalog catalog){
       String insertStr = "UPDATE " + tableName + " SET Name = ?, Type = ?, Price = ?, Description = ?, Stock = ? WHERE Prodid = ?";
          try {

               stmt = conn.prepareStatement(insertStr);
               stmt.setString(6, catalog.getProdid());
               stmt.setString(1, catalog.getName());
               stmt.setString(2, catalog.getType());
               stmt.setDouble(3, catalog.getPrice());
               stmt.setString(4, catalog.getDescription());
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
        CatalogDA da = new CatalogDA();
        Catalog catalog = da.getCatalog("P001");
        System.out.println(catalog);
    }
}
