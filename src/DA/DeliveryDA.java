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
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.*;


/**
 *
 * @author User
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
    
    private void createConnection() {
        try {
            conn = DriverManager.getConnection(host, user, password);
            System.out.println("***TRACE: Connection established.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public List<Delivery> getDeliveryList(){
        String queryStr = "SELECT * FROM " + tableName;
        List<Delivery> list = new ArrayList<>();
        try{
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Delivery delivery = new Delivery(
                        rs.getString("DELIVERYNO"),
                        rs.getString("ORDERNO"),
                        rs.getDate("DELIVERYDATE"),
                        rs.getString("ADDRESS"),
                        rs.getInt("POSTCODE")
                );
                   list.add(delivery);
            }            
        }catch (SQLException ex) {
          ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }
    
    public void addDelivery(Delivery delivery){
        String insertStr = "INSERT INTO " + tableName + " VALUES(?,?,?,?,?)";
        try{
            stmt = conn.prepareStatement(insertStr);
            stmt.setString(1, delivery.getDeliveryNo());
            stmt.setString(2, delivery.getOrderNo());
            stmt.setDate(3, new java.sql.Date(delivery.getDeliveryDate().getTime()));
            stmt.setString(4, delivery.getAddress());
            stmt.setInt(5, delivery.getPostcode());
            
            stmt.executeUpdate();

            
        }catch (SQLException ex) {
                        ex.printStackTrace();

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
