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
    
    public List<Size> getSizeList(){
        String queryStr = "SELECT * FROM " + tableName;
        List<Size> sizeList = new ArrayList<Size>();
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