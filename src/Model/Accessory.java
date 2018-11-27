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
public class Accessory {
    private String accessoryNo;
    private String accessoryName;
    private double price;
    
    public Accessory(String accessoryNo, String accessoryName, double price) {
        this.accessoryNo = accessoryNo;
        this.accessoryName = accessoryName;
        this.price = price;
    }

    public String getAccessoryNo() {
        return accessoryNo;
    }

    public void setAccessoryNo(String accessoryNo) {
        this.accessoryNo = accessoryNo;
    }

    public String getAccessoryName() {
        return accessoryName;
    }

    public void setAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
}
