/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller;

import javax.swing.ImageIcon;

/**
 *
 * @author anush
 */
public class Advertisement {
    private String name;
    private String address;
    private String zipcode;
    private String city;
    private String state;
   private ImageIcon uploadImg;
   private int bhk;
   private double bathroom;
   private double rent;
   
   /* public Advertisement(String name,String address,String zipcode,String city,String state,ImageIcon uploadImg, int bhk,double bathroom,double rent) {
       this.name = name;
       this.address=address;
       this.bhk=bhk;
       this.bathroom=bathroom;
       this.rent=rent;
       this.zipcode=zipcode;
       this.city=city;
       this.state=state;
       this.uploadImg=uploadImg;
        
    }*/
   
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
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

    public ImageIcon getUploadImg() {
        return uploadImg;
    }

    public void setUploadImg(ImageIcon uploadImg) {
        this.uploadImg = uploadImg;
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

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }
    
}
