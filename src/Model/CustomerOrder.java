/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author User
 */
public class CustomerOrder {
    
    private String orderNo;
    private String customerId;
    private double totalAmount;
    private Date orderDate;
    private String paymentType;

    public CustomerOrder(String orderNo, String customerId, double totalAmount, Date orderDate) {
        this.orderNo = orderNo;
        this.customerId = customerId;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
    }


    
    
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    
    
}
