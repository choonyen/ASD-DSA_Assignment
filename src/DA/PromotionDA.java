/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;

import Model.LinkedList;
import Model.Promotion;
import Model.PromotionInterface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Model.List;

/**
 *
 * @author lamzn
 */
public class PromotionDA {

    private final String host = "jdbc:derby://localhost:1527/DSA_Database";
    private final String user = "nbuser";
    private final String password = "nbuser";
    private final String tableName = "PROMOTION";
    private Connection conn;
    private PreparedStatement stmt;

    public PromotionDA() {
        createConnection();
    }

    public PromotionInterface getPromotion(String id) {
        String queryStr = "SELECT * FROM " + tableName + " WHERE PROMOID = ?";
        PromotionInterface promotion = null;
        try {
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                promotion = new Promotion(
                        rs.getString("PROMOID"),
                        rs.getDate("STARTDATE"),
                        rs.getDate("ENDDATE")
                );
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return promotion;
    }

    public void addPromotion(PromotionInterface promotion) {
        String insertStr = "INSERT INTO " + tableName + " VALUES(?,?,?)";

        try {
            stmt = conn.prepareStatement(insertStr);
            stmt.setString(1, promotion.getPromoID());
            stmt.setDate(2, new java.sql.Date((promotion.getStartDate().getTime())));
            stmt.setDate(3, new java.sql.Date((promotion.getEndDate().getTime())));
            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updatePromotion(PromotionInterface promotion) {
        String updateStr = "UPDATE " + tableName + " SET "
                + " STARTDATE = ?, ENDDATE = ? WHERE PROMOID = ?";
        try {
            stmt = conn.prepareStatement(updateStr);
            stmt.setString(3, promotion.getPromoID());
            stmt.setDate(1, new java.sql.Date((promotion.getStartDate().getTime())));
            stmt.setDate(2, new java.sql.Date((promotion.getEndDate().getTime())));

            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<PromotionInterface> getAllPromotion() {
        String queryStr = "Select * FROM " + tableName + " WHERE PROMOID Like ? ";
        List<PromotionInterface> catalogList = new LinkedList();
        try {
            PromotionInterface promotion;
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, "P%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                promotion = new Promotion(
                        rs.getString("PROMOID"),
                        rs.getDate("STARTDATE"),
                        rs.getDate("ENDDATE")
                );
                catalogList.add(promotion);
            }
        } catch (SQLException ex) {
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
