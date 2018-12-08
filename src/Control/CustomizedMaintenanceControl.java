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
public class CustomizedMaintenanceControl {
    private static CustomizedList<CustomizedFloral> CUSTOMIZED_LIST;
    private static CustomizedList<Style> STYLE_LIST;
    private static CustomizedList<Size> SIZE_LIST;
    private static CustomizedList<Flower> FLOWER_LIST;
    private static CustomizedList<Accessory> ACCESSORY_LIST;
    private static int CUSTOMIZED_ORDER_COUNT;
    
    CountDA countDA;
    CustomizedDA customizedDA;
    CustomerDA customerDA;
    
    public CustomizedMaintenanceControl()
    {
        countDA = new CountDA();
        customizedDA = new CustomizedDA();
        customerDA = new CustomerDA();
        CUSTOMIZED_LIST = customizedDA.getCustomizedOrder();
        CUSTOMIZED_ORDER_COUNT = countDA.getCount().getCustomizedOrderCount();
    }
    
    public CustomizedList <CustomizedFloral> getAllCustomized()
    {
        return CUSTOMIZED_LIST;
    }
    
    public void addCustomizedOrder(CustomizedFloral customizedFloral)
    {
        CUSTOMIZED_LIST.add(customizedFloral);
        CUSTOMIZED_ORDER_COUNT ++;
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
