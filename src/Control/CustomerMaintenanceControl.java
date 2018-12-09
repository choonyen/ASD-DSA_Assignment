/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Model.*;
import DA.*;
import java.util.Iterator;

/**
 *
 * @author LENOVO
 */
public class CustomerMaintenanceControl {
    private static List<CustomerInterface> CONSUMER_LIST;
    private static List<CorporateCustomerInterface> CORPORATE_CUSTOMER_LIST;
    private static int CONSUMER_COUNT;
    private static int CORPORATE_CUSTOMER_COUNT;
    
    CustomerDA customerDA;
    CountDA countDA;
    
    public CustomerMaintenanceControl(){
        customerDA = new CustomerDA();
        countDA = new CountDA();
        CONSUMER_LIST = customerDA.getAllConsumer();
        CORPORATE_CUSTOMER_LIST = customerDA.getAllCorporateCustomer();
        CONSUMER_COUNT = countDA.getCount().getCustomerCount();
        CORPORATE_CUSTOMER_COUNT = countDA.getCount().getCorporateCustomerCount();
    }
    
    public List<CustomerInterface> getAllConsumer(){
        return CONSUMER_LIST;
    }
    
    public List<CorporateCustomerInterface> getAllCorporateCustomer(){
        return CORPORATE_CUSTOMER_LIST;
    }
    
    public CustomerInterface createConsumer(String name, String ic,char gender, String contact){
        String custId = "C" + String.format("%03d", CONSUMER_COUNT);
        return new Consumer(custId, name, ic, gender, contact);
    }
    
    public CorporateCustomerInterface createCorporateCustomer(String name, String ic,char gender, String contact, String companyName, String location, Double creditLimit){
        String custId = "V" + String.format("%03d", CORPORATE_CUSTOMER_COUNT);
        return new CorporateCustomer(custId, name, ic, gender, contact, companyName, location, creditLimit, creditLimit);
    }
    
    public void addConsumer(CustomerInterface consumer){
        CONSUMER_LIST.add(consumer);
        CONSUMER_COUNT ++;
    }
    
    public void addCorporateCustomer(CorporateCustomerInterface corporateCustomer){
        CORPORATE_CUSTOMER_LIST.add(corporateCustomer);
        CORPORATE_CUSTOMER_COUNT ++;
    }
    
    public CustomerInterface getConsumerById(String id){
        Iterator<CustomerInterface> consumerList = CONSUMER_LIST.getIterator();
        CustomerInterface result = null;
        while(consumerList.hasNext()){
            CustomerInterface consumer = consumerList.next();
            if(consumer.getCustID().equals(id)){
                result = consumer;
                break;
            }

        }
        return result;
    }
    
    public CustomerInterface getConsumerByIc(String ic){
        Iterator<CustomerInterface> consumerList = CONSUMER_LIST.getIterator();
        CustomerInterface result = null;
        while(consumerList.hasNext()){
            CustomerInterface consumer = consumerList.next();
            if(consumer.getIc().equals(ic)){
                result = consumer;
                break;
            }

        }
        return result;
    }
    
    public CorporateCustomerInterface getCorporateCustomerById(String id){
        Iterator<CorporateCustomerInterface> corporateCustomerList = CORPORATE_CUSTOMER_LIST.getIterator();
        CorporateCustomerInterface result = null;
        while(corporateCustomerList.hasNext()){
            CorporateCustomerInterface corporateCustomer = corporateCustomerList.next();
            if(corporateCustomer.getCustID().equals(id)){
                result = corporateCustomer;
                break;
            }
            
        }
        return result;

    }
    
    public CorporateCustomerInterface getCorporateCustomerByIc(String ic){
        Iterator<CorporateCustomerInterface> corporateCustomerList = CORPORATE_CUSTOMER_LIST.getIterator();
        CorporateCustomerInterface result = null;
        while(corporateCustomerList.hasNext()){
            CorporateCustomerInterface corporateCustomer = corporateCustomerList.next();
            if(corporateCustomer.getIc().equals(ic)){
                result = corporateCustomer;
                break;
            }
            
        }
        return result;

    }
    
    public void updateConsumer(CustomerInterface consumer){
        CustomerInterface oldConsumer = this.getConsumerById(consumer.getCustID());
        CONSUMER_LIST.edit(oldConsumer, consumer);
        
    }
    
    public void updateCorporateCustomer(CorporateCustomerInterface corporateCustomer){
        CorporateCustomerInterface oldCorporateCustomer = this.getCorporateCustomerById(corporateCustomer.getCustID());
        CONSUMER_LIST.edit(oldCorporateCustomer, corporateCustomer);
        
    }
    
    
    
    public String isValid(String name, String ic, String contact){
        String errorMsg = "";
        
        if(name.equals("")){
            errorMsg += "*Name cannot be empty.\n";
        }
        if(ic.equals("")){
            errorMsg += "*IC No cannot be empty.\n";
        }
        if(!icValidation(ic) && !ic.equals("")){
            errorMsg += "*Invalid IC No. format.\n";
        }
        if(contact.equals("")){
            errorMsg += "*Contact No. cannot be empty.\n";
        }
        if((!contactValidation(contact)) && !contact.equals("")){
            errorMsg += "*Invalid Contact No. format\n";
        }
        return errorMsg;
    }
    
    
    public void updateDatabase(){
        Iterator<CustomerInterface> consumerList = CONSUMER_LIST.getIterator();
        while(consumerList.hasNext()){
            CustomerInterface consumer = consumerList.next();
            if(customerDA.getConsumer(consumer.getCustID())!=null)
                customerDA.updateConsumer(consumer);
            else
                customerDA.addConsumer(consumer);
        }
        Iterator<CorporateCustomerInterface> corporateCustomerList = CORPORATE_CUSTOMER_LIST.getIterator();
        while(corporateCustomerList.hasNext()){
            CorporateCustomerInterface corporateCustomer = corporateCustomerList.next();
            if(customerDA.getCorporateCustomer(corporateCustomer.getCustID())!=null)
                customerDA.updateCorporateCustomer(corporateCustomer);
            else
                customerDA.addCorporateCustomer(corporateCustomer);
        }
        
        countDA.increaseCorporateCustomerCount(CORPORATE_CUSTOMER_COUNT);
        countDA.increaseCustomerCount(CONSUMER_COUNT);
        
    }
    
    
    public String isValid(String name, String ic, String contact, String companyName, String location, String creditLimitStr){
        String errorMsg = isValid(name,ic,contact);
        if(creditLimitStr.equals("")){
            errorMsg += "*Credit Limit cannot be empty.\n";
        }
        if(!creditLimitStr.equals("")){
            try{
                double creditLimit = Double.parseDouble(creditLimitStr);
                if(creditLimit < 1000){
                    errorMsg += "Credit Limit must greater than 1000. \n";

                }
            }catch(NumberFormatException ex){
                errorMsg += "Invalid amount, must be number.\n";

            }
        }
        
        if(companyName.equals("")){
            errorMsg += "*Company Name cannot be empty.\n";

        }
        if(location.equals("")){
            errorMsg += "*Location cannot be empty.\n";

        }
        return errorMsg;
    }
    
    private boolean contactValidation(String contact){
        if(contact.matches("[\\d]{3}-[\\d]{7,8}")){
            if(contact.charAt(0) == '0' && contact.charAt(1) == '1')
                return true;
        }
        return false;
    }
    
    public boolean custIdValidation(String custId){
        if(custId.length()!=4 || (custId.charAt(0)!='C' && custId.charAt(0)!='V')||
                !Character.isDigit(custId.charAt(1))||!Character.isDigit(custId.charAt(2))||
                !Character.isDigit(custId.charAt(3)))
            return false;
        else
            return true;
    }
    
    private boolean icValidation(String ic){       
        if(ic.length() == 14){
            if(ic.charAt(6) == '-' && ic.charAt(9) == '-'){
                for(int i = 0; i < ic.length(); i++){
                    if(i!=6 && i != 9){
                        if(!Character.isDigit(ic.charAt(i))){
                            return false;
                        }
                    }
                }
                return true;
            
            }
            else{
                return false;
            } 
        }
        else{
            return false;
        }
    }
    
  
}
