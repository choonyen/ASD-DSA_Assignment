/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Model.*;
import DA.*;
import java.util.Iterator;
import javax.swing.*;

/**
 *
 * @author Choonyen
 */
public class CustomizedMaintenanceControl {
    private static List<CustomizedFloral> CUSTOMIZED_LIST;
    private static List<Style> STYLE_LIST;
    private static List<Size> SIZE_LIST;
    private static List<Flower> FLOWER_LIST;
    private static List<Accessory> ACCESSORY_LIST;
    private static int CUSTOMIZED_ORDER_COUNT;
    
    CountDA countDA;
    CustomizedDA customizedDA;
    CustomerDA customerDA;
    StyleDA styleDA;
    SizeDA sizeDA;
    FlowerDA flowerDA;
    AccessoryDA accessoryDA;
    
    public CustomizedMaintenanceControl()
    {
        countDA = new CountDA();
        customizedDA = new CustomizedDA();
        customerDA = new CustomerDA();
        styleDA = new StyleDA();
        sizeDA = new SizeDA();
        flowerDA = new FlowerDA();
        accessoryDA = new AccessoryDA();
        
        CUSTOMIZED_LIST = customizedDA.getCustomizedOrder();
        STYLE_LIST = styleDA.getStyleList();
        SIZE_LIST = sizeDA.getSizeList();
        FLOWER_LIST = flowerDA.getFlowerList();
        ACCESSORY_LIST = accessoryDA.getAccessoryList();
        CUSTOMIZED_ORDER_COUNT = countDA.getCount().getCustomizedOrderCount();
        
        
    }
    
    public List <CustomizedFloral> getAllCustomized()
    {
        return CUSTOMIZED_LIST;
    }
    
    public List <Style> getAllStyle()
    {
        return STYLE_LIST;
    }
    
    public List <Size> getAllSize()
    {
        return SIZE_LIST;
    }
    
    public List <Flower> getAllFlower()
    {
        return FLOWER_LIST;
    }
    
    public List <Accessory> getAllAccessory()
    {
        return ACCESSORY_LIST;
    }
    
    public void addCustomizedOrder(CustomizedFloral customizedFloral)
    {
        CUSTOMIZED_LIST.add(customizedFloral);
        CUSTOMIZED_ORDER_COUNT ++;
    }
    
    public int getCustomizedCount()
    {
        return CUSTOMIZED_ORDER_COUNT;
    }
    
    
    public Style getStyleById(String no)
    {
        Iterator<Style> styleList = STYLE_LIST.getIterator();
        Style result = null;
        while(styleList.hasNext())
        {
            Style style = styleList.next();
            if(style.getStyleNo().equals(no))
            {
                result = style;
                break;
            }

        }
        return result;
    }
    
    public Size getSizeById(String id)
    {
        Iterator<Size> sizeList = SIZE_LIST.getIterator();
        Size result = null;
        while(sizeList.hasNext())
        {
            Size size = sizeList.next();
            if(String.valueOf(size.getSizeCode()).equals(id))
            {
                result = size;
                break;
            }
        }
        return result;
    }
    
    public Flower getFlowerById(String id)
    {
        Iterator<Flower> flowerList = FLOWER_LIST.getIterator();
        Flower result = null;
        while(flowerList.hasNext())
        {
            Flower flower = flowerList.next();
            if(flower.getFlowerNo().equals(id))
            {
                result = flower;
                break;
            }
        }
        return result;
    }
    
    public Accessory getAccessoryById(String id)
    {
        Iterator<Accessory> accessoryList = ACCESSORY_LIST.getIterator();
        Accessory result = null;
        while(accessoryList.hasNext())
        {
            Accessory accessory = accessoryList.next();
            if(accessory.getAccessoryNo().equals(id))
            {
                result = accessory;
                break;
            }
        }
        return result;
    }
    
    public void updateDatabase()
    {
        Iterator<CustomizedFloral> customizedList = CUSTOMIZED_LIST.getIterator();
        while(customizedList.hasNext()){
            CustomizedFloral custFloral = customizedList.next();
            
            if(customizedDA.getOrderCust(custFloral.getOrderID())== null)
                customizedDA.addCustOrder(custFloral);
                
      
        }      
        countDA.increaseCustomizedCount(CUSTOMIZED_ORDER_COUNT);       
    }  
}
