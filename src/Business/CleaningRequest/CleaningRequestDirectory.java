/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CleaningRequest;

import java.util.ArrayList;

/**
 *
 * @author Dinesh
 */
public class CleaningRequestDirectory {
    private ArrayList<CleaningRequest> cleaningRequestList  = new ArrayList<CleaningRequest>();

    public ArrayList<CleaningRequest> getCleaningRequestList() {
        return cleaningRequestList;
    }

    public void setCleaningRequestList(ArrayList<CleaningRequest> cleaningRequestList) {
        this.cleaningRequestList = cleaningRequestList;
    }
    
    public CleaningRequest addCleaningRequest(CleaningRequest cr) {
        cleaningRequestList.add(cr);
        return cr;
    }

    public CleaningRequest getCleaningRequestByID(String id) {
        for (CleaningRequest cr : cleaningRequestList) {
            if (cr.getRequestID().equalsIgnoreCase(id)) {
                return cr;
            }
        }
        return null;
    }

    public CleaningRequest fetchCleaningRequest(String CleaningNo) {
        for (CleaningRequest Crequest : cleaningRequestList) {
            if (Crequest.getRequestID().equalsIgnoreCase(CleaningNo)) {
                return Crequest;
            }
        }
        return null;
    }
    public String generateCleaningRequestID() {
        return "CleaningRequest" + (cleaningRequestList.size() + 1);
    }
}
