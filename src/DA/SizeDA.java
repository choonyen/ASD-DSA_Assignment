/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;
import Model.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Choonyen
 */
public class SizeDA {
    private String host = "jdbc:derby://localhost:1527/DSA_Database";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "CUSTOM_SIZE";
    private Connection conn;
    private PreparedStatement stmt;
    
    public SizeDA()
    {
        createConnection();
    }
    
    public CustomizedList<Size> getSizeList(){
        String queryStr = "SELECT * FROM " + tableName;
        CustomizedList<Size> sizeList = new CustomizedLinkedList();
        try{
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Size size = null;
                size = new Size(
                        rs.getString("SIZECODE").charAt(0),
                        rs.getDouble("SIZE"),
                        rs.getDouble("ADDITIONFEE")
                );
                sizeList.add(size);
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return sizeList;
    }
    
    public Size getSizeById(String id){
        String queryStr = "SELECT * FROM " + tableName + " WHERE SIZECODE = ?";
        Size size = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1,id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                size = new Size(
                        rs.getString("SIZECODE").charAt(0),
                        rs.getDouble("SIZE"),
                        rs.getDouble("ADDITIONFEE")
                );
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return size;
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
