/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PlumbingRequest;


import java.util.ArrayList;

/**
 *
 * @author Dinesh
 */
public class PlumbingRequestDirectory {
    private ArrayList<PlumbingRequest> plumbingRequestList = new ArrayList<PlumbingRequest>();

    public ArrayList<PlumbingRequest> getPlumbingRequestList() {
        return plumbingRequestList;
    }

    public void setPlumbingRequestList(ArrayList<PlumbingRequest> plumbingRequestList) {
        this.plumbingRequestList = plumbingRequestList;
    }
    
     public PlumbingRequest addPlumbingRequest(PlumbingRequest pr) {
        plumbingRequestList.add(pr);
        return pr;
    }

    public PlumbingRequest getPlumbingRequestByID(String id) {
        for (PlumbingRequest er : plumbingRequestList) {
            if (er.getRequestID().equalsIgnoreCase(id)) {
                return er;
            }
        }
        return null;
    }

    public PlumbingRequest fetchPlumbingRequest(String PlumberNo) {
        for (PlumbingRequest Prequest : plumbingRequestList) {
            if (Prequest.getRequestID().equalsIgnoreCase(PlumberNo)) {
                return Prequest;
            }
        }
        return null;
    }
}
