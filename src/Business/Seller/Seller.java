/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller;


/**
 *
 * @author Dinesh 
 */
public class Seller {
    private String sellerNo;
    private String sellerName;
    private String sellerPhone;
    private String sellerStreet;
    private String sellerZipcode;
    private String sellerEmail;
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

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone;
    }

    public String getSellerStreet() {
        return sellerStreet;
    }

    public void setSellerStreet(String sellerStreet) {
        this.sellerStreet = sellerStreet;
    }

    public String getSellerZipcode() {
        return sellerZipcode;
    }

    public void setSellerZipcode(String sellerZipcode) {
        this.sellerZipcode = sellerZipcode;
    }

    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }
    
    
}
