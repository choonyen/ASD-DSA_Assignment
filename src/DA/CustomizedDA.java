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
 * @author Choonyen
 */
public class CustomizedDA {
    private String host = "jdbc:derby://localhost:1527/DSA_Database";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "CUSTOM_ORDER";
    private Connection conn;
    private PreparedStatement stmt;
    
    public CustomizedDA()
    {
        createConnection();
    }
    
    
    public List<CustomizedFloralInterface> getCustomizedOrder(){
        String queryStr = "SELECT * FROM " + tableName;
        List<CustomizedFloralInterface> custFloralList = new LinkedList();
        try{
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                CustomizedFloralInterface custFloral = null;
                custFloral = new CustomizedFloral(
                        rs.getString("CUSTOMORDERNO"),
                        rs.getString("CUSTID"),
                        rs.getString("STYLENO"),
                        rs.getString("SIZECODE").charAt(0),
                        rs.getString("FLOWERNO"),
                        rs.getString("ACCESSORYNO"),
                        rs.getDouble("PRICE"),
                        rs.getString("PRIORITY")
                );
                custFloralList.add(custFloral);
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return custFloralList;
        
    }
    
    public CustomizedFloralInterface getOrderCustomer(String id){
        String queryStr = "SELECT * FROM " + tableName + " WHERE CUSTID = ?";
        CustomizedFloralInterface custFloral = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1,id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                custFloral = new CustomizedFloral(
                        rs.getString("CUSTOMORDERNO"),
                        rs.getString("CUSTID"),
                        rs.getString("STYLENO"),
                        rs.getString("SIZECODE").charAt(0),
                        rs.getString("FLOWERNO"),
                        rs.getString("ACCESSORYNO"),
                        rs.getDouble("PRICE"),
                        rs.getString("PRIORITY")
                 
                );
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return custFloral;
    }
    
    public CustomizedFloralInterface getOrderCust(String id){
        String queryStr = "SELECT * FROM " + tableName + " WHERE CUSTOMORDERNO = ?";
        CustomizedFloralInterface custFloral = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1,id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                custFloral = new CustomizedFloral(
                        rs.getString("CUSTOMORDERNO"),
                        rs.getString("CUSTID"),
                        rs.getString("STYLENO"),
                        rs.getString("SIZECODE").charAt(0),
                        rs.getString("FLOWERNO"),
                        rs.getString("ACCESSORYNO"),
                        rs.getDouble("PRICE"),
                        rs.getString("PRIORITY")
                 
                );
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return custFloral;
    }
    
    public void addCustOrder(CustomizedFloralInterface custFloral){
        String insertStr = "INSERT INTO " + tableName + " VALUES(?,?,?,?,?,?,?,?)";
        try{
            stmt = conn.prepareStatement(insertStr);
            stmt.setString(1, custFloral.getOrderID());
            stmt.setString(2, custFloral.getCustID());
            stmt.setString(3, custFloral.getStyleNo());
            stmt.setString(4, String.valueOf(custFloral.getSizeCode()));
            stmt.setString(5, custFloral.getFlowerNo());
            stmt.setString(6, custFloral.getAccessoryNo());
            stmt.setDouble(7, custFloral.getPrice());
            stmt.setString(8, custFloral.getPriority());
            
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

