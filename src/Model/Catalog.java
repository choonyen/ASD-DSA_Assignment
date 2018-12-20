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
public class Catalog implements CatalogInterface{
    
    private String prodId;
    private String name;
    private String type;
    private double price;
    private String description;
    private int stock;
  
    
    public Catalog(){
    }

    public Catalog(String prodId, String name, String type,double price,String description, int stock){
        this.prodId = prodId;
        this.name = name;
        this.type = type;
        this.price = price;
        this.description = description;
        this.stock = stock;
 
    }

    @Override
    public String getProdId() {
        return prodId;
    }

    @Override
    public void setProdId(String ProdId) {
        this.prodId = prodId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice(Double price) {
        this.price = price;
    }
    
    @Override
      public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void setStock(int stock) {
        this.stock = stock;
    }
}

