/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MSI GL62 6QF
 */
public class OrderList implements OrderListInterface{
    
    private String orderNo;
    private String prodId;
    public int quantity;
    public Double amount;
    
    public OrderList(){}
    
    public OrderList(String orderNo, String prodId, int quantity, Double amount){
        this.orderNo = orderNo;
        this.prodId = prodId;
        this.quantity = quantity;
        this.amount = amount;
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
    public String getProdId() {
        return prodId;
    }

    @Override
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public Double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
}
