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
 * @author User
 */
public class CustomerOrderDA {
    
     private String host = "jdbc:derby://localhost:1527/DSA_Database";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "CUSTOMER_ORDER";
    private Connection conn;
    private PreparedStatement stmt;
    
    public CustomerOrderDA(){
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
    
        public List<CustomerOrder> getCustomerOrderList(){
        String queryStr = "SELECT * FROM " + tableName;
        List<CustomerOrder> list = new LinkedList<>();
        try{
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                CustomerOrder customerOrder = new CustomerOrder(
                        rs.getString("ORDERNO"),
                        rs.getString("CUSTID"),
                        rs.getDouble("TOTALAMOUNT"),
                        rs.getDate("ORDERDATE")
                );
                   list.add(customerOrder);
            }            
        }catch (SQLException ex) {
          ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }
    
    public List<CustomerOrderInterface> getALLCustomerOrder(){
        String queryStr = "SELECT * FROM " +tableName;
        List<CustomerOrderInterface> customerOrderList = new LinkedList();
        
        try{
            CustomerOrderInterface customerOrder;
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                customerOrder = new CustomerOrder(
                        rs.getString("ORDERNO"),
                        rs.getString("CUSTID"),
                        rs.getDouble("TOTALAMOUNT"),
                        rs.getDate("ORDERDATE")
                );      
            customerOrderList.add(customerOrder);
            }
        }catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
    }
        
        return customerOrderList;
    }
    
    public void addCustomerOrder(CustomerOrderInterface customerOrder){
        String insertStr = "INSERT INTO " + tableName + " VALUES(?,?,?,?)";
        try{
            stmt = conn.prepareStatement(insertStr);
            stmt.setString(1, customerOrder.getOrderNo());
            stmt.setString(2, customerOrder.getCustId());
            stmt.setDouble(3, customerOrder.getTotalAmount());
            stmt.setDate(4, new java.sql.Date(customerOrder.getOrderDate().getTime()));
            
            stmt.executeUpdate();
            
            
        }catch (SQLException ex) {
                        ex.printStackTrace();

            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
   public CustomerOrderInterface getCustomerOrderByNo(String id){
         String queryStr = "SELECT * FROM " + tableName + " WHERE ORDERNO = ?";
         CustomerOrderInterface customerOrder = null;
         try{
             stmt = conn.prepareStatement(queryStr);
             stmt.setString(1, id);
             ResultSet rs = stmt.executeQuery();
             if(rs.next()){
                 customerOrder = new CustomerOrder(
                        rs.getString("ORDERNO"),
                        rs.getString("CUSTID"),
                        rs.getDouble("TOTALAMOUNT"),
                        rs.getDate("ORDERDATE")
                );
             }
         }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return customerOrder;
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
