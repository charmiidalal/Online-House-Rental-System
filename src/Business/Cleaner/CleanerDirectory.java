/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Cleaner;

import java.util.ArrayList;

/**
 *
 * @author Dinesh
 */
public class CleanerDirectory {

    ArrayList<Cleaner> cleanerList = new ArrayList<Cleaner>();

    public ArrayList<Cleaner> getCleanerList() {
        return cleanerList;
    }

    public void setCleanerList(ArrayList<Cleaner> cleanerList) {
        this.cleanerList = cleanerList;
    }
    
    public void addCleaner(Cleaner cleaner) {
        cleanerList.add(cleaner);
    }

    public void removeCleaner(Cleaner cleaner) {
        cleanerList.remove(cleaner);
    }

    public String generateCleanerID() {
        return "Cleaner" + (cleanerList.size() + 1);
    }

}
