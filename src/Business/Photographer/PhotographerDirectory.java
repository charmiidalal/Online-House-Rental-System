/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Photographer;

import java.util.ArrayList;

/**
 *
 * @author Charmi Dalal
 */
public class PhotographerDirectory {
    ArrayList<Photographer> PhotographerList = new ArrayList<Photographer>();

    public ArrayList<Photographer> getPhotographerList() {
        return PhotographerList;
    }

    public void setPhotographerList(ArrayList<Photographer> PhotographerList) {
        this.PhotographerList = PhotographerList;
    }
    
    public void addPhotographer(Photographer photographer) {
        PhotographerList.add(photographer);

    }

    public void removePhotographer(Photographer photographer) {
        PhotographerList.remove(photographer);
    }
    
    public String generatePhotographerID(){
        return "Photographer"+(PhotographerList.size()+1);
    }
    
    public Photographer fetchPhotographer(String PhotographerNo) {
        for (Photographer photographer : PhotographerList) {
            if (photographer.getPhotographerNo().equalsIgnoreCase(PhotographerNo)) {
                return photographer;
            }
        }
        return null;
    }
}
