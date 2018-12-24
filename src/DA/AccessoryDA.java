/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;
import Model.*;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Choonyen
 */
public class AccessoryDA {
    private String host = "jdbc:derby://localhost:1527/DSA_Database";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "CUSTOM_ACCESSORY";
    private Connection conn;
    private PreparedStatement stmt;
    
    public AccessoryDA()
    {
        createConnection();
    }
    
    public List<Accessory> getAccessoryList(){
        String queryStr = "SELECT * FROM " + tableName;
        List<Accessory> accessoryList = new LinkedList();
        try{
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Accessory accessory = null;
                accessory = new Accessory(
                        rs.getString("ACCESSORYNO"),
                        rs.getString("ACCESSORYNAME"),
                        rs.getDouble("PRICE")
                );
                accessoryList.add(accessory);
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return accessoryList;
    }
    
    public Accessory getAccessoryById(String id){
        String queryStr = "SELECT * FROM " + tableName + " WHERE ACCESSORYNO = ?";
        Accessory accessory = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1,id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                accessory = new Accessory(
                        rs.getString("ACCESSORYNO"),
                        rs.getString("ACCESSORYNAME"),
                        rs.getDouble("PRICE")
                );
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return accessory;
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
}
