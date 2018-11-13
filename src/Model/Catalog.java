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
public class Catalog {
    
    private String Prodid;
    private String Name;
    private String Type;
    private double Price;
    private int Stock;
  
    
    public Catalog(){
    }

    public Catalog(String Prodid, String Name, String Type,double Price, int Stock){
        this.Prodid = Prodid;
        this.Name = Name;
        this.Type = Type;
        this.Price = Price;
        this.Stock = Stock;
 
    }



    public String getProdid() {
        return Prodid;
    }

    public void setProdid(String Prodid) {
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

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }


}
