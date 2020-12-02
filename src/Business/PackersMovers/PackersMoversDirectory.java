/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PackersMovers;

import java.util.ArrayList;

/**
 *
 * @author Dinesh
 */
public class PackersMoversDirectory {

    ArrayList<PackersMovers> packersMoversList = new ArrayList<PackersMovers>();

    public ArrayList<PackersMovers> getPackersMoversList() {
        return packersMoversList;
    }

    public void setPackersMoversList(ArrayList<PackersMovers> packersMoversList) {
        this.packersMoversList = packersMoversList;
    }

    public void addPackersMovers(PackersMovers packersMovers) {
        packersMoversList.add(packersMovers);
    }

    public void removePackersMovers(PackersMovers packersMovers) {
        packersMoversList.remove(packersMovers);
    }

    public String generatePackersMoversID() {
        return "PackersMovers" + (packersMoversList.size() + 1);
    }

}
