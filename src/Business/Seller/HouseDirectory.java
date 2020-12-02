/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller;

import java.util.ArrayList;

/**
 *
 * @author anush
 */
public class HouseDirectory {
    ArrayList<House> houseList = new ArrayList<House>();

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }
    public void addHouse(House house){
        houseList.add(house);
    }
    
    public void removeHouse(House house){
        houseList.remove(house);
    }
}
