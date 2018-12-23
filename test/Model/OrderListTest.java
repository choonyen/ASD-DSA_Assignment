/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class OrderListTest {
    
    public OrderListTest() {
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
     * Test of getOrderNo method, of class OrderList.
     */
    @Test
    public void testGetOrderNo() {
        System.out.println("getOrderNo");
        OrderList instance = new OrderList();
        String expResult = "c0";
        String orderNo = "c0";
        instance.setOrderNo(orderNo);
        String result = instance.getOrderNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    

    
    /**
     * Test of getProdID method, of class OrderList.
     */
    @Test
    public void testGetProdID() {
        System.out.println("getProdID");
        OrderList instance = new OrderList() ;
        String expResult = "P01";
        String productNo = "P01";
        instance.setProdID(productNo);
        String result = instance.getProdID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getQuantity method, of class OrderList.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        OrderList instance = new OrderList();
        int expResult = 0;
        int quantity = 0;
        instance.setQuantity(quantity);
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAmount method, of class OrderList.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        OrderList instance = new OrderList();
        int expResult = 0;
        int amount = 0;
        instance.setAmount(amount);
        int result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setOrderNo method, of class OrderList.
     */
    
    
    @Test
    public void testSetOrderNo() {
        System.out.println("setOrderNo");
        String OrderNo = "c1";
        OrderList instance = new OrderList();
        instance.setOrderNo(OrderNo);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setProdID method, of class OrderList.
     */
    @Test
    public void testSetProdID() {
        System.out.println("setProdID");
        String ProdID = "P01";
        OrderList instance = new OrderList();
        instance.setProdID(ProdID);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setQuantity method, of class OrderList.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int Quantity = 1;
        OrderList instance = new OrderList();
        instance.setQuantity(Quantity);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setAmount method, of class OrderList.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        int Amount = 1;
        OrderList instance = new OrderList();
        instance.setAmount(Amount);
        // TODO review the generated test code and remove the default call to fail.
    }

}
