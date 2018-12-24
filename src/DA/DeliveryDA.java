/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;

import Model.LinkedList;
import Model.Delivery;
import Model.DeliveryInterface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import Model.List;

/**
 *
 * @author MSI GL62 6QF
 */
public class DeliveryDA {
    
    private String host = "jdbc:derby://localhost:1527/DSA_Database";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "DELIVERY";
    private Connection conn;
    private PreparedStatement stmt;
    
    public DeliveryDA(){
        createConnection();
    }
    
    /*public DeliveryInterface getDeliveryByDate(Date date){
        String queryStr = "SELECT * FROM " +tableName +" WHERE DELIVERYDATE = ?";
        DeliveryInterface delivery = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setDate(1, new java.sql.Date(date.getTime()));
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                delivery = new Delivery(
                        rs.getString("DELIVERYNO"),
                        rs.getString("ORDERNO"),
                        rs.getDate("DELIVERYDATE"),
                        rs.getString("ADDRESS"),
                        rs.getString("POSTCODE")
                );
            }
        }catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return delivery;
    }*/
    
    public List<DeliveryInterface> getDeliveryListByDate(Date date){
        String queryStr = "SELECT * FROM " +tableName +" WHERE DELIVERYDATE = ?";
        List<DeliveryInterface> deliveryList = new LinkedList();
        try{
            DeliveryInterface delivery;
            stmt = conn.prepareStatement(queryStr);
            stmt.setDate(1, new java.sql.Date(date.getTime()));
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                delivery = new Delivery(
                        rs.getString("DELIVERYNO"),
                        rs.getString("ORDERNO"),
                        rs.getDate("DELIVERYDATE"),
                        rs.getString("ADDRESS"),
                        rs.getString("POSTCODE")
                );
                deliveryList.add(delivery);
            }
        }catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return deliveryList;
    }
    
    public List<DeliveryInterface> getAllDelivery(){
        String queryStr = "SELECT * FROM " +tableName;
        List<DeliveryInterface> deliveryList = new LinkedList();
        try{
            DeliveryInterface delivery;
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                delivery = new Delivery(
                        rs.getString("DELIVERYNO"),
                        rs.getString("ORDERNO"),
                        rs.getDate("DELIVERYDATE"),
                        rs.getString("ADDRESS"),
                        rs.getString("POSTCODE")
                );
                deliveryList.add(delivery);
            }
        }catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return deliveryList;
    }
    
    
     public void addDelivery(DeliveryInterface delivery){
        String insertStr = "INSERT INTO " + tableName + " VALUES(?,?,?,?,?)";
        try{
            stmt = conn.prepareStatement(insertStr);
            stmt.setString(1, delivery.getDeliveryNo());
            stmt.setString(2, delivery.getOrderNo());
            stmt.setDate(3, new java.sql.Date(delivery.getDeliveryDate().getTime()));
            stmt.setString(4, delivery.getAddress());
            stmt.setString(5, delivery.getPostCode());
            
            stmt.executeUpdate();

            
        }catch (SQLException ex) {
                        ex.printStackTrace();

            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
     
     public DeliveryInterface getDeliveryById(String id){
         String queryStr = "SELECT * FROM " + tableName + " WHERE DELIVERYNO = ?";
         DeliveryInterface delivery = null;
         try{
             stmt = conn.prepareStatement(queryStr);
             stmt.setString(1, id);
             ResultSet rs = stmt.executeQuery();
             if(rs.next()){
                 delivery = new Delivery(
                        rs.getString("DELIVERYNO"),
                        rs.getString("ORDERNO"),
                        rs.getDate("DELIVERYDATE"),
                        rs.getString("ADDRESS"),
                        rs.getString("POSTCODE")
                );
             }
         }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return delivery;
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
