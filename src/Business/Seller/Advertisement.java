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
   
    public Advertisement(String name,String address,String zipcode,String city,String state,ImageIcon uploadImg, int bhk,double bathroom,double rent) {
       this.name = name;
       this.address=address;
       this.bhk=bhk;
       this.bathroom=bathroom;
       this.rent=rent;
       this.zipcode=zipcode;
       this.city=city;
       this.state=state;
       this.uploadImg=uploadImg;
        
    }
}
