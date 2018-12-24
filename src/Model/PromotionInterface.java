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
public interface PromotionInterface {
    
    
    public void setPromoID(String promoid); 
    public String getPromoID();
    public Date getStartDate();
    public void setStartDate(Date startdate) ;
    public Date getEndDate();
    public void setEndDate(Date enddate) ;

}
