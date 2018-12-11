/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DA.CustomerDA;
import Model.CorporateCustomerInterface;
import Model.CustomerInterface;
import Model.Invoice;
import Model.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LENOVO
 */
public class CustomerMaintenanceControlTest {
    
    public CustomerMaintenanceControlTest() {
    }
    


    /**
     * Test of getAllConsumer method, of class CustomerMaintenanceControl.
     */
    @Test
    public void testGetAllConsumer() {
        System.out.println("getAllConsumer");
        CustomerMaintenanceControl instance = new CustomerMaintenanceControl();

        List<CustomerInterface> expResult = new CustomerDA().getAllConsumer();
        List<CustomerInterface> result = instance.getAllConsumer();
        
        assertEquals(expResult.get(0),result.get(0));

        assertEquals(expResult.numberOfEntries(), result.numberOfEntries());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAllCorporateCustomer method, of class CustomerMaintenanceControl.
     */
    @Test
    public void testGetAllCorporateCustomer() {
        System.out.println("getAllCorporateCustomer");
        CustomerMaintenanceControl instance = new CustomerMaintenanceControl();
        List<CorporateCustomerInterface> expResult = new CustomerDA().getAllCorporateCustomer();
        List<CorporateCustomerInterface> result = instance.getAllCorporateCustomer();
        assertEquals(expResult.get(0),result.get(0));
        assertEquals(expResult.numberOfEntries(), result.numberOfEntries());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAllInvoice method, of class CustomerMaintenanceControl.
     */
   
    
}
