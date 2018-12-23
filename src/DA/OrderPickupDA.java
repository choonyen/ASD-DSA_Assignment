/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;

import Model.LinkedList;
import Model.OrderPickup;
import Model.OrderPickupInterface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Model.List;

/**
 *
 * @author MSI GL62 6QF
 */
public class OrderPickupDA {
    private String host = "jdbc:derby://localhost:1527/DSA_Database";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "PICKUP";
    private Connection conn;
    private PreparedStatement stmt;
    
    public OrderPickupDA(){
        createConnection();
    }
    
    public OrderPickupInterface getPickupByNo(String pickupNo){
        String queryStr = "SELECT * FROM " + tableName + " WHERE PICKUPNO = ?";
        OrderPickupInterface orderPickup = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1,pickupNo);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                orderPickup = new OrderPickup(
                        rs.getString("PICKUPNO"),
                        rs.getString("ORDERNO"),         
                        rs.getDate("PICKUPDATE"),
                        rs.getTime("PICKUPTIME")
                );
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return orderPickup;
    }
    
    public List<OrderPickupInterface> getAllPickup(){
        String queryStr = "SELECT * FROM " +tableName;
        List<OrderPickupInterface> pickupList = new LinkedList();
        try{
            OrderPickupInterface orderPickup;
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                    orderPickup = new OrderPickup(
                        rs.getString("PICKUPNO"),
                        rs.getString("ORDERNO"),         
                        rs.getDate("PICKUPDATE"),
                        rs.getTime("PICKUPTIME")
                    );
                    pickupList.add(orderPickup);
                }
        }catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return pickupList;
    }
    
    public void recordTimeStamp(OrderPickupInterface orderPickup){
        String query = "UPDATE " +tableName +" SET PICKUPTIME = ? WHERE PICKUPNO = ?";
        try{
            stmt = conn.prepareStatement(query);
            stmt.setString(2, orderPickup.getPickupNo());
            stmt.setTime(1, orderPickup.getPickupTime());
            
            stmt.executeUpdate();
        }catch(SQLException ex){
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
}
