/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Invoice {
    private String invoiceNo;
    private CorporateCustomerInterface customer;
    private double amount;
    private Date generatedDate;
    private boolean isPaid;
    
    public Invoice(){
        
    }

    public Invoice(String invoiceNo, CorporateCustomerInterface customer, double amount, Date generatedDate, boolean isPaid) {
        this.invoiceNo = invoiceNo;
        this.customer = customer;
        this.amount = amount;
        this.generatedDate = generatedDate;
        this.isPaid = isPaid;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public CorporateCustomerInterface getCustomer() {
        return customer;
    }

    public void setCustomer(CorporateCustomerInterface customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(Date generatedDate) {
        this.generatedDate = generatedDate;
    }

    public boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
    
    
  
    
}
