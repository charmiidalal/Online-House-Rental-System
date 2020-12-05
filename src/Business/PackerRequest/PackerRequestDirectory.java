/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PackerRequest;

import java.util.ArrayList;

/**
 *
 * @author Dinesh
 */
public class PackerRequestDirectory {
    private ArrayList<PackerRequest> packerRequestList= new ArrayList<PackerRequest>();

    public ArrayList<PackerRequest> getPackerRequestList() {
        return packerRequestList;
    }

    public void setPackerRequestList(ArrayList<PackerRequest> packerRequestList) {
        this.packerRequestList = packerRequestList;
    }
    
     public PackerRequest addPackerRequest(PackerRequest cr) {
        packerRequestList.add(cr);
        return cr;
    }

    public PackerRequest getPackerRequestByID(String id) {
        for (PackerRequest pr : packerRequestList) {
            if (pr.getRequestID().equalsIgnoreCase(id)) {
                return pr;
            }
        }
        return null;
    }

    public PackerRequest fetchPackerRequest(String packerNo) {
        for (PackerRequest Prequest : packerRequestList) {
            if (Prequest.getRequestID().equalsIgnoreCase(packerNo)) {
                return Prequest;
            }
        }
        return null;
    }
    public String generatePackersRequestID() {
        return "PackerRequest" + (packerRequestList.size() + 1);
    }
}
