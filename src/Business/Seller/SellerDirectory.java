/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dinesh
 */
public class SellerDirectory {

    ArrayList<Seller> sellerList = new ArrayList<Seller>();

    public ArrayList<Seller> getSellerList() {
        return sellerList;
    }

    public void setSellerList(ArrayList<Seller> sellerList) {
        this.sellerList = sellerList;
    }

    public void addSeller(Seller seller) {
        sellerList.add(seller);

    }

    public void removeSeller(Seller seller) {
        sellerList.remove(seller);
    }

    public Seller searchseller(String sellerName) {
//        for (Buyer buyers: buyerList) {
//            if (buyers.getName().equals(buyerName)) {
//                return buyers;
//            }
//        }
        return null;
    }

    public String generateSellerID() {
        return "Seller" + (sellerList.size() + 1);
    }

    public Seller fetchSeller(String SellerNo) {
        for (Seller seller : sellerList) {
            if (seller.getSellerNo().equalsIgnoreCase(SellerNo)) {
                return seller;
            }
        }
        return null;
    }

    ///./////// need to change ///////////////
    public Seller getSellerByIndex(int index) {
        return sellerList.get(index);
    }

    public void add(String sellerID, String name, int bhk, double bathroom, ImageIcon img, double price) {
       
    }
}
