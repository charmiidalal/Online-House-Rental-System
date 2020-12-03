/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller;

import Business.UserAccount.UserAccount;


/**
 *
 * @author Dinesh 
 */
public class Seller extends UserAccount {
    private String sellerNo;
    private String Name;
    private String Phone;
    private String Street;
    private String Zipcode;
    private String Email;
    private String City;
    private String State;
    private Boolean isApproved;
    private String username;

//     public Seller(String sellerNo, String sellerName,String sellerPhone,String sellerStreet,String sellerZipcode,String sellerEmail) {
//        this.sellerNo = sellerNo;
//        this.sellerName=sellerName;
//        this.sellerPhone=sellerPhone;
//        this.sellerStreet=sellerStreet;
//        this.sellerZipcode = sellerZipcode;
//        this.sellerEmail=sellerEmail;
//    }
     
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    

    public Boolean getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(Boolean isApproved) {
        this.isApproved = isApproved;
    }

    public String getSellerNo() {
        return sellerNo;
    }

    public void setSellerNo(String sellerNo) {
        this.sellerNo = sellerNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String Zipcode) {
        this.Zipcode = Zipcode;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    
    
    
    
}
