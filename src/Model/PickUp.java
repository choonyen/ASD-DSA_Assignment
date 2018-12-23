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
 * @author User
 */
public class PickUp {
    private String PickUpNo;
    private String OrderNo;
    private Date PickUpDate;
    private String PickUpTime;

    public PickUp(String PickUpNo, String OrderNo, Date PickUpDate, String PickUpTime) {
        this.PickUpNo = PickUpNo;
        this.OrderNo = OrderNo;
        this.PickUpDate = PickUpDate;
        this.PickUpTime = PickUpTime;
    }

    public PickUp() {
    }

    public String getPickUpNo() {
        return PickUpNo;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public Date getPickUpDate() {
        return PickUpDate;
    }

    public String getPickUpTime() {
        return PickUpTime;
    }

    public void setPickUpNo(String PickUpNo) {
        this.PickUpNo = PickUpNo;
    }

    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    public void setPickUpDate(Date PickUpDate) {
        this.PickUpDate = PickUpDate;
    }

    public void setPickUpTime(String PickUpTime) {
        this.PickUpTime = PickUpTime;
    }
    
    
}
