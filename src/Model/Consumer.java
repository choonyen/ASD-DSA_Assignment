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
public class Consumer implements CustomerInterface{
    
    private String custID;
    private String name;
    private String ic;
    private char gender;
    private String contact;
    private Date lastOrderDate;

    public Consumer(String custID, String name, String ic, char gender, String contact, Date lastOrderDate) {
        this.custID = custID;
        this.name = name;
        this.ic = ic;
        this.gender = gender;
        this.contact = contact;
        this.lastOrderDate = lastOrderDate;
    }
    
    public Consumer(String custID, String name, String ic, char gender, String contact) {
        this.custID = custID;
        this.name = name;
        this.ic = ic;
        this.gender = gender;
        this.contact = contact;
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
    
    
}
