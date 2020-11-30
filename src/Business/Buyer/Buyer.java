/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Buyer;

import Business.UserAccount.UserAccount;

/**
 *
 * @author Charmi Dalal
 */
public class Buyer extends UserAccount {
    private String buyerNo;
    private String buyerName;
    private String buyerPhone;
    private String buyerStreet;
    private String buyerZipcode;
    private String buyerEmail;

    public String getBuyerNo() {
        return buyerNo;
    }

    public void setBuyerNo(String buyerNo) {
        this.buyerNo = buyerNo;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getBuyerStreet() {
        return buyerStreet;
    }

    public void setBuyerStreet(String buyerStreet) {
        this.buyerStreet = buyerStreet;
    }

    public String getBuyerZipcode() {
        return buyerZipcode;
    }

    public void setBuyerZipcode(String buyerZipcode) {
        this.buyerZipcode = buyerZipcode;
    }

    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }
    

      
}
