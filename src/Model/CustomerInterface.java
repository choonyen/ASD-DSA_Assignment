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
public interface CustomerInterface {
    
    
    

    public String getCustID(); 
    public void setCustID(String custID); 
    public String getName() ;
    public void setName(String name) ;
    public char getGender() ;
    public void setGender(char gender) ;
    public String getIc() ;
    public void setIc(String ic) ;
    public String getContact() ;
    public void setContact(String contact) ;
    public Date getLastOrderDate() ;
    public void setLastOrderDate(Date lastOrderDate) ;
    
    
        
}
