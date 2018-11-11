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
    
    public Consumer(String custID, String name, char gender, int age, String contact) {
        super(custID, name, gender, age, contact);
    }

    public Consumer(String custID, String name, char gender, int age, String contact, Date lastOrderDate) {
        super(custID, name, gender, age, contact, lastOrderDate);
    }
    
    
    

    @Override
    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getCreditLimit() {
        throw new UnsupportedOperationException("Consumer no Credit Limit."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCreditLimit(double creditLimit) {
        throw new UnsupportedOperationException("Consumer no Credit Limit."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
