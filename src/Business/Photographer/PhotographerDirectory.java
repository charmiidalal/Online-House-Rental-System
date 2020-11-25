/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Photographer;

import Business.EcoSystem;
import java.util.ArrayList;

/**
 *
 * @author Charmi Dalal
 */
public class PhotographerDirectory {
    private ArrayList<Photographer> customerDirectory;
    
    public PhotographerDirectory(){
        customerDirectory = new ArrayList<Photographer>();
    }

    public ArrayList<Photographer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Photographer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public void deleteCustomer(int index,EcoSystem system){
        String id = customerDirectory.get(index).getCustomerNo();
        for(int i =0; i <system.getUserAccountDirectory().getUserAccountList().size();i++){
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName().equalsIgnoreCase(id)){
                system.getUserAccountDirectory().getUserAccountList().remove(i);
            }
        }
        customerDirectory.remove(index);
    }
    
    public void add(Photographer customer){
        customerDirectory.add(customer);
    }
    
    public Photographer getCustomerId(int index){
        return customerDirectory.get(index);
    }
    
    public void updateCustomer(String customerNo, String customerName, String customerPhone, String customerStreet,String customerZipcode,String customerEmail){
        for(Photographer customer: customerDirectory){
            if(customer.getCustomerNo().equalsIgnoreCase(customerNo)){
                customer.setCustomerName(customerName);
                customer.setCustomerPhone(customerPhone);
                customer.setCustomerStreet(customerStreet);
                customer.setCustomerZipcode(customerZipcode);
                customer.setCustomerEmail(customerEmail);
            }
        }
    }
    
    public boolean isPhoneUnique(String phone){
        for(Photographer customer: customerDirectory){
            if(customer.getCustomerPhone().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
    public boolean isEmailUnique(String email){
        for(Photographer customer: customerDirectory){
            if(customer.getCustomerEmail().equalsIgnoreCase(email)){
                return false;
            }
        }
        return true;
    }
    
    public Photographer getCustomer(String id){
        for(Photographer customer: customerDirectory){
            if(customer.getCustomerNo().equalsIgnoreCase(id)){
                return customer;
            }
        }
        return null;
    }
    
    public String generateCustomerID(){
        return "Customer"+(customerDirectory.size()+1);
    }
}
