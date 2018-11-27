/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Model.*;
import DA.*;
import DA.*;
import Model.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Choonyen
 */
public class MaintenanceCustomerControl {
    CustomizedDA customizedDA;
    CustomerDA customerDA;
    
    public MaintenanceCustomerControl()
    {
        customizedDA = new CustomizedDA();
        customerDA = new CustomerDA();
    }
    
    private boolean idValidation(String id)
    {
        if(id.length() == 4)
        {
            if(id.charAt(0) == 'C' || id.charAt(0) == 'c')
            {
                for(int i=1;i<id.length();i++)
                {
                    if(!Character.isDigit(id.charAt(i)))
                    {
                        return false;
                    }
                }
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    
    public Customer searchCustomer(String id)
    {
        Customer customer = null;
        if(!id.equals(""))
        {
            if(idValidation(id))
            {
                customer = customerDA.getConsumer(id);
                if(customer==null)
                {
                    JOptionPane.showMessageDialog(null,"Wrong ID!! Cannot Find Customer.","Error", JOptionPane.ERROR_MESSAGE);
                    return customer;
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid ID format!!! example:C000 ","ERROR",JOptionPane.ERROR_MESSAGE);
                return customer;
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"ERROR!! Cannot be Blank","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return customer;    
    }
    
    
}
