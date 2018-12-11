/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.CorporateCustomerInterface;
import Model.CustomerInterface;
import Model.Invoice;
import Model.List;
import org.junit.Test;
import static org.junit.Assert.*;
import DA.CustomerDA;
import DA.InvoiceDA;
import Model.Consumer;

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
;
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

    }

    /**
     * Test of getAllInvoice method, of class CustomerMaintenanceControl.
     */
    @Test
    public void testGetAllInvoice() {
        System.out.println("getAllInvoice");
        CustomerMaintenanceControl instance = new CustomerMaintenanceControl();
        List<Invoice> expResult = new InvoiceDA().getAllInvoice();
        List<Invoice> result = instance.getAllInvoice();
        assertEquals(expResult.get(0),result.get(0));
        assertEquals(expResult.numberOfEntries(), result.numberOfEntries());

    }

    /**
     * Test of createConsumer method, of class CustomerMaintenanceControl.
     */
    @Test
    public void testCreateConsumer() {
        System.out.println("createConsumer");
        String name = "Chan Wei An";
        String ic = "970417-08-5271";
        char gender = 'M';
        String contact = "012-5363406";
        CustomerMaintenanceControl instance = new CustomerMaintenanceControl();
        CustomerInterface result = instance.createConsumer(name, ic, gender, contact);
        assertEquals("Chan Wei An", result.getName());
        assertEquals("970417-08-5271", result.getIc());
        assertEquals('M',result.getGender());
        assertEquals("012-5363406", result.getContact());

    }

    /**
     * Test of createCorporateCustomer method, of class CustomerMaintenanceControl.
     */
    @Test
    public void testCreateCorporateCustomer() {
        System.out.println("createCorporateCustomer");
        String name = "Chan Wei An";
        String ic = "970417-08-5271";
        char gender = 'M';
        String contact = "012-5363406";
        String companyName = "CWA";
        String location = "Setapak";
        Double creditLimit = 5000.0;
        CustomerMaintenanceControl instance = new CustomerMaintenanceControl();
        CorporateCustomerInterface result = instance.createCorporateCustomer(name, ic, gender, contact, companyName, location, creditLimit);
        assertEquals("Chan Wei An", result.getName());
        assertEquals("970417-08-5271", result.getIc());
        assertEquals('M',result.getGender());
        assertEquals("012-5363406", result.getContact());
        assertEquals("CWA",result.getCompanyName());
        assertEquals("Setapak",result.getLocation());
        assertEquals("5000.0",String.valueOf(result.getCreditLimit()));
;
    }

    
    
}
