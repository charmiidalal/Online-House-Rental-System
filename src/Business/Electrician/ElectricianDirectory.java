/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Electrician;

import Business.ElectricianRequest.ElectricianRequest;
import Business.InspectRequest.InspectRequest;
import java.util.ArrayList;

/**
 *
 * @author Charmi Dalal
 */
public class ElectricianDirectory {

    ArrayList<Electrician> electricianList = new ArrayList<Electrician>();

    public ArrayList<Electrician> getElectricianList() {
        return electricianList;
    }

    public void setElectricianList(ArrayList<Electrician> electricianList) {
        this.electricianList = electricianList;
    }

    public void addElectrician(Electrician electrician) {
        electricianList.add(electrician);
    }

    public void removeElectrician(Electrician electrician) {
        electricianList.remove(electrician);
    }
  

    public String generateElectricianID() {
        return "Electrician" + (electricianList.size() + 1);
    }

       public Electrician fetchElectrician(String ElectricianNo) {
        for (Electrician electrician : electricianList) {
            if (electrician.getElectricianNo().equalsIgnoreCase(ElectricianNo)) {
                return electrician;
            }
        }
        return null;
    }
}
