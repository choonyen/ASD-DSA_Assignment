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
 * @author LENOVO
 */
public class CustomerDA {
     private String host = "jdbc:derby://localhost:1527/DSA_Database";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "CUSTOMER";
    private Connection conn;
    private PreparedStatement stmt;
    
    public CustomerDA(){
        createConnection();
    }
    
    public void addConsumer(Customer customer){
        String insertStr = "INSERT INTO " + tableName + " VALUES(?,?,?,?,?,?)";
        
        try{
            stmt = conn.prepareStatement(insertStr);
            stmt.setString(1, customer.getCustID());
            stmt.setString(2, customer.getName());
            stmt.setString(3, String.valueOf(customer.getGender()));
            stmt.setInt(4, customer.getAge());
            stmt.setString(5, customer.getContact());
            stmt.setDate(6, new java.sql.Date(customer.getLastOrderDate().getTime()));
        
            stmt.executeUpdate();
            
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Customer getConsumer(String id){
        String queryStr = "SELECT * FROM " + tableName + " WHERE CUSTID = ?";
        Customer customer = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1,id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                customer = new Consumer(
                        rs.getString("CUSTID"),
                        rs.getString("NAME"),                    
                        rs.getString("GENDER").charAt(0),
                        rs.getInt("AGE"),
                        rs.getString("CONTACT"),
                        rs.getDate("LASTORDERDATE")
                 
                );
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return customer;
    }
    
    public Customer getCorporateCustomer(String id){
        String queryStr = "SELECT * FROM " + "CORPORATE_CUSTOMER" + " WHERE CUSTID = ?";
        Customer customer = this.getConsumer(id);
        if(customer!=null){
            try{
            
                stmt = conn.prepareStatement(queryStr);
                stmt.setString(1,id);
                ResultSet rs = stmt.executeQuery();
                if(rs.next()){
                   customer = new CorporateCustomer(
                            rs.getDouble("CREDITLIMIT"),
                            customer.getCustID(),
                            customer.getName(),
                            customer.getGender(),
                            customer.getAge(),
                            customer.getContact(),
                            customer.getLastOrderDate()
                 
                    );
                }
            
            }catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        return customer;
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
