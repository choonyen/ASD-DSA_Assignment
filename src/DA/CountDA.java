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
 * @author LENOVO
 */
public class CountDA {
    private String host = "jdbc:derby://localhost:1527/DSA_Database";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "COUNT";
    private Connection conn;
    private PreparedStatement stmt;
    
    public CountDA(){
        createConnection();
    }
    
    public Count getCount(){
        String queryStr = "SELECT * FROM " + tableName;
        Count count = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                count = new Count(
                        rs.getInt("CUSTOMERCOUNT"),
                        rs.getInt("PRODUCTCOUNT"),
                        rs.getInt("ORDERCOUNT"),
                        rs.getInt("CORPORATECUSTOMERCOUNT"),
                        rs.getInt("DELIVERYCOUNT"),
                        rs.getInt("PICKUPCOUNT"),
                        rs.getInt("INVOICECOUNT"),
                        rs.getInt("CUSTOMIZEDORDERCOUNT"),
                        rs.getInt("PAYMENTCOUNT"),
                        rs.getInt("PROMOTIONCOUNT")
                );
         
            }            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return count;
    }
    
    public void increaseCustomerCount(){
        Count count = this.getCount();
        int customerCount = count.getCustomerCount()+1;
        try{
            stmt = conn.prepareStatement(("Update Count set CUSTOMERCOUNT = " + customerCount));
            stmt.executeUpdate();
                  
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
 
    }
     public void increaseCorporateCustomerCount(){
        increaseCustomerCount(); 
        Count count = this.getCount();
        int corporateCustomerCount = count.getCorporateCustomerCount()+1;
        try{
            stmt = conn.prepareStatement(("Update Count set CORPORATECUSTOMERCOUNT = " + corporateCustomerCount));
            stmt.executeUpdate();
                  
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
 
    }
     
     public void increaseCustomizedCount(){
        Count count = this.getCount();
        int customizedCount = count.getCustomizedOrderCount()+1;
        try{
            stmt = conn.prepareStatement(("Update Count set CUSTOMERCOUNT = " + customizedCount));
            stmt.executeUpdate();
                  
        }catch (SQLException ex) {
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
    
}
