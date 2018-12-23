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
public class Delivery {
    private String DeliveryNo;
    private String OrderNo;
    private Date DeliveryDate;
    private String Address;
    private int Postcode;

    public Delivery(String DeliveryNo, String OrderNo, Date DelivertDate, String Address, int Postcode) {
        this.DeliveryNo = DeliveryNo;
        this.OrderNo = OrderNo;
        this.DeliveryDate = DelivertDate;
        this.Address = Address;
        this.Postcode = Postcode;
    }

    public String getDeliveryNo() {
        return DeliveryNo;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public Date getDeliveryDate() {
        return DeliveryDate;
    }

    public String getAddress() {
        return Address;
    }

    public int getPostcode() {
        return Postcode;
    }

    public void setDeliveryNo(String DeliveryNo) {
        this.DeliveryNo = DeliveryNo;
    }

    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    public void setDeliveryDate(Date DeliveryDate) {
        this.DeliveryDate = DeliveryDate;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPostcode(int Postcode) {
        this.Postcode = Postcode;
    }
    
    
}
