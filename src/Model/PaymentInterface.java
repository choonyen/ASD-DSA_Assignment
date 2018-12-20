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
public interface PaymentInterface {
    
    public String getPaymentNo();
    public void setPaymentNo(String paymentNo);
    public String getOrderNo();
    public void setOrderNo(String orderNo);
    public Date getPaymentDate();
    public void setPaymentDate(Date paymentDate);
}
