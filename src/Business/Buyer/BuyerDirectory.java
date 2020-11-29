/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Buyer;

import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author Charmi Dalal
 */
public class BuyerDirectory {
   ArrayList<Buyer> buyerList = new ArrayList<Buyer>();

    public ArrayList<Buyer> getbuyerList() {
        return buyerList;
    }

    public void setCustomerList(ArrayList<Buyer> buyerList) {
        this.buyerList = buyerList;
    }
    public void addBuyer(Buyer buyer){
        buyerList.add(buyer);
    }
    public void removeCustomer(Buyer buyer){
        buyerList.remove(buyer);
    }
    public Buyer searchBuyer(String buyerName){
        for (Buyer buyers: buyerList) {
            if (buyers.getName().equals(buyerName)) {
                return buyers;
            }
        }
        return null;
    }
}