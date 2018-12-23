/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
public class OrderList {
    private String OrderNo;
    private String ProdID;
    private int Quantity;
    private int Amount;

    public OrderList(String OrderNo, String ProdID, int Quantity, int Amount) {
        this.OrderNo = OrderNo;
        this.ProdID = ProdID;
        this.Quantity = Quantity;
        this.Amount = Amount;
    }

    public OrderList() {
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public String getProdID() {
        return ProdID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public int getAmount() {
        return Amount;
    }

    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    public void setProdID(String ProdID) {
        this.ProdID = ProdID;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    @Override
    public String toString() {
        return "OrderList{" + "OrderNo=" + OrderNo + ", ProdID=" + ProdID + ", Quantity=" + Quantity + ", Amount=" + Amount + '}';
    }
    
    
}
