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
public class CorporateCustomer extends Customer{
    
    private double creditLimit;
    
    public CorporateCustomer(){
    }

    public CorporateCustomer(double creditLimit, String custID, String name, String ic, char gender, String contact) {
        super(custID, name, ic, gender, contact);
        this.creditLimit = creditLimit;
    }

    public CorporateCustomer(double creditLimit, String custID, String name, String ic, char gender, String contact, Date lastOrderDate) {
        super(custID, name, ic, gender, contact, lastOrderDate);
        this.creditLimit = creditLimit;
    }
    


    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
        
    @Override
    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
