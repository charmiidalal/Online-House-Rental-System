/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ElectricianRequest;

import java.util.ArrayList;

/**
 *
 * @author Dinesh
 */
public class ElectricianRequestDirectory {
    private ArrayList<ElectricianRequest> electricianRequestList = new ArrayList<ElectricianRequest>();

    public ArrayList<ElectricianRequest> getElectricianRequestList() {
        return electricianRequestList;
    }

    public void setElectricianRequestList(ArrayList<ElectricianRequest> electricianRequestList) {
        this.electricianRequestList = electricianRequestList;
    }
    
     public ElectricianRequest addElectricianRequest(ElectricianRequest er) {
        electricianRequestList.add(er);
        return er;
    }

    public ElectricianRequest getElectricianRequestByID(String id) {
        for (ElectricianRequest er : electricianRequestList) {
            if (er.getRequestID().equalsIgnoreCase(id)) {
                return er;
            }
        }
        return null;
    }

    public ElectricianRequest fetchElectricianRequest(String ElectricianNo) {
        for (ElectricianRequest Erequest : electricianRequestList) {
            if (Erequest.getRequestID().equalsIgnoreCase(ElectricianNo)) {
                return Erequest;
            }
        }
        return null;
    }
}
