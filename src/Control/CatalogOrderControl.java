/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.*;
import DA.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author User
 */
public class CatalogOrderControl {
    
    private static List<DeliveryInterface> DELIVERY_LIST;
    private static List<OrderPickupInterface> PICKUP_LIST;
    private static List<CustomerOrderInterface> CUSTOMERORDER_LIST;
    private static List<OrderListInterface> ORDERLIST_LIST;
    public static List<CorporateCustomerInterface> CORPORRATECUSTOMER_LIST;
    public static List<CustomerInterface> CUSTOMER_LIST;
    public static List<CatalogInterface> CATALOG_LIST;
       
    private static int DELIVERY_COUNT;
    private static int PICKUP_COUNT;
    private static int ORDER_COUNT;
      
    private CountDA countDA;
    private OrderPickupDA orderPickupDA;
    private DeliveryDA deliveryDA;
    private CustomerOrderDA customerOrderDA;
    private CustomerDA customerDA;
    private OrderListDA orderListDA;
    private CatalogDA catalogDA;
    
    public CatalogOrderControl(){
        countDA = new CountDA();
        orderPickupDA = new OrderPickupDA();
        deliveryDA = new DeliveryDA();
        customerOrderDA = new CustomerOrderDA();
        customerDA = new CustomerDA();
        orderListDA = new OrderListDA();
        catalogDA = new CatalogDA();
        
        DELIVERY_LIST = deliveryDA.getAllDelivery();
        PICKUP_LIST = orderPickupDA.getAllPickup();
        CUSTOMERORDER_LIST = customerOrderDA.getALLCustomerOrder();
        ORDERLIST_LIST = orderListDA.getALLOrderList();
        CORPORRATECUSTOMER_LIST = customerDA.getAllCorporateCustomer();

        CUSTOMER_LIST = customerDA.getAllConsumer();
        CATALOG_LIST = catalogDA.getAllCatalog();
        
        DELIVERY_COUNT = countDA.getCount().getDeliveryCount();
        PICKUP_COUNT = countDA.getCount().getPickupCount();
        ORDER_COUNT = countDA.getCount().getOrderCount();                 
    }
    
    
    public List<DeliveryInterface> getAllDelivery(){
        return DELIVERY_LIST;
    }
    public List<OrderPickupInterface> getAllPickup(){
        return PICKUP_LIST;
    }
    public List<CustomerOrderInterface> getALLCustomerOrder(){
        return CUSTOMERORDER_LIST;
    }
    public List<OrderListInterface> getALLOrderList(){
        return ORDERLIST_LIST;
    }
    public List<CorporateCustomerInterface> getAllCorporateCustomer(){
        return CORPORRATECUSTOMER_LIST;
    }
    public List<CustomerInterface> getAllConsumer(){
        return CUSTOMER_LIST;
    }
    public List<CatalogInterface> getAllCatalog(){
        return CATALOG_LIST;
    } 
    public int getDeliveryCount()
    {
        return DELIVERY_COUNT;
    }
    public int getPickupCount(){
        return PICKUP_COUNT;
    }
    public int getOrderCount(){
        return ORDER_COUNT;
    }
    
    public void addDelivery(DeliveryInterface delivery){
        DELIVERY_LIST.add(delivery);
        DELIVERY_COUNT++;        
    }
    public void addPickUp(OrderPickupInterface orderPickup){
        PICKUP_LIST.add(orderPickup);
        PICKUP_COUNT++;
    }
    public void addCustomerOrder(CustomerOrderInterface customerOrder){
        CUSTOMERORDER_LIST.add(customerOrder);
        ORDER_COUNT++;
    }
    public void addOrderList(OrderListInterface orderList){
        ORDERLIST_LIST.add(orderList);
        CatalogInterface newCatalog = getCatalogById(orderList.getProdId());
        newCatalog.setStock(newCatalog.getStock()-orderList.getQuantity());
        CATALOG_LIST.edit(getCatalogById(orderList.getProdId()) , newCatalog);

    }

    public CatalogInterface getCatalogById(String id){
        Iterator<CatalogInterface> catalogList = CATALOG_LIST.getIterator();
        CatalogInterface result = null;
        while(catalogList.hasNext()){
            CatalogInterface catalog = catalogList.next();
            if(catalog.getProdID().equals(id)){
                result = catalog;
                break;
            }
        }
        return result;
    }
    
    public CustomerInterface getConsumerById(String id) {
        Iterator<CustomerInterface> customerList = CUSTOMER_LIST.getIterator();
        CustomerInterface result = null;
        while (customerList.hasNext()) {
            CustomerInterface consumer = customerList.next();
            if (consumer.getCustID().equals(id)) {
                result = consumer;
                break;
            }
        }
        return result;
    }
    
     public CorporateCustomerInterface getCorporateCustomerById(String id) {
        Iterator<CorporateCustomerInterface> corporateCustomerList = CORPORRATECUSTOMER_LIST.getIterator();
        CorporateCustomerInterface result = null;
        while (corporateCustomerList.hasNext()) {
            CorporateCustomerInterface corporateCustomer = corporateCustomerList.next();
            if (corporateCustomer.getCustID().equals(id)) {
                result = corporateCustomer;
                break;
            }
        }
        return result;

    }
    
     public boolean custIdValidation(String custId) {
        if (custId.length() != 4 || (custId.charAt(0) != 'C' && custId.charAt(0) != 'V')
                || !Character.isDigit(custId.charAt(1)) || !Character.isDigit(custId.charAt(2))
                || !Character.isDigit(custId.charAt(3))) {
            return false;
        } else {
            return true;
        }
    }
     
     public void updateCorporateCustomerCredit(String id, double total){
         CorporateCustomerInterface cc = getCorporateCustomerById(id);
         cc.setRemainingCreditLimit(cc.getRemainingCreditLimit()-total);
         CORPORRATECUSTOMER_LIST.edit(getCorporateCustomerById(id), cc);
         
     }
     
    
    
     public void updateDatabase() {
         Iterator<CustomerOrderInterface> customerOrderList = CUSTOMERORDER_LIST.getIterator();
         while(customerOrderList.hasNext()){
             CustomerOrderInterface customerOrder = customerOrderList.next();
             
         if(customerOrderDA.getCustomerOrderByNo(customerOrder.getOrderNo()) == null)
            customerOrderDA.addCustomerOrder(customerOrder);
         }
         countDA.increaseOrderCount(ORDER_COUNT);
         
         
         Iterator<DeliveryInterface> deliveryList = DELIVERY_LIST.getIterator();
         while(deliveryList.hasNext()){
             DeliveryInterface delivery = deliveryList.next();
             
         if(deliveryDA.getDeliveryById(delivery.getDeliveryNo()) == null)
             deliveryDA.addDelivery(delivery);
         }
         countDA.increaseDeliveryCount(DELIVERY_COUNT);
         
         
         Iterator<OrderPickupInterface> orderPickupList = PICKUP_LIST.getIterator();
         while(orderPickupList.hasNext()){
             OrderPickupInterface orderPickup = orderPickupList.next();
             
         if(orderPickupDA.getPickupByNo(orderPickup.getPickupNo()) == null)
            orderPickupDA.addPickUp(orderPickup);
         }
         countDA.increasePickUpCount(PICKUP_COUNT);
         
         
       Iterator<OrderListInterface> orderListList = ORDERLIST_LIST.getIterator();
        while(orderListList.hasNext())
        {
            OrderListInterface orderList = orderListList.next();
            if(orderListDA.getOrderListByOrderNo(orderList.getOrderNo(),orderList.getProdId()) == null)
            {
                orderListDA.addOrderList(orderList);
            }
        }
        
        Iterator<CorporateCustomerInterface> corporateCustomerList = CORPORRATECUSTOMER_LIST.getIterator();
        while (corporateCustomerList.hasNext()) {
            CorporateCustomerInterface corporateCustomer = corporateCustomerList.next();
            if (customerDA.getCorporateCustomer(corporateCustomer.getCustID()) != null) {
                customerDA.updateCorporateCustomer(corporateCustomer);
            } 
        }
        
        Iterator<CatalogInterface> catalogList = CATALOG_LIST.getIterator();
        while(catalogList.hasNext()){
            CatalogInterface catalog = catalogList.next();
            if(catalogDA.getCatalog(catalog.getProdID()) != null){
                catalogDA.updateCatalog(catalog);
            }
        }
            
     }
  
     
     
     
}
