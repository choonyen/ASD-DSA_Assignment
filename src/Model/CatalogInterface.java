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
public interface CatalogInterface {
    
    
    public void setProdID(String prodid); 
    public String getProdID();
    public String getName();
    public void setName(String name) ;
    public String getType() ;
    public void setType(String type) ;
    public double getPrice() ;
    public void setPrice(double price) ;
    public String getDescription() ;
    public void setDescription(String description) ;
    public int getStock() ;
    public void setStock(int stock) ;
    
  
        
    
}
