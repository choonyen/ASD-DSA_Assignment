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
public interface DeliveryInterface {
    
    public String getDeliveryNo();
    public void setDeliveryNo(String deliveryNo);
    public String getOrderNo();
    public void setOrderNo(String OrderNo);
    public Date getDeliveryDate();
    public void setDeliveryDate(Date deliveryDate);
    public String getAddress();
    public void setAddress(String address);
    public String getPostCode();
    public void setPostCode(String postCode);
}
