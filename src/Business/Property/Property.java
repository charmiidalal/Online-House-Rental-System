/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Property;

import Business.Seller.Seller;
import java.awt.image.BufferedImage;

/**
 *
 * @author Dinesh
 */
public class Property {
    private String PropertyID;
    private String propertyName;
    private String city;
    private String state;
    private String pincode;
    private int price;
    private BufferedImage img;
    private int bhk;
    private double bathroom;
    private Seller seller;

    public Property(String PropertyID, String propertyName, String city, String state, String pincode, int price, BufferedImage img, int bhk, double bathroom, Seller seller) {
        this.PropertyID = PropertyID;
        this.propertyName = propertyName;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.price = price;
        this.img = img;
        this.bhk = bhk;
        this.bathroom = bathroom;
        this.seller = seller;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
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
    
    
    
    
    

    public String getPropertyID() {
        return PropertyID;
    }

    public void setPropertyID(String PropertyID) {
        this.PropertyID = PropertyID;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
