/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InspectRequest;

import java.util.ArrayList;

/**
 *
 * @author Dinesh
 */
public class InspectRequestDirectory {

    private ArrayList<InspectRequest> inspectRequestList = new ArrayList<InspectRequest>();

    public ArrayList<InspectRequest> getInspectRequestDirectory() {
        return inspectRequestList;
    }

    public void setInspectRequestDirectory(ArrayList<InspectRequest> inspectRequestDirectory) {
        this.inspectRequestList = inspectRequestDirectory;
    }

    public InspectRequest addInspectRequest(InspectRequest ir) {
        inspectRequestList.add(ir);
        return ir;
    }

    public InspectRequest getInpectRequestByID(String id) {
        for (InspectRequest ir : inspectRequestList) {
            if (ir.getRequestID().equalsIgnoreCase(id)) {
                return ir;
            }
        }
        return null;
    }

    public InspectRequest fetchInspectorRequest(String InspectorNo) {
        for (InspectRequest inspectrequest : inspectRequestList) {
            if (inspectrequest.getRequestID().equalsIgnoreCase(InspectorNo)) {
                return inspectrequest;
            }
        }
        return null;
    }

}
