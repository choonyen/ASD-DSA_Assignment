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
public class Flower {
    private String flowerNo;
    private String flowerName;
    private String desc;
    private double price;
    

    public Flower(String flowerNo, String flowerName, String desc,double price) {
        this.flowerNo = flowerNo;
        this.flowerName = flowerName;
        this.desc = desc;
        this.price = price;
    }

    public String getFlowerNo() {
        return flowerNo;
    }

    public void setFlowerNo(String flowerNo) {
        this.flowerNo = flowerNo;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }
    
    public void setDesc(String desc)
    {
        this.desc = desc;
    }
    
    public String getDesc()
    {
        return desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
