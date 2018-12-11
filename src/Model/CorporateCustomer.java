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
public class CorporateCustomer implements CorporateCustomerInterface{
    
    private String custID;
    private String name;
    private String ic;
    private char gender;
    private String contact;
    private Date lastOrderDate;
    private String companyName;
    private String location;
    private double creditLimit;
    private double remainingCreditLimit;
    private boolean isActive;

    public CorporateCustomer(String custID, String name, String ic, char gender, String contact, String companyName, String location, double creditLimit, double remainingCreditLimit, boolean isActive) {
        this.custID = custID;
        this.name = name;
        this.ic = ic;
        this.gender = gender;
        this.contact = contact;
        this.companyName = companyName;
        this.location = location;
        this.creditLimit = creditLimit;
        this.remainingCreditLimit = remainingCreditLimit;
        this.isActive = isActive;
    }

    public CorporateCustomer( String custID, String name, String ic, char gender, String contact, Date lastOrderDate, String companyName, String location, double creditLimit, double remainingCreditLimit, boolean isActive) {
        this.custID = custID;
        this.name = name;
        this.ic = ic;
        this.gender = gender;
        this.contact = contact;
        this.lastOrderDate = lastOrderDate;
        this.companyName = companyName;
        this.location = location;
        this.creditLimit = creditLimit;
        this.remainingCreditLimit = remainingCreditLimit;
        this.isActive = isActive;
    }

    public CorporateCustomer(){
    }
    
    public CorporateCustomer(String custID){
        this.custID = custID;
    }
    
    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }


    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Date getLastOrderDate() {
        return lastOrderDate;
    }

    public void setLastOrderDate(Date lastOrderDate) {
        this.lastOrderDate = lastOrderDate;
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
    
    public double getRemainingCreditLimit() {
        return remainingCreditLimit;
    }

    public void setRemainingCreditLimit(double remainingCreditLimit) {
        this.remainingCreditLimit = remainingCreditLimit;
    }

     public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    
    
}
