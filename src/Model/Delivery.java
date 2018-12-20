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
public class Delivery implements DeliveryInterface{
    
    private String deliveryNo;
    private String orderNo;
    private Date deliveryDate;
    private String address;
    private String postCode;
    
    public Delivery(){}
    
    public Delivery(String deliveryNo, String orderNo, Date deliveryDate, String address, String postCode){
        this.deliveryNo = deliveryNo;
        this.orderNo = orderNo;
        this.deliveryDate = deliveryDate;
        this.address = address;
        this.postCode = postCode;
    }

    @Override
    public String getDeliveryNo() {
        return deliveryNo;
    }

    @Override
    public void setDeliveryNo(String deliveryNo) {
        this.deliveryNo = deliveryNo;
    }

    @Override
    public String getOrderNo() {
        return orderNo;
    }

    @Override
    public void setOrderNo(String OrderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public Date getDeliveryDate() {
        return deliveryDate;
    }

    @Override
    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getPostCode() {
        return postCode;
    }

    @Override
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    
}
