/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;

import Model.Catalog;
import Model.CatalogInterface;
import Model.CustomerOrder;
import Model.CustomerOrderInterface;
import Model.LinkedList;
import Model.OrderList;
import Model.OrderListInterface;
import Model.Payment;
import Model.PaymentInterface;
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
public class PaymentDA {
    private String host = "jdbc:derby://localhost:1527/DSA_Database";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "PAYMENT";
    private String tableName1 = "CUSTOMER_ORDER";
    private String tableName2 = "ORDER_LIST";
    private String tableName3 = "CATALOG";
    private Connection conn;
    private PreparedStatement stmt;
    
    public PaymentDA(){
        createConnection();
    }
    
    public void addPayment(PaymentInterface payment){
        String queryStr = "INSERT INTO " +tableName +" VALUES(?,?,?)";
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, payment.getPaymentNo());
            stmt.setString(2, payment.getOrderNo());
            stmt.setDate(3, new java.sql.Date(payment.getPaymentDate().getTime()));
            
            stmt.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public PaymentInterface checkPayment(String orderNo){
        String queryStr = "SELECT * FROM " +tableName +" WHERE ORDERNO = ?";
        PaymentInterface payment = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, orderNo);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                payment = new Payment(
                        rs.getString("PAYMENTNO"),
                        rs.getString("ORDERNO"),
                        rs.getDate("PAYMENTDATE")
                );
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return payment;
    }
    
    public CustomerOrderInterface getPayment(String orderNo){
        String queryStr = "SELECT * FROM " +tableName1 +" WHERE ORDERNO = ?";
        CustomerOrderInterface customerOrder = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, orderNo);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                customerOrder = new CustomerOrder(
                        rs.getString("ORDERNO"),
                        rs.getString("CUSTID"),
                        rs.getDouble("TOTALAMOUNT"),
                        rs.getDate("ORDERDATE")
                );
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return customerOrder;
    }
    
    public OrderListInterface getProductId(String orderNo){         //use to get the product id with orderNo in order to get the name of product
        String queryStr = "SELECT * FROM " +tableName2 +" WHERE ORDERNO = ?";
        OrderListInterface orderList = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, orderNo);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                orderList = new OrderList(
                        rs.getString("ORDERNO"),
                        rs.getString("PRODID"),
                        rs.getInt("QUANTITY"),
                        rs.getDouble("AMOUNT")
                );
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return orderList;
    }
    
    public CatalogInterface getProductName(String prodId){          //use to get the product name with product id which get by the function above
        String queryStr = "SELECT * FROM " +tableName3 +" WHERE PRODID = ?";
        CatalogInterface catalog = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, prodId);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                catalog = new Catalog(
                        rs.getString("PRODID"),
                        rs.getString("NAME"),
                        rs.getString("TYPE"),
                        rs.getDouble("PRICE"),
                        rs.getString("DESCRIPTION"),
                        rs.getInt("STOCK")
                );
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return catalog;
    }
    
    public List<PaymentInterface> getAllPayment(){
        String queryStr = "SELECT * FROM " +tableName;
        List<PaymentInterface> paymentList = new LinkedList();
        try{
            PaymentInterface payment;
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                payment = new Payment(
                        rs.getString("PAYMENTNO"),
                        rs.getString("ORDERNO"),
                        rs.getDate("PAYMENTDATE")
                );
                paymentList.add(payment);
            }
        }catch(SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return paymentList;
    }
    
    public List<CustomerOrderInterface> getAllCustomerOrder(){
        String queryStr = "SELECT * FROM " +tableName1;
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
            
        }catch(SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return customerOrderList;
    }
    
    public List<OrderListInterface> getAllOrderList(){     //use to get all record in order_list table
        String queryStr = "SELECT * FROM " +tableName2;
        List<OrderListInterface> orderListList = new LinkedList();
        try{
            OrderListInterface orderList;
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                orderList = new OrderList(
                        rs.getString("ORDERNO"),
                        rs.getString("PRODID"),
                        rs.getInt("QUANTITY"),
                        rs.getDouble("AMOUNT")
                );
                orderListList.add(orderList);
            }
        }catch(SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return orderListList;
    }
    
    public List<CatalogInterface> getAllCatalog(){           //use to get all record in catalog 
        String queryStr = "SELECT * FROM " +tableName3;
        List<CatalogInterface> catalogList = new LinkedList();
        try{
            CatalogInterface catalog;
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
             while(rs.next()){
                catalog = new Catalog(
                        rs.getString("PRODID"),
                        rs.getString("NAME"),
                        rs.getString("TYPE"),
                        rs.getDouble("PRICE"),
                        rs.getString("DESCRIPTION"),
                        rs.getInt("STOCK")
                );
                catalogList.add(catalog);
            }
        }catch(SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return catalogList;
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
