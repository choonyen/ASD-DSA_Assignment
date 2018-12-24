/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author lamzn
 */
public class Promotion implements PromotionInterface{

    public Promotion(String Promoid) {
        this.Promoid = Promoid;
    }
    
    private String Promoid;
    private Date StartDate;
    private Date EndDate;
    
      
    public Promotion(){
        
    }
    
    public Promotion(String Promoid, Date StartDate, Date EndDate){
        this.Promoid = Promoid;
        this.StartDate = StartDate;
        this.EndDate = EndDate;

 
    }
    
      public String getPromoID() {
        return Promoid;
    }

    public void setPromoID(String Promoid) {
        this.Promoid = Promoid;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }


    
    
}
