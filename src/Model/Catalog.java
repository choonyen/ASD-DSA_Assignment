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
    
    private String Prodid;
    private String Name;
    private String Type;
    private double Price;
    private String Description;
    private int Stock;
  
    
    public Catalog(){
    }

    public Catalog(String Prodid) {
        this.Prodid = Prodid;
    }

    public Catalog(String Prodid, String Name, String Type,double Price,String Description, int Stock){
        this.Prodid = Prodid;
        this.Name = Name;
        this.Type = Type;
        this.Price = Price;
        this.Description = Description;
        this.Stock = Stock;
 
    }



    public String getProdID() {
        return Prodid;
    }

    public void setProdID(String Prodid) {
        this.Prodid = Prodid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
      public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }


}

