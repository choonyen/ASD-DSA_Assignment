/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LokeCY
 */
public class CustomizedFloralTest {
    CustomizedFloral customizedFloral;
    
    public CustomizedFloralTest() {
        customizedFloral = new CustomizedFloral("O010", "C002", "S001", 'L', "F002", "A002", 55.00, "Express");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getOrderID method, of class CustomizedFloral.
     */
    @Test
    public void testGetOrderID() {
        System.out.println("GET ORDER ID");
        String actualResult = "O010";
        assertEquals(actualResult, customizedFloral.getOrderID());
    }

    /**
     * Test of setOrderID method, of class CustomizedFloral.
     */
    @Test
    public void testSetOrderID() {
        System.out.println("SET ORDER ID");
        String setOrder = "O009";
        customizedFloral.setOrderID(setOrder);
        assertEquals(setOrder, customizedFloral.getOrderID());
    }

    /**
     * Test of getCustID method, of class CustomizedFloral.
     */
    @Test
    public void testGetCustID() {
        System.out.println("GET CUSTOMER ID");
        String actualResult = "C002";
        assertEquals(actualResult, customizedFloral.getCustID());
    }

    /**
     * Test of setCustID method, of class CustomizedFloral.
     */
    @Test
    public void testSetCustID() {
        System.out.println("SET CUSTOMER ID");
        String setCustomer = "C004";
        customizedFloral.setCustID(setCustomer);
        assertEquals(setCustomer, customizedFloral.getCustID());
    }

    /**
     * Test of getStyleNo method, of class CustomizedFloral.
     */
    @Test
    public void testGetStyleNo() {
        System.out.println("GET STYLE NUMBER");
        String actualResult = "S001";
        assertEquals(actualResult, customizedFloral.getStyleNo());
    }

    /**
     * Test of setStyleNo method, of class CustomizedFloral.
     */
    @Test
    public void testSetStyleNo() {
        System.out.println("SET STYLE NUMBER");
        String setStyle = "S003";
        customizedFloral.setStyleNo(setStyle);
        assertEquals(setStyle, customizedFloral.getStyleNo());
    }

    /**
     * Test of getSizeCode method, of class CustomizedFloral.
     */
    @Test
    public void testGetSizeCode() {
        System.out.println("GET SIZE CODE");
        char actualResult = 'L';
        assertEquals(actualResult, customizedFloral.getSizeCode());
    }

    /**
     * Test of setSizeCode method, of class CustomizedFloral.
     */
    @Test
    public void testSetSizeCode() {
        System.out.println("SET SIZE CODE");
        char setSize = 'M';
        customizedFloral.setSizeCode(setSize);
        assertEquals(setSize, customizedFloral.getSizeCode());
    }

    /**
     * Test of getFlowerNo method, of class CustomizedFloral.
     */
    @Test
    public void testGetFlowerNo() {
        System.out.println("GET FLOWER ID");
        String actualResult = "F002";
        assertEquals(actualResult, customizedFloral.getFlowerNo());
    }

    /**
     * Test of setFlowerNo method, of class CustomizedFloral.
     */
    @Test
    public void testSetFlowerNo() {
        System.out.println("SET FLOWER ID");
        String setFlower = "F003";
        customizedFloral.setFlowerNo(setFlower);
        assertEquals(setFlower, customizedFloral.getFlowerNo());
    }

    /**
     * Test of getAccessoryNo method, of class CustomizedFloral.
     */
    @Test
    public void testGetAccessoryNo() {
        System.out.println("GET ACCESSORY ID");
        String actualResult = "A002";
        assertEquals(actualResult, customizedFloral.getAccessoryNo());
    }

    /**
     * Test of setAccessoryNo method, of class CustomizedFloral.
     */
    @Test
    public void testSetAccessoryNo() {
        System.out.println("SET ACCESSORY ID");
        String setAccessory = "A003";
        customizedFloral.setAccessoryNo(setAccessory);
        assertEquals(setAccessory, customizedFloral.getAccessoryNo());
    }

    /**
     * Test of getPrice method, of class CustomizedFloral.
     */
    @Test
    public void testGetPrice() {
        System.out.println("GET PRICE");
        double actualResult = 55.00;
        assertEquals(actualResult, customizedFloral.getPrice(),0);
    }

    /**
     * Test of setPrice method, of class CustomizedFloral.
     */
    @Test
    public void testSetPrice() {
        System.out.println("SET PRICE");
        double setPrice = 40.00;
        customizedFloral.setPrice(setPrice);
        assertEquals(setPrice, customizedFloral.getPrice(),0);
    }

    /**
     * Test of getPriority method, of class CustomizedFloral.
     */
    @Test
    public void testGetPriority() {
        System.out.println("GET PRIORITY");
        String actualResult = "Express";
        assertEquals(actualResult, customizedFloral.getPriority());
    }

    /**
     * Test of setPriority method, of class CustomizedFloral.
     */
    @Test
    public void testSetPriority() {
        System.out.println("SET PRIORITY");
        String setPrior = "Flexi";
        customizedFloral.setPriority(setPrior);
        assertEquals(setPrior, customizedFloral.getPriority());
        
    }

    /**
     * Test of main method, of class CustomizedFloral.
     */
    @Test
    public void testMain() {
    }
    
}
