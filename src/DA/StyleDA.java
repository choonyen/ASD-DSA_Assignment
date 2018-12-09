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
public class StyleDA {
    private String host = "jdbc:derby://localhost:1527/DSA_Database";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "CUSTOM_ARRANGEMENTSTYLE";
    private Connection conn;
    private PreparedStatement stmt;
    
    public StyleDA()
    {
        createConnection();
    }
    
    public CustomizedList<Style> getStyleList(){
        String queryStr = "SELECT * FROM " + tableName;
        CustomizedList<Style> styleList = new CustomizedLinkedList();
        try{
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Style style = null;
                style = new Style(
                        rs.getString("STYLENO"),
                        rs.getString("STYLENAME"),
                        rs.getDouble("PRICE"),
                        rs.getString("DESCRIPTION")
                );
                styleList.add(style);
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return styleList;
    }
    
    public Style getStyleById(String id){
        String queryStr = "SELECT * FROM " + tableName + " WHERE STYLENO = ?";
        Style style = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1,id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                style = new Style(
                        rs.getString("STYLENO"),
                        rs.getString("STYLENAME"),
                        rs.getDouble("PRICE"),
                        rs.getString("DESCRIPTION")
                );
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return style;
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
