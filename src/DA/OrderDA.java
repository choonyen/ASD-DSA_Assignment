/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;

import Model.Catalog;
import Model.Count;
import Model.CustomerOrder;
import Model.CustomizedFloral;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class OrderDA {
             
    private String host = "jdbc:derby://localhost:1527/DSA_Database";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "CUSTOMER_ORDER1";
    private Connection conn;
    private PreparedStatement stmt;
    
    public OrderDA(){
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
    
     public LinkedList<CustomerOrder> getOrderList(){
        String queryStr = "SELECT * FROM " + tableName;
        LinkedList<CustomerOrder> list = new LinkedList<CustomerOrder>();
        try{
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
//            while(rs.next()){
//                CustomerOrder customerOrder = new CustomerOrder(
//                        rs.getString("ORDERNO"),
//                        rs.getString("CUSTID"),
//                        rs.getDouble("TOTALAMOUNT"),
//                       // rs.("ORDERDATE"),
//                        null,
//                        rs.getString("PAYMENT_TYPE")
//                );
//                   list.add(customerOrder);
//            }            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }
     
       public void addCustOrder(CustomerOrder order){
        String insertStr = "INSERT INTO " + tableName + " VALUES(?,?,?,CURRENT_DATE,?)";
        try{
            stmt = conn.prepareStatement(insertStr);
            stmt.setString(1, order.getOrderNo());
            stmt.setString(2, order.getCustomerId());
            stmt.setDouble(3, order.getTotalAmount());
    //        stmt.setString(4, order.getPaymentType());
            
            stmt.executeUpdate();
            
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
       
   public int getCount(){
        String queryStr = "SELECT count(1) FROM " + tableName;
        try{
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
               return rs.getInt(1);
            }            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }
}
