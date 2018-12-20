/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MSI GL62 6QF
 */
public interface OrderListInterface {
    
    public String getOrderNo();
    public void setOrderNo(String orderNo);
    public String getProdId();
    public void setProdId(String prodId);
    public int getQuantity();
    public void setQuantity(int quantity);
    public Double getAmount();
    public void setAmount(Double amount);   
}
