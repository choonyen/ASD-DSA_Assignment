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
    
    public void increaseCustomerCount(int count){

        try{
            stmt = conn.prepareStatement(("Update Count set CUSTOMERCOUNT = " + count));
            stmt.executeUpdate();
                  
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
 
    }
    public void increaseCatalogCount(int count){

        try{
            stmt = conn.prepareStatement(("Update Count set PRODUCTCOUNT = " + count));
            stmt.executeUpdate();
                  
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
 
    }
    
     public void increasePromotionCount(int count){

        try{
            stmt = conn.prepareStatement(("Update Count set PROMOTIONCOUNT = " + count));
            stmt.executeUpdate();
                  
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
 
    }
    
    
    public void increaseCorporateCustomerCount(int count){ 

        try{
            stmt = conn.prepareStatement(("Update Count set CORPORATECUSTOMERCOUNT = " + count));
            stmt.executeUpdate();
                  
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
 
    }
     
    
    public void increaseOrderCount(int count){
        
        try{
            stmt = conn.prepareStatement(("Update Count set ORDERCOUNT = " + count));
            stmt.executeUpdate();
                  
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void increaseDeliveryCount(int count){
     
        try{
            stmt = conn.prepareStatement(("Update Count set DELIVERYCOUNT = " + count));
            stmt.executeUpdate();
                  
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
 
    }
    
     public void increasePickUpCount(int count){
       
        try{
            stmt = conn.prepareStatement(("Update Count set PICKUPCOUNT = " + count));
            stmt.executeUpdate();
                  
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
 
    }
    
     public void increaseCustomizedCount(int count){
         
        try{
            stmt = conn.prepareStatement(("Update Count set CUSTOMIZEDORDERCOUNT = " + count));
            stmt.executeUpdate();
                  
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
 
    }
    
    public void increaseInvoiceCount(int count){ 

        try{
            stmt = conn.prepareStatement(("Update Count set INVOICECOUNT = " + count));
            stmt.executeUpdate();
                  
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
 
    }
    
    public void increasePaymentCount(){
        
        Count count = this.getCount();
        int paymentCount = count.getPaymentCount() + 1;
        try{
            stmt = conn.prepareStatement(("Update Count set PAYMENTCOUNT = " + paymentCount));
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
    
    private void shutDown() {
        if (conn != null)
            try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
