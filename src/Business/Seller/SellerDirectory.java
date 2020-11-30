/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller;

import java.util.ArrayList;

/**
 *
 * @author Dinesh
 */
public class SellerDirectory {
   private ArrayList<Seller> sellerDirectory;

    public SellerDirectory(ArrayList<Seller> sellerDirectory) {
        this.sellerDirectory = sellerDirectory;
    }

    public ArrayList<Seller> getSellerDirectory() {
        return sellerDirectory;
    }

    public void setSellerDirectory(ArrayList<Seller> sellerDirectory) {
        this.sellerDirectory = sellerDirectory;
    }
    
       public Seller getSellerName(String name){
        for(Seller seller: sellerDirectory){
            if(seller.getName().equalsIgnoreCase(name)){
                return seller;
            }
        }
        return null;
    }
   
   
}
