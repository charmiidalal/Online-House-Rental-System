
/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller;

import java.util.ArrayList;

/**
 *
 * @author anush
 */
public class AdvertisementDirectory {

     private ArrayList<Advertisement> advertisementList;

    public AdvertisementDirectory() {
         advertisementList = new ArrayList<Advertisement>();
    }
  

    public ArrayList<Advertisement> getAdvertisementList() {
        return advertisementList;
    }

    public void setAdvertisementList(ArrayList<Advertisement> advertisementList) {
        this.advertisementList = advertisementList;
    }

    

    public void addAdvertisement(Advertisement advertisement) {
        advertisementList.add(advertisement);
    }

    public void removeAdvertisement(Advertisement advertisement) {
        advertisementList.remove(advertisement);
    }
}
