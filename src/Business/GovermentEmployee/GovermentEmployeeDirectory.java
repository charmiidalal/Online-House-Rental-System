/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GovermentEmployee;

import Business.EcoSystem;
import java.util.ArrayList;

/**
 *
 * @author Charmi Dalal
 */
public class GovermentEmployeeDirectory {
    private ArrayList<GovermentEmployee> customerDirectory;
    
    public GovermentEmployeeDirectory(){
        customerDirectory = new ArrayList<GovermentEmployee>();
    }

    public ArrayList<GovermentEmployee> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<GovermentEmployee> customerDirectory) {
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
    
    public void add(GovermentEmployee customer){
        customerDirectory.add(customer);
    }
    
    public GovermentEmployee getCustomerId(int index){
        return customerDirectory.get(index);
    }
    
    public void updateCustomer(String customerNo, String customerName, String customerPhone, String customerStreet,String customerZipcode,String customerEmail){
        for(GovermentEmployee customer: customerDirectory){
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
        for(GovermentEmployee customer: customerDirectory){
            if(customer.getCustomerPhone().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
    public boolean isEmailUnique(String email){
        for(GovermentEmployee customer: customerDirectory){
            if(customer.getCustomerEmail().equalsIgnoreCase(email)){
                return false;
            }
        }
        return true;
    }
    
    public GovermentEmployee getCustomer(String id){
        for(GovermentEmployee customer: customerDirectory){
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
