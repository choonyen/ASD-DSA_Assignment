/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;

import Model.DAPLinkedList;
import Model.DAPList;
import Model.Delivery;
import Model.DeliveryInterface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

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
    
    public DAPList<DeliveryInterface> getDeliveryListByDate(Date date){
        String queryStr = "SELECT * FROM " +tableName +" WHERE DELIVERYDATE = ?";
        DAPList<DeliveryInterface> deliveryList = new DAPLinkedList();
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
    
    public DAPList<DeliveryInterface> getAllDelivery(){
        String queryStr = "SELECT * FROM " +tableName;
        DAPList<DeliveryInterface> deliveryList = new DAPLinkedList();
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

    private void createConnection() {
        try {
            conn = DriverManager.getConnection(host, user, password);
            System.out.println("***TRACE: Connection established.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
