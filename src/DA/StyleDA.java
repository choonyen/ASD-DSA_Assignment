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
    
    public List<Style> getStyleList(){
        String queryStr = "SELECT * FROM " + tableName;
        List<Style> styleList = new ArrayList<Style>();
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
