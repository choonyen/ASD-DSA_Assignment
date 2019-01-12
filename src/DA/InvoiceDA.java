/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;

import Model.Invoice;
import Model.CorporateCustomer;
import Model.CorporateCustomerInterface;
import Model.LinkedList;
import Model.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class InvoiceDA {
    private String host = "jdbc:derby://localhost:1527/DSA_Database";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "INVOICE";
    private Connection conn;
    private PreparedStatement stmt;
    
    public InvoiceDA(){
        createConnection();
    }
    
    public void addInvoice(Invoice invoice){
        String insertStr = "INSERT INTO " + tableName + " VALUES(?,?,?,?,?)";
        
        try{
            stmt = conn.prepareStatement(insertStr);
            stmt.setString(1, invoice.getInvoiceNo());
            stmt.setString(2, invoice.getCustomer().getCustID());
            stmt.setDouble(3, invoice.getAmount());
            stmt.setDate(4, new java.sql.Date(invoice.getGeneratedDate().getTime()));
            stmt.setBoolean  (5, invoice.getIsPaid());
            
            stmt.executeUpdate();
            
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    public Invoice getInvoice(String id){
        String queryStr = "SELECT * FROM " + tableName + " WHERE INVOICENO = ?";
        Invoice invoice = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1,id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                invoice = new Invoice(
                        rs.getString("INVOICENO"),
                        new CorporateCustomer(rs.getString("CUSTID")),         
                        rs.getDouble("amount"),
                        rs.getDate("GENERATEDDATE"),
                        rs.getBoolean("ISPAID")
                 
                );
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return invoice;
    }
    
    
    
    public void updateInvoice(Invoice invoice){
        String updateStr = "UPDATE " + tableName + " SET "
                + " CUSTID = ?, AMOUNT = ?, GENERATEDDATE = ?, ISPAID = ? WHERE INVOICENO = ?";
        try{
            stmt = conn.prepareStatement(updateStr);
            stmt.setString(5, invoice.getInvoiceNo());
            stmt.setString(1, invoice.getCustomer().getCustID());
            stmt.setDouble(2, invoice.getAmount());
            stmt.setDate(3, new java.sql.Date(invoice.getGeneratedDate().getTime()));
            stmt.setBoolean  (4, invoice.getIsPaid());
            stmt.executeUpdate();
            
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    public List<Invoice> getAllInvoice(){
        String queryStr = "Select * FROM " + tableName ;
        List<Invoice> invoiceList = new LinkedList();
        try{
                Invoice invoice;
                stmt = conn.prepareStatement(queryStr);
                ResultSet rs = stmt.executeQuery();
                while(rs.next()){
                    invoice = new Invoice(
                        rs.getString("INVOICENO"),
                        new CorporateCustomer(rs.getString("CUSTID")),         
                        rs.getDouble("amount"),
                        rs.getDate("GENERATEDDATE"),
                        rs.getBoolean("ISPAID")
                 
                    );
                    invoiceList.add(invoice);
                }
        }catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return invoiceList;
        
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
