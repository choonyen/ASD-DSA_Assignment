/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MSI GL62 6QF
 */
public class DeliveryTest {
    
    public DeliveryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDeliveryNo method, of class Delivery.
     */
    @Test
    public void testGetDeliveryNo() {
        String deliveryNo = "D001";
        System.out.println("getDeliveryNo");
        Delivery instance = new Delivery();
        String expResult = "D001";
        instance.setDeliveryNo(deliveryNo);
        String result = instance.getDeliveryNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDeliveryNo method, of class Delivery.
     */
    @Test
    public void testSetDeliveryNo() {
        System.out.println("setDeliveryNo");
        String deliveryNo = "D001";
        Delivery instance = new Delivery();
        instance.setDeliveryNo(deliveryNo);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getOrderNo method, of class Delivery.
     */
    @Test
    public void testGetOrderNo() {
        String orderNo = "O001";
        System.out.println("getOrderNo");
        Delivery instance = new Delivery();
        String expResult = "O001";
        instance.setOrderNo(orderNo);
        String result = instance.getOrderNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setOrderNo method, of class Delivery.
     */
    @Test
    public void testSetOrderNo() {
        System.out.println("setOrderNo");
        String orderNo = "O001";
        Delivery instance = new Delivery();
        instance.setOrderNo(orderNo);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDeliveryDate method, of class Delivery.
     */
    @Test
    public void testGetDeliveryDate() {
        Date today = new Date();
        System.out.println("getDeliveryDate");
        Delivery instance = new Delivery();
        Date expResult = new java.sql.Date(today.getTime());
        instance.setDeliveryDate(today);
        Date result = instance.getDeliveryDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDeliveryDate method, of class Delivery.
     */
    @Test
    public void testSetDeliveryDate() {
        Date today = new Date();
        System.out.println("setDeliveryDate");
        Date deliveryDate = new java.sql.Date(today.getTime());
        Delivery instance = new Delivery();
        instance.setDeliveryDate(deliveryDate);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAddress method, of class Delivery.
     */
    @Test
    public void testGetAddress() {
        String address = "PV13";
        System.out.println("getAddress");
        Delivery instance = new Delivery();
        String expResult = "PV13";
        instance.setAddress(address);
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setAddress method, of class Delivery.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "PV13";
        Delivery instance = new Delivery();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPostCode method, of class Delivery.
     */
    @Test
    public void testGetPostCode() {
        String postCode = "59600";
        System.out.println("getPostCode");
        Delivery instance = new Delivery();
        String expResult = "59600";
        instance.setPostCode(postCode);
        String result = instance.getPostCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPostCode method, of class Delivery.
     */
    @Test
    public void testSetPostCode() {
        System.out.println("setPostCode");
        String postCode = "59600";
        Delivery instance = new Delivery();
        instance.setPostCode(postCode);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
