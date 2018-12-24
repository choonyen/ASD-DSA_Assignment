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
        List<Flower> flowerList = new LinkedList();
        try{
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Flower flower = null;
                flower = new Flower(
                        rs.getString("FLOWERNO"),
                        rs.getString("FLOWERNAME"),
                        rs.getString("FLOWERDESCRIPTION"),
                        rs.getDouble("PRICE")
                );
                flowerList.add(flower);
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return flowerList;
    }
    
    public Flower getFlowerById(String id){
        String queryStr = "SELECT * FROM " + tableName + " WHERE FLOWERNO = ?";
        Flower flower = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1,id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                flower = new Flower(
                        rs.getString("FLOWERNO"),
                        rs.getString("FLOWERNAME"),
                        rs.getString("FLOWERDESCRIPTION"),
                        rs.getDouble("PRICE")
                );
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return flower;
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
