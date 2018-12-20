/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author MSI GL62 6QF
 */
public class OrderPickup implements OrderPickupInterface{
    
    private String pickupNo;
    private String orderNo;
    private Date pickupDate;
    private Time pickupTime;
    
    public OrderPickup(){}
    
    public OrderPickup(String pickupNo, String orderNo, Date pickupDate, Time pickupTime){
        this.pickupNo = pickupNo;
        this.orderNo = orderNo;
        this.pickupDate = pickupDate;
        this.pickupTime = pickupTime;
    }

    @Override
    public String getPickupNo() {
        return pickupNo;
    }

    @Override
    public void setPickupNo(String pickupNo) {
        this.pickupNo = pickupNo;
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
    public Date getPickupDate() {
        return pickupDate;
    }

    @Override
    public void setPickupDate(Date pickupDate) {
       this.pickupDate = pickupDate;
    }

    @Override
    public Time getPickupTime() {
        return pickupTime;
    }

    @Override
    public void setPickupTime(Time pickupTime) {
        this.pickupTime = pickupTime;
    }
    
}
