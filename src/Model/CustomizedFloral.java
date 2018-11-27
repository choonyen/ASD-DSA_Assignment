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
    private String styleNo;
    private String sizeCode;
    private String flowerNo;
    private String accessoryNo;
    private double price;
    private String priority;
    
    public CustomizedFloral(){}
    
    public CustomizedFloral(String orderID, String custID, String styleNo, String sizeCode, double price)
    {
        this.orderID = orderID;
        this.custID = custID;
        this.styleNo = styleNo;
        this.sizeCode = sizeCode;
        this.price = price;
    }
    
    public CustomizedFloral(String orderID, String custID, String styleNo, String sizeCode, String flowerNo, String accessoryNo, double price)
    {
        this.orderID = orderID;
        this.custID = custID;
        this.styleNo = styleNo;
        this.sizeCode = sizeCode;
        this.flowerNo = flowerNo;
        this.accessoryNo = accessoryNo;
        this.price = price;
    }

    public CustomizedFloral(String orderID, String custID, String styleNo, String sizeCode, String flowerNo, String accessoryNo, double price, String priority) {
        this.orderID = orderID;
        this.custID = custID;
        this.styleNo = styleNo;
        this.sizeCode = sizeCode;
        this.flowerNo = flowerNo;
        this.accessoryNo = accessoryNo;
        this.price = price;
        this.priority = priority;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getStyleNo() {
        return styleNo;
    }

    public void setStyleNo(String styleNo) {
        this.styleNo = styleNo;
    }

    public String getSizeCode() {
        return sizeCode;
    }

    public void setSizeCode(String sizeCode) {
        this.sizeCode = sizeCode;
    }

    public String getFlowerNo() {
        return flowerNo;
    }

    public void setFlowerNo(String flowerNo) {
        this.flowerNo = flowerNo;
    }

    public String getAccessoryNo() {
        return accessoryNo;
    }

    public void setAccessoryNo(String accessoryNo) {
        this.accessoryNo = accessoryNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
