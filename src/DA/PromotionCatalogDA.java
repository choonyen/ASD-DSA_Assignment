/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;

import Model.Catalog;
import Model.LinkedList;
import Model.List;
import Model.Promotion;
import Model.PromotionCatalog;
import Model.PromotionInterface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lamzn
 */
public class PromotionCatalogDA {
    private String host = "jdbc:derby://localhost:1527/DSA_Database";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "PROMOTION_CATALOG";
    private Connection conn;
    private PreparedStatement stmt;

    public PromotionCatalogDA() {
        createConnection();
    }

    public PromotionCatalog getPromotionCatalog(String promoId, String prodId) {
        String queryStr = "SELECT * FROM " + tableName + " WHERE PROMOID = ? AND PRODID = ?";
        PromotionCatalog promotion = null;
        try {
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, promoId);
            stmt.setString(2, prodId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                promotion = new PromotionCatalog(
                        new Promotion(rs.getString("PROMOID")),
                        new Catalog(rs.getString("PRODID")),
                        rs.getDouble("PRICE")
                );
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return promotion;
    }

    public void addPromotionCatalog(PromotionCatalog promotion) {
        String insertStr = "INSERT INTO " + tableName + " VALUES(?,?,?)";

        try {
            stmt = conn.prepareStatement(insertStr);
            stmt.setString(1, promotion.getPromotion().getPromoID());
            stmt.setString(2, promotion.getCatalog().getProdID());
            stmt.setDouble(3, promotion.getPrice());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
      public void updatePromotionCatalog(PromotionCatalog promotion) {
        String updateStr = "UPDATE " + tableName + " SET "
                + " PRICE = ? WHERE PROMOID = ? and PRODID = ?";
        try {
            stmt = conn.prepareStatement(updateStr);
            stmt.setString(2, promotion.getPromotion().getPromoID());
            stmt.setString(3, promotion.getCatalog().getProdID());
            stmt.setDouble(1, promotion.getPrice());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

   

    public List<PromotionCatalog> getAllPromotionCatalog() {
        String queryStr = "Select * FROM " + tableName + " WHERE PROMOID Like ? ";
        List<PromotionCatalog> catalogList = new LinkedList();
        try {
            PromotionCatalog promotion;
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, "M%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                promotion = new PromotionCatalog(
                       new Promotion(rs.getString("PROMOID")),
                       new Catalog(rs.getString("PRODID")),
                        rs.getDouble("PRICE")
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


