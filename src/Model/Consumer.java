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
public class Consumer extends Customer{
    
    public Consumer(){
    }

    public Consumer(String custID, String name, String ic, char gender, String contact) {
        super(custID, name, ic, gender, contact);
    }

    public Consumer(String custID, String name, String ic, char gender, String contact, Date lastOrderDate) {
        super(custID, name, ic, gender, contact, lastOrderDate);
    }


    @Override
    public double getCreditLimit() {
        throw new UnsupportedOperationException("Consumer no Credit Limit."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCreditLimit(double creditLimit) {
        throw new UnsupportedOperationException("Consumer no Credit Limit."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCompanyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCompanyName(String companyName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLocation(String location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
