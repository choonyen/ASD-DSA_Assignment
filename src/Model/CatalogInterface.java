/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MSI GL62 6QF
 */
public interface CatalogInterface {
    
    public String getProdId();
    public void setProdId(String prodId);
    public String getName();
    public void setName(String name);
    public String getType();
    public void setType(String type);
    public Double getPrice();
    public void setPrice(Double price);
    public String getDescription();
    public void setDescription(String description);
    public int getStock();
    public void setStock(int stock);
}
