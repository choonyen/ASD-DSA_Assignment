/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;
import Model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import java.util.*;



/**
 *
 * @author User
 */
public class PickUpDA {
    
    private String host = "jdbc:derby://localhost:1527/DSA_Database";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "PICKUP";
    private Connection conn;
    private PreparedStatement stmt;
    
    public PickUpDA(){
        createConnection();
    }
    
    private void createConnection() {
        try {
            conn = DriverManager.getConnection(host, user, password);
            System.out.println("***TRACE: Connection established.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    
    public List<PickUp> getPickUpList(){
        String queryStr = "SELECT * FROM " + tableName;
        List<PickUp> list = new ArrayList<>();
        try{
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                PickUp pickUp = new PickUp(
                        rs.getString("PICKUPNO"),
                        rs.getString("ORDERNO"),
                        rs.getDate("PICKUPDATE"),
                        rs.getString("PICKUPTIME")
                );
                   list.add(pickUp);
            }            
        }catch (SQLException ex) {
          ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }
       
    public void addPickUp(PickUp pickup){
        String insertStr = "INSERT INTO " + tableName + " VALUES(?,?,?,?)";
        try{

            stmt = conn.prepareStatement(insertStr);
            stmt.setString(1, pickup.getPickUpNo());
            stmt.setString(2, pickup.getOrderNo());
            stmt.setDate(3, new java.sql.Date(pickup.getPickUpDate().getTime()));
            stmt.setString(4, pickup.getPickUpTime());
            
            
            stmt.executeUpdate();
            
            
        }catch (SQLException ex) {
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
