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
public interface OrderPickupInterface {
    
    public String getPickupNo();
    public void setPickupNo(String pickupNo);
    public String getOrderNo();
    public void setOrderNo(String orderNo);
    public Date getPickupDate();
    public void setPickupDate(Date pickupDate);
    public Time getPickupTime();
    public void setPickupTime(Time pickupTime);
    public Time getPickupedTime();
    public void setPickupedTime(Time pickupedTime);
}
