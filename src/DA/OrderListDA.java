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
public class OrderListDA {
    
    private String host = "jdbc:derby://localhost:1527/DSA_Database";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "ORDER_LIST";
    private Connection conn;
    private PreparedStatement stmt;
    
    public OrderListDA(){
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
    
    public List<OrderList> getOrderList(){
        String queryStr = "SELECT * FROM " + tableName;
       List<OrderList> list = new LinkedList<>();

        try{
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                OrderList orderList = new OrderList(
                        rs.getString("ORDERNO"),
                        rs.getString("PRODID"),
                        rs.getInt("QUANTITY"),
                        rs.getDouble("AMOUNT")
                );
                   list.add(orderList);
            }            
        }catch (SQLException ex) {
          ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }
    
    public List<OrderListInterface> getALLOrderList(){
        String queryStr = "SELECT * FROM " +tableName;
        List<OrderListInterface> OrderListList = new LinkedList();
        try{
            OrderListInterface orderList;
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                orderList = new OrderList(
                        rs.getString("ORDERNO"),
                        rs.getString("PRODID"),
                        rs.getInt("QUANTITY"),
                        rs.getDouble("AMOUNT"));
                OrderListList.add(orderList);
            }             
        } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
    }
        return OrderListList;
    }
    
             
    
    public void addOrderList(OrderListInterface orderList){
        String insertStr = "INSERT INTO " + tableName + " VALUES(?,?,?,?)";
        try{
            stmt = conn.prepareStatement(insertStr);
            stmt.setString(1, orderList.getOrderNo());
            stmt.setString(2, orderList.getProdId());
            stmt.setInt(3, orderList.getQuantity());
            stmt.setDouble(4, orderList.getAmount() );
            
            stmt.executeUpdate();
            
            
        }catch (SQLException ex) {
                        ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public OrderListInterface getOrderListByOrderNo (String orderId, String prodId){
         String queryStr = "SELECT * FROM " + tableName + " WHERE ORDERNO = ? AND PRODID = ?";
         OrderListInterface orderList = null;
         try{
             stmt = conn.prepareStatement(queryStr);
             stmt.setString(1, orderId);
             stmt.setString(2, prodId);
             ResultSet rs = stmt.executeQuery();
             if(rs.next()){
                 orderList = new OrderList(
                         rs.getString("ORDERNO"),
                        rs.getString("PRODID"),
                        rs.getInt("QUANTITY"),
                        rs.getDouble("AMOUNT"));
             }
         }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return orderList;
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
