/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PhotographerRequest;

import java.util.ArrayList;

/**
 *
 * @author Dinesh
 */
public class PhotographerRequestDirectory {
    private ArrayList<PhotographerRequest> photoRequestList = new ArrayList<PhotographerRequest>();

    public ArrayList<PhotographerRequest> getPhotoRequestList() {
        return photoRequestList;
    }

    public void setPhotoRequestList(ArrayList<PhotographerRequest> photoRequestList) {
        this.photoRequestList = photoRequestList;
    }
    
      public PhotographerRequest addPhotoRequest(PhotographerRequest pr) {
        photoRequestList.add(pr);
        return pr;
    }

    public PhotographerRequest getPhotoRequestByID(String id) {
        for (PhotographerRequest pr : photoRequestList) {
            if (pr.getRequestID().equalsIgnoreCase(id)) {
                return pr;
            }
        }
        return null;
    }

    public PhotographerRequest fetchPhotoRequest(String PhotoNo) {
        for (PhotographerRequest Prequest : photoRequestList) {
            if (Prequest.getRequestID().equalsIgnoreCase(PhotoNo)) {
                return Prequest;
            }
        }
        return null;
    }
    public String generatePhotoRequestID() {
        return "PhotoRequest" + (photoRequestList.size() + 1);
    }
}
