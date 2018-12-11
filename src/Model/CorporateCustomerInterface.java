/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LENOVO
 */
public interface CorporateCustomerInterface extends CustomerInterface{
    
    public double getCreditLimit();
    public void setCreditLimit(double creditLimit);
    public String getCompanyName();
    public void setCompanyName(String companyName);
    public String getLocation();
    public void setLocation(String location);
    public double getRemainingCreditLimit();
    public void setRemainingCreditLimit(double remainingCreditLimit);
    public void setIsActive(boolean isActive);
    public boolean getIsActive();
}
