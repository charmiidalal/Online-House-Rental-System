/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Buyer;


import java.util.ArrayList;

/**
 *
 * @author Charmi Dalal
 */
public class BuyerDirectory {
   ArrayList<Buyer> buyerList = new ArrayList<Buyer>();

    public ArrayList<Buyer> getBuyerList() {
        return buyerList;
    }

    public void setBuyerList(ArrayList<Buyer> buyerList) {
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
            if (buyers.getBuyerName().equals(buyerName)) {
                return buyers;
            }
        }
        return null;
    }
    public String generateBuyerID(){
        return "Buyer"+(buyerList.size()+1);
    }
    
     public Buyer getBuyer(String name){
        for(Buyer buyer: buyerList){
            if(buyer.getBuyerName().equalsIgnoreCase(name)){
                return buyer;
            }
        }
        return null;
    }
    
}
