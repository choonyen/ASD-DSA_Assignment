/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Choonyen
 */
public class CustomizedFloral {
    
    private String orderID;
    private String custID;
    private String arrStyle;
    private String arrSize;
    private String flower;
    private String accessories;
    private double price;
    private String priority;
    
    public CustomizedFloral(String custID,String orderID, String arrStyle,String arrSize, String flower, String accessories, double price, String priority)
    {
        this.custID = custID;
        this.orderID = orderID;    
        this.arrStyle = arrStyle;
        this.arrSize = arrSize;
        this.flower = flower;
        this.accessories = accessories;
        this.price = price;
        this.priority = priority;      
    }
    
    public String getCustID()
    {
        return custID;
    }
    
    public void setCustID(String custID)
    {
        this.custID = custID;
    }
    
    public String getOrderID()
    {
        return orderID;
    }
    
    public void setOrderID(String orderID)
    {
        this.orderID = orderID;
    }
    
    public String getStyle()
    {
        return arrStyle;
    }
    
    public void setStyle(String arrStyle)
    {
        this.arrStyle = arrStyle;
    }
    
    public String getSize()
    {
        return arrSize;
    }
    
    public void setSize(String arrSize)
    {
        this.arrSize = arrSize;
    }
    
    public String getFlower()
    {
        return flower;
    }
    
    public void setFlower(String flower)
    {
        this.flower = flower;
    }
    
    public String getAccessories()
    {
        return accessories;
    }
    
    public void setAccessories(String accessories)
    {
        this.accessories = accessories;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public String getPriority()
    {
        return priority;
    }
    
    public void setPriority(String Priority)
    {
        this.priority = priority;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
