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
    
    
    private String companyName;
    private String location;
    private double creditLimit;
    
    
    public CorporateCustomer(){
    }

    public CorporateCustomer(String companyName, String location, double creditLimit, String custID, String name, String ic, char gender, String contact) {
        super(custID, name, ic, gender, contact);
        this.companyName = companyName;
        this.location = location;
        this.creditLimit = creditLimit;
    }

    public CorporateCustomer(String companyName, String location, double creditLimit, String custID, String name, String ic, char gender, String contact, Date lastOrderDate) {
        super(custID, name, ic, gender, contact, lastOrderDate);
        this.companyName = companyName;
        this.location = location;
        this.creditLimit = creditLimit;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

}
