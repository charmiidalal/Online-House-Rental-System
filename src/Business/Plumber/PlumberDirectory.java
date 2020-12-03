/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Plumber;

import java.util.ArrayList;

/**
 *
 * @author Dinesh
 */
public class PlumberDirectory {

    ArrayList<Plumber> plumberist = new ArrayList<Plumber>();

    public ArrayList<Plumber> getPlumberist() {
        return plumberist;
    }

    public void setPlumberist(ArrayList<Plumber> plumberist) {
        this.plumberist = plumberist;
    }
    
    public void addPlumber(Plumber plumber) {
        plumberist.add(plumber);
    }

    public void removePlumber(Plumber plumber) {
        plumberist.remove(plumber);
    }

    public String generatePlumberID() {
        return "Plumber" + (plumberist.size() + 1);
    }

}
