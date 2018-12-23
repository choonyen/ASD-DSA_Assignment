/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LokeCY
 */
public interface CustomizedFloralInterface { //An Entity ADT for customized Floral Arrangement
    
    // Getter and Setter for the attribute of the customized Floral Arrangement.
    public String getOrderID();
    public void setOrderID(String orderID);
    public String getCustID();
    public void setCustID(String custID);
    public String getStyleNo();
    public void setStyleNo(String styleNo);
    public char getSizeCode();
    public void setSizeCode(char sizeCode);
    public String getFlowerNo();
    public void setFlowerNo(String flowerNo);
    public String getAccessoryNo();
    public void setAccessoryNo(String accessoryNo);
    public double getPrice();
    public void setPrice(double price);
    public String getPriority();
    public void setPriority(String priority);
}
