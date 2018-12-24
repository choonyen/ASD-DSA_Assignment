/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author lamzn
 */
public class PromotionCatalog{
    
    private PromotionInterface promotion;
    private CatalogInterface catalog;
    private double price;

    public PromotionCatalog(PromotionInterface promotion, CatalogInterface catalog, double price) {
        this.promotion = promotion;
        this.catalog = catalog;
        this.price = price;
    }

    public PromotionInterface getPromotion() {
        return promotion;
    }

    public void setPromotion(PromotionInterface promotion) {
        this.promotion = promotion;
    }

    public CatalogInterface getCatalog() {
        return catalog;
    }

    public void setCatalog(CatalogInterface catalog) {
        this.catalog = catalog;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    
}
