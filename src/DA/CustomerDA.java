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
    
    public void addConsumer(CustomerInterface customer){
        String insertStr = "INSERT INTO " + tableName + " VALUES(?,?,?,?,?,?)";
        
        try{
            stmt = conn.prepareStatement(insertStr);
            stmt.setString(1, customer.getCustID());
            stmt.setString(2, customer.getName());
            stmt.setString(3, customer.getIc());
            stmt.setString(4, String.valueOf(customer.getGender()));
            stmt.setString(5, customer.getContact());
            if(customer.getLastOrderDate()!=null)
                stmt.setDate(6, new java.sql.Date(customer.getLastOrderDate().getTime()));
            else
                stmt.setDate(6, null);
            stmt.executeUpdate();
            
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void addCorporateCustomer(CorporateCustomerInterface customer){
        String insertStr = "INSERT INTO " + "CORPORATE_CUSTOMER" + " VALUES(?,?,?,?,?)";
        this.addConsumer(new Consumer(customer.getCustID(),customer.getName(), customer.getIc(),customer.getGender(),customer.getContact()));
        try{
            stmt = conn.prepareStatement(insertStr);
            stmt.setString(1, customer.getCustID());
            stmt.setString(2, customer.getCompanyName());
            stmt.setString(3, customer.getLocation());
            stmt.setDouble(4, customer.getCreditLimit());
            stmt.setDouble(5, customer.getRemainingCreditLimit());
            
            stmt.executeUpdate();
            
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public CustomerInterface getConsumer(String id){
        String queryStr = "SELECT * FROM " + tableName + " WHERE CUSTID = ?";
        CustomerInterface customer = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1,id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                customer = new Consumer(
                        rs.getString("CUSTID"),
                        rs.getString("NAME"),         
                        rs.getString("IC"),
                        rs.getString("GENDER").charAt(0),
                        rs.getString("CONTACT"),
                        rs.getDate("LASTORDERDATE")
                 
                );
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return customer;
    }
    
    public CustomerInterface getConsumerByIC(String ic){
        String queryStr = "SELECT * FROM " + tableName + " WHERE IC = ?";
        CustomerInterface customer = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1,ic);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                customer = new Consumer(
                        rs.getString("CUSTID"),
                        rs.getString("NAME"),         
                        rs.getString("IC"),
                        rs.getString("GENDER").charAt(0),
                        rs.getString("CONTACT"),
                        rs.getDate("LASTORDERDATE")
                 
                );
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return customer;
    }
    
    public CustomerInterface getCorporateCustomer(String id){
        String queryStr = "SELECT * FROM " + "CORPORATE_CUSTOMER" + " WHERE CUSTID = ?";
        CustomerInterface customer;
        CorporateCustomerInterface corporateCustomer;
        customer = this.getConsumer(id);
        if(customer!=null){
            try{
            
                stmt = conn.prepareStatement(queryStr);
                stmt.setString(1,id);
                ResultSet rs = stmt.executeQuery();
                if(rs.next()){
                   corporateCustomer = new CorporateCustomer(
                            customer.getCustID(),
                            customer.getName(),
                            customer.getIc(),
                            customer.getGender(),
                            customer.getContact(),
                            customer.getLastOrderDate(),
                            rs.getString("COMPANYNAME"),
                            rs.getString("LOCATION"),
                            rs.getDouble("CREDITLIMIT"),
                            rs.getDouble("REMAININGCREDITLIMIT")
                 
                    );
                }
            
            }catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        return customer;
    }
    
    public CustomerInterface getCorporateCustomerByIC(String ic){
        String queryStr = "SELECT * FROM " + "CORPORATE_CUSTOMER" + " WHERE CUSTID = ?";
        CustomerInterface customer;
        CorporateCustomerInterface corporateCustomer;
        customer = this.getConsumerByIC(ic);
        if(customer!=null){
            try{
            
                stmt = conn.prepareStatement(queryStr);
                stmt.setString(1,customer.getCustID());
                ResultSet rs = stmt.executeQuery();
                if(rs.next()){
                   corporateCustomer = new CorporateCustomer(
                            customer.getCustID(),
                            customer.getName(),
                            customer.getIc(),
                            customer.getGender(),
                            customer.getContact(),
                            customer.getLastOrderDate(),
                            rs.getString("COMPANYNAME"),
                            rs.getString("LOCATION"),
                            rs.getDouble("CREDITLIMIT"),
                            rs.getDouble("REMAININGCREDITLIMIT")
                 
                    );
                }
            
            }catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        return customer;
    }
    
    public void updateConsumer(CustomerInterface customer){
        String updateStr = "UPDATE " + tableName + " SET "
                + " NAME = ?, IC = ?, GENDER = ?, CONTACT = ?, LASTORDERDATE = ? WHERE CUSTID = ?";
        try{
            stmt = conn.prepareStatement(updateStr);
            stmt.setString(6, customer.getCustID());
            stmt.setString(1, customer.getName());
            stmt.setString(2, customer.getIc());
            stmt.setString(3, String.valueOf(customer.getGender()));
            stmt.setString(4, customer.getContact());
            if(customer.getLastOrderDate()!=null)
                stmt.setDate(5, new java.sql.Date(customer.getLastOrderDate().getTime()));
            else
                stmt.setDate(5, null);

            stmt.executeUpdate();
            
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateCorporateCustomer(CorporateCustomerInterface corporateCustomer){
        String updateStr = "UPDATE " + "CORPORATE_CUSTOMER" + " SET "
                + " COMPANYNAME = ?, LOCATION = ?, CREDITLIMIT = ?, REMAININGCREDITLIMIT = ? WHERE CUSTID = ?";
        CustomerInterface customer = this.getConsumer(corporateCustomer.getCustID());
        this.updateConsumer(customer);
        try{
            stmt = conn.prepareStatement(updateStr);
            stmt.setString(5, corporateCustomer.getCustID());
            stmt.setString(1, corporateCustomer.getCompanyName());
            stmt.setString(2, corporateCustomer.getLocation());
            stmt.setDouble(3, corporateCustomer.getCreditLimit());
            stmt.setDouble(4, corporateCustomer.getRemainingCreditLimit());
            
            stmt.executeUpdate();
            
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public List<CustomerInterface> getAllConsumer(){
        String queryStr = "Select * FROM " + tableName + " WHERE CUSTID Like ? ";
        List<CustomerInterface> consumerList = new LinkedList();
        try{
                CustomerInterface consumer;
                stmt = conn.prepareStatement(queryStr);
                stmt.setString(1, "C%");
                ResultSet rs = stmt.executeQuery();
                while(rs.next()){
                    consumer = new Consumer(
                        rs.getString("CUSTID"),
                        rs.getString("NAME"),         
                        rs.getString("IC"),
                        rs.getString("GENDER").charAt(0),
                        rs.getString("CONTACT"),
                        rs.getDate("LASTORDERDATE")
                 
                    );
                    consumerList.add(consumer);
                }
        }catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return consumerList;
        
    }
    
    
    public List<CorporateCustomerInterface> getAllCorporateCustomer(){
        String queryStr = "Select * FROM " + tableName + " c,CORPORATE_CUSTOMER v WHERE c.CUSTID Like ? AND c.CUSTID = v.CUSTID";
        List<CorporateCustomerInterface> corporateCustomerList = new LinkedList();
        try{
                CorporateCustomerInterface corporateCustomer;
                stmt = conn.prepareStatement(queryStr);
                 stmt.setString(1, "V%");
                ResultSet rs = stmt.executeQuery();
                while(rs.next()){
                    corporateCustomer = new CorporateCustomer(
                        rs.getString("CUSTID"),
                        rs.getString("NAME"),         
                        rs.getString("IC"),
                        rs.getString("GENDER").charAt(0),
                        rs.getString("CONTACT"),
                        rs.getDate("LASTORDERDATE"),
                        rs.getString("COMPANYNAME"),
                        rs.getString("LOCATION"),
                        rs.getDouble("CREDITLIMIT"),
                        rs.getDouble("REMAININGCREDITLIMIT")
                 
                    );
                    corporateCustomerList.add(corporateCustomer);
                }
        }catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return corporateCustomerList;
        
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
