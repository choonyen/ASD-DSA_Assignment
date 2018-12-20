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
public class Payment implements PaymentInterface{
    
    private String paymentNo;
    private String orderNo;
    private Date paymentDate;
    
    public Payment(){}
    
    public Payment(String paymentNo, String orderNo, Date paymentDate){
        this.paymentNo = paymentNo;
        this.orderNo = orderNo;
        this.paymentDate = paymentDate;
    }

    @Override
    public String getPaymentNo() {
        return paymentNo;
    }

    @Override
    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
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
    public Date getPaymentDate() {
        return paymentDate;
    }

    @Override
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
    
}
