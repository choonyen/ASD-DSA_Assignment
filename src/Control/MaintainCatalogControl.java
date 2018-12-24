package Control;

import Model.*;
import DA.*;
import java.util.Date;
import javax.swing.*;

import java.util.Iterator;

/**
 *
 * @author Choonyen
 */
public class MaintainCatalogControl {

    private static List<CatalogInterface> CATALOG_LIST;
    private static int CATALOG_COUNT;
    private static List<PromotionInterface> PROMOTION_LIST;
    private static List<PromotionCatalog> PROMOTION_CATALOG_LIST;
    private static int PROMOTION_COUNT;
    private CatalogDA catalogDA;
    private CountDA countDA;
    private PromotionCatalogDA promotioncatalogDA;
    private PromotionDA promotionDA;

    public MaintainCatalogControl() {

        catalogDA = new CatalogDA();
        countDA = new CountDA();
        promotionDA = new PromotionDA();
        promotioncatalogDA = new PromotionCatalogDA();
        CATALOG_COUNT = countDA.getCount().getProductCount();
        CATALOG_LIST = catalogDA.getAllCatalog();
        PROMOTION_COUNT = countDA.getCount().getPromotionCount();
        PROMOTION_LIST = promotionDA.getAllPromotion();
        PROMOTION_CATALOG_LIST = promotioncatalogDA.getAllPromotionCatalog();

    }

    public List<CatalogInterface> getAllCatalog() {
        return CATALOG_LIST;
    }

    public CatalogInterface createCatalog(String name, String type, double price, String description, int stock) {
        String Prodid = "P" + String.format("%03d", CATALOG_COUNT);
        return new Catalog(Prodid, name, type, price, description, stock);
    }

    public void addCatalog(CatalogInterface catalog) {
        CATALOG_LIST.add(catalog);
        CATALOG_COUNT++;
    }

    public CatalogInterface getCatalogById(String id) {
        Iterator<CatalogInterface> catalogList = CATALOG_LIST.getIterator();
        CatalogInterface result = null;
        while (catalogList.hasNext()) {
            CatalogInterface catalog = catalogList.next();
            if (catalog.getProdID().equals(id)) {
                result = catalog;
                break;
            }

        }
        return result;
    }

    public void updateCatalog(CatalogInterface catalog) {
        CatalogInterface oldCatalog = this.getCatalogById(catalog.getProdID());
        CATALOG_LIST.edit(oldCatalog, catalog);

    }

    public List<PromotionInterface> getAllPromotion() {
        return PROMOTION_LIST;
    }

    public PromotionInterface createPromotion(Date StartDate, Date EndDate) {
        String Promoid = "M" + String.format("%03d", PROMOTION_COUNT);
        return new Promotion(Promoid, StartDate, EndDate);
    }

    public void addPromotion(PromotionInterface promotion) {
        PROMOTION_LIST.add(promotion);
        PROMOTION_COUNT++;
    }

    public PromotionInterface getPromotionById(String id) {
        Iterator<PromotionInterface> catalogList = PROMOTION_LIST.getIterator();
        PromotionInterface result = null;
        while (catalogList.hasNext()) {
            PromotionInterface catalog = catalogList.next();
            if (catalog.getPromoID().equals(id)) {
                result = catalog;
                break;
            }

        }
        return result;
    }

    public void updatePromotion(PromotionInterface promotion) {
        PromotionInterface oldpromotion = this.getPromotionById(promotion.getPromoID());
        PROMOTION_LIST.edit(oldpromotion, promotion);

    }

    public void addPromotionCatalog(PromotionInterface p, List<PromotionCatalog> c) {
        PROMOTION_LIST.add(p);
        Iterator<PromotionCatalog> promotionCatalogList = c.getIterator();
        while (promotionCatalogList.hasNext()) {
            PROMOTION_CATALOG_LIST.add(promotionCatalogList.next());

        }

    }
    
    public List<PromotionCatalog> getAllPromotionCatalog() {
        return PROMOTION_CATALOG_LIST;
    }

    public String isValid(String name, String type, double price, String description, int stock) {
        String errorMsg = "";

        if (name.equals("")) {
            errorMsg += "*Name cannot be empty.\n";
        }
        if (type.equals("")) {
            errorMsg += "*Type No cannot be empty.\n";
        }
        if (description.equals("")) {
            errorMsg += "*description cannot be empty.\n";
        }
        if ("".equals(price)) {
            errorMsg += "*description cannot be empty.\n";
        }
        if("".equals(stock)){
            errorMsg += "*Stock cannot be empty.\n";
                }

        return errorMsg;
    }
   

    public void updateDatabase() {
        Iterator<CatalogInterface> catalogList = CATALOG_LIST.getIterator();
        while (catalogList.hasNext()) {
            CatalogInterface catalog = catalogList.next();
            if (catalogDA.getCatalog(catalog.getProdID()) != null) {
                catalogDA.updateCatalog(catalog);
            } else {
                catalogDA.addCatalog(catalog);
            }
        }
        Iterator<PromotionInterface> promotionList = PROMOTION_LIST.getIterator();
        while (promotionList.hasNext()) {
            PromotionInterface promotion = promotionList.next();
            if (promotionDA.getPromotion(promotion.getPromoID()) != null) {
                promotionDA.updatePromotion(promotion);
            } else {
                promotionDA.addPromotion(promotion);
            }
        }
        Iterator<PromotionCatalog> promotioncatalogList = PROMOTION_CATALOG_LIST.getIterator();
        while (promotioncatalogList.hasNext()) {
            PromotionCatalog promotion = promotioncatalogList.next();
           
            if (promotioncatalogDA.getPromotionCatalog(promotion.getPromotion().getPromoID(),promotion.getCatalog().getProdID()) == null) {
                
                promotioncatalogDA.addPromotionCatalog(promotion);
            }
        }
     
        countDA.increaseCatalogCount(CATALOG_COUNT);
        countDA.increasePromotionCount(PROMOTION_COUNT);

    }
    
   

    public boolean prodIdValidation(String Prodid) {
        if (Prodid.length() != 4 || (Prodid.charAt(0) != 'P')
                || !Character.isDigit(Prodid.charAt(1)) || !Character.isDigit(Prodid.charAt(2))
                || !Character.isDigit(Prodid.charAt(3))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean promoIdValidation(String Promoid) {
        if (Promoid.length() != 4 || (Promoid.charAt(0) != 'M')
                || !Character.isDigit(Promoid.charAt(1)) || !Character.isDigit(Promoid.charAt(2))
                || !Character.isDigit(Promoid.charAt(3))) {
            return false;
        } else {
            return true;
        }
    }

}
