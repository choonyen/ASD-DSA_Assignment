/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lamzn
 */
public class CatalogTest {
    
    public CatalogTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getProdid method, of class Catalog.
     */
    @Test
    public void testGetProdid() {
       
        System.out.println("getProdid");
        Catalog instance = new Catalog();
        String expResult = "P000";
        String Prodid = "P000";
        instance.setProdid(Prodid);
        String result = instance.getProdid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setProdid method, of class Catalog.
     */
    @Test
    public void testSetProdid() {
        System.out.println("setProdid");
        String Prodid = "P000";
        Catalog instance = new Catalog();
        instance.setProdid(Prodid);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getName method, of class Catalog.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Catalog instance = new Catalog();
        String expResult = "Rose";
        String Name = "Rose";
        instance.setName(Name);
        String result = instance.getName();
        assertEquals(expResult, result);
        
        
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of setName method, of class Catalog.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String Name = "Rose";
        Catalog instance = new Catalog();
        instance.setName(Name);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of getType method, of class Catalog.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Catalog instance = new Catalog();
        String expResult = "Bouquet";
        String Type = "Bouquet";
        instance.setType(Type);
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setType method, of class Catalog.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String Type = "Bouquet";
        Catalog instance = new Catalog();
        instance.setType(Type);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getPrice method, of class Catalog.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Catalog instance = new Catalog();
        double expResult = 50.00;
        double result = instance.getPrice();
        assertEquals(expResult, result, 50.00);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of setPrice method, of class Catalog.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double Price = 50.00;
        Catalog instance = new Catalog();
        instance.setPrice(Price);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getDescription method, of class Catalog.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Catalog instance = new Catalog();
        String expResult = "white";
        String Description = "white";
        instance.setDescription(Description);
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setDescription method, of class Catalog.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String Description = "white";
        Catalog instance = new Catalog();
        instance.setDescription(Description);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of getStock method, of class Catalog.
     */
    @Test
    public void testGetStock() {
        System.out.println("getStock");
        Catalog instance = new Catalog();
        int expResult = 0;
        int result = instance.getStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of setStock method, of class Catalog.
     */
    @Test
    public void testSetStock() {
        System.out.println("setStock");
        int Stock = 0;
        Catalog instance = new Catalog();
        instance.setStock(Stock);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
