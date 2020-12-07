/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BuilderRequest;

import java.util.ArrayList;

/**
 *
 * @author Dinesh
 */
public class BuilderRequestDirectory {
      private ArrayList<BuilderRequest> builderRequestList  = new ArrayList<BuilderRequest>();

    public ArrayList<BuilderRequest> getBuilderRequestList() {
        return builderRequestList;
    }

    public void setBuilderRequestList(ArrayList<BuilderRequest> builderRequestList) {
        this.builderRequestList = builderRequestList;
    }
      
       public BuilderRequest addBuilderRequest(BuilderRequest cr) {
        builderRequestList.add(cr);
        return cr;
    }

    public BuilderRequest getBuilderRequestByID(String id) {
        for (BuilderRequest cr : builderRequestList) {
            if (cr.getRequestID().equalsIgnoreCase(id)) {
                return cr;
            }
        }
        return null;
    }

    public BuilderRequest fetchBuilderRequest(String CleaningNo) {
        for (BuilderRequest Brequest : builderRequestList) {
            if (Brequest.getRequestID().equalsIgnoreCase(CleaningNo)) {
                return Brequest;
            }
        }
        return null;
    }
    public String generateBuilderRequestID() {
        return "BuilderRequest " + (builderRequestList.size() + 1);
    }
}
