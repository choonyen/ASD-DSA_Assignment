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
public interface CustomerOrderInterface {
    
    public String getOrderNo();
    public void setOrderNo(String orderNo);
    public String getCustId();
    public void setCustId(String custId);
    public double getTotalAmount();
    public void setTotalAmount(Double totalAmount);
    public Date getOrderDate();
    public void setOrderDate(Date orderDate);
}
