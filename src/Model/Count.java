/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LENOVO
 */
public class Count {
    private int customerCount;
    private int productCount;
    private int orderCount;
    private int corporateCustomerCount;
    private int deliveryCount;
    private int pickupCount;
    private int invoiceCount;
    private int customizedOrderCount;
    private int paymentCount;
    private int promotionCount;
    
    public Count() {
    }

    public Count(int customerCount, int productCount, int orderCount, int corporateCustomerCount, int deliveryCount, int pickupCount, int invoiceCount, int customizedOrderCount, int paymentCount, int promotionCount) {
        this.customerCount = customerCount;
        this.productCount = productCount;
        this.orderCount = orderCount;
        this.corporateCustomerCount = corporateCustomerCount;
        this.deliveryCount = deliveryCount;
        this.pickupCount = pickupCount;
        this.invoiceCount = invoiceCount;
        this.customizedOrderCount = customizedOrderCount;
        this.paymentCount = paymentCount;
        this.promotionCount = promotionCount;
    }

    public int getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(int customerCount) {
        this.customerCount = customerCount;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public int getCorporateCustomerCount() {
        return corporateCustomerCount;
    }

    public void setCorporateCustomerCount(int corporateCustomerCount) {
        this.corporateCustomerCount = corporateCustomerCount;
    }

    public int getDeliveryCount() {
        return deliveryCount;
    }

    public void setDeliveryCount(int deliveryCount) {
        this.deliveryCount = deliveryCount;
    }

    public int getPickupCount() {
        return pickupCount;
    }

    public void setPickupCount(int pickupCount) {
        this.pickupCount = pickupCount;
    }

    public int getInvoiceCount() {
        return invoiceCount;
    }

    public void setInvoiceCount(int invoiceCount) {
        this.invoiceCount = invoiceCount;
    }

    public int getCustomizedOrderCount() {
        return customizedOrderCount;
    }

    public void setCustomizedOrderCount(int customizedOrderCount) {
        this.customizedOrderCount = customizedOrderCount;
    }

    public int getPaymentCount() {
        return paymentCount;
    }

    public void setPaymentCount(int paymentCount) {
        this.paymentCount = paymentCount;
    }

    public int getPromotionCount() {
        return promotionCount;
    }

    public void setPromotionCount(int promotionCount) {
        this.promotionCount = promotionCount;
    }
    
    
}
