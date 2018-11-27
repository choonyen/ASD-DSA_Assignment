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
public class FlowerDA {
    private String host = "jdbc:derby://localhost:1527/DSA_Database";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "CUSTOM_FLOWER";
    private Connection conn;
    private PreparedStatement stmt;
    
    public FlowerDA()
    {
        createConnection();
    }
    
    public List<Flower> getFlowerList(){
        String queryStr = "SELECT * FROM " + tableName;
        List<Flower> flowerList = new ArrayList<>();
        try{
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Flower flower = null;
                flower = new Flower(
                        rs.getString("FLOWERNO"),
                        rs.getString("FLOWERNAME"),
                        rs.getDouble("PRICE")
                );
                flowerList.add(flower);
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return flowerList;
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
