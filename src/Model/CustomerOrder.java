/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author MSI GL62 6QF
 */
public class CustomerOrder implements CustomerOrderInterface{
    
    private String orderNo;
    private String custId;
    private Double totalAmount;
    private Date orderDate;
    
    public CustomerOrder(){}
    
    public CustomerOrder(String orderNo, String custId, Double totalAmount, Date orderDate){
        this.orderNo = orderNo;
        this.custId = custId;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
    }

    @Override
    public String getOrderNo() {
        return orderNo;
    }

    @Override
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String getCustId() {
        return custId;
    }

    @Override
    public void setCustId(String custId) {
        this.custId = custId;
    }

    @Override
    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public Date getOrderDate() {
        return orderDate;
    }

    @Override
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    
}
