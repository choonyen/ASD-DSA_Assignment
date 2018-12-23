/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DA.CountDA;
import DA.DeliveryDA;
import DA.OrderPickupDA;
import DA.PaymentDA;
import Model.CatalogInterface;
import Model.CustomerOrderInterface;
import Model.DeliveryInterface;
import Model.OrderList;
import Model.OrderListInterface;
import Model.OrderPickupInterface;
import Model.Payment;
import Model.PaymentInterface;
import java.util.Date;
import java.util.Iterator;
import Model.List;

/**
 *
 * @author MSI GL62 6QF
 */
public class DeliveryAndPickupControl {
    
    private static List<DeliveryInterface> DELIVERY_LIST, DELIVERYBYDATE_LIST;
    private static List<PaymentInterface> PAYMENT_LIST;
    private static List<CustomerOrderInterface> CUSTOMERORDER_LIST;
    private static List<OrderListInterface> ORDERLIST_LIST;
    private static List<CatalogInterface> CATALOG_LIST;
    private static List<OrderPickupInterface> PICKUP_LIST;
    private static int PAYMENT_COUNT;
    
    private OrderPickupDA orderPickupDA;
    private DeliveryDA deliveryDA;
    private PaymentDA paymentDA;
    private CountDA countDA;
    private Date today;
    
    public DeliveryAndPickupControl(){
        orderPickupDA = new OrderPickupDA();
        deliveryDA = new DeliveryDA();
        paymentDA = new PaymentDA();
        countDA = new CountDA();
        today = new Date();
        
        PICKUP_LIST = orderPickupDA.getAllPickup();
        DELIVERY_LIST = deliveryDA.getAllDelivery();
        DELIVERYBYDATE_LIST = deliveryDA.getDeliveryListByDate(new java.util.Date(today.getTime()));
        PAYMENT_LIST = paymentDA.getAllPayment();
        CUSTOMERORDER_LIST = paymentDA.getAllCustomerOrder();
        ORDERLIST_LIST = paymentDA.getAllOrderList();
        CATALOG_LIST = paymentDA.getAllCatalog();
        PAYMENT_COUNT = countDA.getCount().getPaymentCount();
    }
    
    //public OrderPickupList<OrderPickupInterface> getAllPickup(){
        //return PICKUP_LIST;
    //}
    
    public List<OrderPickupInterface> getAllPickup(){
        return PICKUP_LIST;
    }
    
    public List<DeliveryInterface> getAllDelivery(){
        return DELIVERY_LIST;
    }
    
    public List<DeliveryInterface> getDeliveryListByDate(){
        return DELIVERYBYDATE_LIST;
    }
    
    public List<PaymentInterface> getAllPayment(){
        return PAYMENT_LIST;
    }
    
    public List<CustomerOrderInterface> getAllCustomerOrder(){
        return CUSTOMERORDER_LIST;
    }
    
    public List<OrderListInterface> getAllOrderList(){
        return ORDERLIST_LIST;
    }
    
    public List<CatalogInterface> getAllCatalog(){
        return CATALOG_LIST;
    }
    
    public OrderPickupInterface getPickupByNo(String pickupNo){
        
        Iterator<OrderPickupInterface> pickupList = PICKUP_LIST.getIterator();
        OrderPickupInterface result = null;
        while(pickupList.hasNext()){
            OrderPickupInterface orderPickup = pickupList.next();
            if(orderPickup.getPickupNo().equals(pickupNo)){
                result = orderPickup;
                break;
            }
        }
        return result;
    }
    
    public void recordTimeStamp(OrderPickupInterface orderPickup){
        OrderPickupInterface pickup = this.getPickupByNo(orderPickup.getPickupNo());
        PICKUP_LIST.edit(pickup, orderPickup);
    }
    
    public PaymentInterface checkPayment(String orderNo){
        
        Iterator<PaymentInterface> paymentList = PAYMENT_LIST.getIterator();
        PaymentInterface result = null;
        while(paymentList.hasNext()){
            PaymentInterface payment = paymentList.next();
            if(payment.getOrderNo().equals(orderNo)){
                result = payment;
                break;
            }
        }
        return result;
    }
    
    public CustomerOrderInterface getPayment(String orderNo){
        
        Iterator<CustomerOrderInterface> customerOrderList = CUSTOMERORDER_LIST.getIterator();
        CustomerOrderInterface result = null;
        while(customerOrderList.hasNext()){
            CustomerOrderInterface customerOrder = customerOrderList.next();
            if(customerOrder.getOrderNo().equals(orderNo)){
                result = customerOrder;
                break;
            }
        }
        return result;
    }
    
    public CatalogInterface getProduct(String prodId){
        
        Iterator<CatalogInterface> catalogList = CATALOG_LIST.getIterator();
        CatalogInterface result = null;
        while(catalogList.hasNext()){
            CatalogInterface catalog = catalogList.next();
            if(catalog.getProdId().equals(prodId)){
                result = catalog;
                break;
            }
        }
        return result;
    }
    
    public PaymentInterface createPayment(String orderNo, Date paymentDate){
        String paymentNo = "P" +String.format("%03d", PAYMENT_COUNT);
        return new Payment(paymentNo, orderNo, paymentDate);
    }
    
    public void addPayment(PaymentInterface payment){
        PAYMENT_LIST.add(payment);
        PAYMENT_COUNT++;
    }
    
    public void updateDatabase(){
        Iterator<OrderPickupInterface> pickupList = PICKUP_LIST.getIterator();
        while(pickupList.hasNext()){
            OrderPickupInterface orderPickup = pickupList.next();
            if(orderPickupDA.getPickupByNo(orderPickup.getPickupNo()) != null){
                orderPickupDA.recordTimeStamp(orderPickup);
            }
        }
        
        Iterator<PaymentInterface> paymentList = PAYMENT_LIST.getIterator();
        while(paymentList.hasNext()){
            PaymentInterface payment = paymentList.next();
            if(paymentDA.checkPayment(payment.getOrderNo()) == null){
                paymentDA.addPayment(payment);
            }
        }
        countDA.increasePaymentCount();
    }
    
    public boolean pickupValidation(String pickupNo){
        if(pickupNo.length() != 4 || pickupNo.charAt(0) != 'P' || !Character.isDigit(pickupNo.charAt(1)) || !Character.isDigit(pickupNo.charAt(2))
                || !Character.isDigit(pickupNo.charAt(3)) ){
            return false;
        }
        else{
            return true;
        }
    }
    
    public boolean orderValidation(String orderNo){
        if(orderNo.length() != 4 || orderNo.charAt(0) != 'O' || !Character.isDigit(orderNo.charAt(1)) || !Character.isDigit(orderNo.charAt(2))
                || !Character.isDigit(orderNo.charAt(3)) ){
            return false;
        }
        else{
            return true;
        }
    }
}
