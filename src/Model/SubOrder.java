/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
public class SubOrder {
    
    private String subOrderNo;
    private String orderNo;
    private String prodId;
    private Integer amount;
    private double subTotal;
    private double priceOnTime;

    public SubOrder(String subOrderNo, String orderNo, String prodId, Integer amount, double subTotal, double priceOnTime) {
        this.subOrderNo = subOrderNo;
        this.orderNo = orderNo;
        this.prodId = prodId;
        this.amount = amount;
        this.subTotal = subTotal;
        this.priceOnTime = priceOnTime;
    }

    public String getSubOrderNo() {
        return subOrderNo;
    }

    public void setSubOrderNo(String subOrderNo) {
        this.subOrderNo = subOrderNo;
    }



    
    
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getPriceOnTime() {
        return priceOnTime;
    }

    public void setPriceOnTime(double priceOnTime) {
        this.priceOnTime = priceOnTime;
    }
    
    
    
}
