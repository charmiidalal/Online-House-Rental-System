/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inspector;

import Business.EcoSystem;
import java.util.ArrayList;

/**
 *
 * @author Dinesh
 */
public class InspectorDirectory {
    
    ArrayList<Inspector> inspectorList = new ArrayList<Inspector>();

    public ArrayList<Inspector> getInsepectorList() {
        return inspectorList;
    }

    public void setInspectorList(ArrayList<Inspector> buyerList) {
        this.inspectorList = buyerList;
    }
    public void addInspector(Inspector inspector){
        inspectorList.add(inspector);
    }
    public void removeInespector(Inspector inspector){
        inspectorList.remove(inspector);
    }


public String generateInspectorID(){
        return "Inspector"+(inspectorList.size()+1);
    } 
}
