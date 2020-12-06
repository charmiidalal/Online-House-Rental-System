/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ManagerRequest;

import java.util.ArrayList;

/**
 *
 * @author Dinesh
 */
public class ManagerRequestDirectory {
    private ArrayList<ManagerRequest> managerequestList = new ArrayList<ManagerRequest>();

    public ArrayList<ManagerRequest> getmanagerRequestList() {
        return managerequestList;
    }

    public void setmanagerRequestList(ArrayList<ManagerRequest> managerequestList) {
        this.managerequestList = managerequestList;
    }
    
      public ManagerRequest addManagerRequest(ManagerRequest ir) {
        managerequestList.add(ir);
        return ir;
    }

    public ManagerRequest getManagerRequestByID(String id) {
        for (ManagerRequest ir : managerequestList) {
            if (ir.getRequestID().equalsIgnoreCase(id)) {
                return ir;
            }
        }
        return null;
    }

    public ManagerRequest fetchManagerRequest(String InspectorNo) {
        for (ManagerRequest managerRequest : managerequestList) {
            if (managerRequest.getRequestID().equalsIgnoreCase(InspectorNo)) {
                return managerRequest;
            }
        }
        return null;
    }
    
    public String generateManagerRequestID() {
        return "ManagerRequest" + (managerequestList.size() + 1);
    }
}
