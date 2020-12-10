/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Property;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dinesh
 */
public class Property {

    private ImageIcon uploadImg;
    private String PropertyID;
    private String propertyName;
    private String street;
    private String city;
    private String state;
    private String pincode;
    private String status;
    private double price;
    private int bhk;
    private double bathroom;
    private UserAccount seller;
    private UserAccount buyer;

    ArrayList<ImageIcon> images = new ArrayList<>();

   
   
    ArrayList<UserAccount> RegisteredBuyer = new ArrayList<UserAccount>();

    public ArrayList<UserAccount> getRegisteredBuyer() {
        return RegisteredBuyer;
    }

    public void setRegisteredBuyer(ArrayList<UserAccount> RegisteredBuyer) {
        this.RegisteredBuyer = RegisteredBuyer;
    }

   
    public ArrayList<ImageIcon> getImages() {
        return images;
    }

    public void setImages(ArrayList<ImageIcon> images) {
        this.images = images;
    }
    ArrayList<UserAccount> buyerList = new ArrayList<UserAccount>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<UserAccount> getBuyerList() {
        return buyerList;
    }

    public void setBuyerList(ArrayList<UserAccount> buyerList) {
        this.buyerList = buyerList;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBhk() {
        return bhk;
    }

    public void setBhk(int bhk) {
        this.bhk = bhk;
    }

    public double getBathroom() {
        return bathroom;
    }

    public void setBathroom(double bathroom) {
        this.bathroom = bathroom;
    }

    public ImageIcon getUploadImg() {
        return uploadImg;
    }

    public void setUploadImg(ImageIcon uploadImg) {
        this.uploadImg = uploadImg;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPropertyID() {
        return PropertyID;
    }

    public void setPropertyID(String PropertyID) {
        this.PropertyID = PropertyID;
    }

    public UserAccount getSeller() {
        return seller;
    }

    public void setSeller(UserAccount seller) {
        this.seller = seller;
    }

    public UserAccount getBuyer() {
        return buyer;
    }

    public void setBuyer(UserAccount buyer) {
        this.buyer = buyer;
    }

    @Override
    public String toString() {
        return propertyName;
    }

   
}
