package DA;
import Model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

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
    
  public CatalogInterface getCatalog(String id){
        String queryStr = "SELECT * FROM " + tableName + " WHERE PRODID = ?";
        CatalogInterface catalog = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1,id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                catalog = new Catalog(
                        rs.getString("PRODID"),
                        rs.getString("NAME"),         
                        rs.getString("TYPE"),
                        rs.getDouble("PRICE"),
                        rs.getString("DESCRIPTION"),
                        rs.getInt("STOCK")
                 
                );
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return catalog;
    }
    
   
       public void addCatalog(CatalogInterface catalog){
        String insertStr = "INSERT INTO " + tableName + " VALUES(?,?,?,?,?,?)";
        
        try{
            stmt = conn.prepareStatement(insertStr);
            stmt.setString(1, catalog.getProdID());
            stmt.setString(2, catalog.getName());   
            stmt.setString(3, catalog.getType());
            stmt.setDouble(4, catalog.getPrice());
            stmt.setString(5, catalog.getDescription());
           stmt.setInt(6, catalog.getStock());
            stmt.executeUpdate();
            
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
   
     public void updateCatalog(CatalogInterface catalog){
        String updateStr = "UPDATE " + tableName + " SET "
                + " NAME = ?, TYPE = ?, PRICE = ?, DESCRIPTION = ?, STOCK = ? WHERE PRODID = ?";
        try{
            stmt = conn.prepareStatement(updateStr);
            stmt.setString(6, catalog.getProdID());
            stmt.setString(1, catalog.getName());
            stmt.setString(2, catalog.getType());
            stmt.setDouble(3, catalog.getPrice());
            stmt.setString(4, catalog.getDescription());
            stmt.setInt(5, catalog.getStock());
            stmt.executeUpdate();
            
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
     
     
     public List<CatalogInterface> getAllCatalog(){
        String queryStr = "Select * FROM " + tableName + " WHERE PRODID Like ? ";
        List<CatalogInterface> catalogList = new LinkedList();
        try{
                CatalogInterface catalog;
                stmt = conn.prepareStatement(queryStr);
                stmt.setString(1, "P%");
                ResultSet rs = stmt.executeQuery();
                while(rs.next()){
                    catalog = new Catalog(
                        rs.getString("PRODID"),
                        rs.getString("NAME"),         
                        rs.getString("TYPE"),
                        rs.getDouble("PRICE"),
                        rs.getString("DESCRIPTION"),
                        rs.getInt("STOCK")
                 
                    );
                    catalogList.add(catalog);
                }
        }catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return catalogList;
     }


    private void createConnection() {
        try {
            conn = DriverManager.getConnection(host, user, password);
            System.out.println("***TRACE: Connection established.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
