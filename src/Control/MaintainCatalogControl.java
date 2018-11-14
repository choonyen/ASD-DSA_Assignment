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
public class MaintainCatalogControl {
   
    CatalogDA catalogDA;
    
    public MaintainCatalogControl()
    {
        
        catalogDA = new CatalogDA();
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
    
    public Catalog searchCatalog(String id)
    {
        Catalog catalog = null;
        if(!id.equals(""))
        {
            if(idValidation(id))
            {
                catalog = catalogDA.getCatalog(id);
                if(catalog==null)
                {
                    JOptionPane.showMessageDialog(null,"Wrong ID!! Cannot Find Procduct.","Error", JOptionPane.ERROR_MESSAGE);
                    return catalog;
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid ID format!!! example:P000 or p000","ERROR",JOptionPane.ERROR_MESSAGE);
                return catalog;
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"ERROR!! Cannot be Blank","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return catalog;    
    }
    
    
}
