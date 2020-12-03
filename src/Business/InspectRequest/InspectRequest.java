/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InspectRequest;

import Business.Buyer.Buyer;
import Business.Inspector.Inspector;
import Business.Property.Property;
import Business.Seller.Seller;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author Dinesh
 */

    public class InspectRequest extends WorkRequest{
    private String requestID;
    private Seller seller;
    private Buyer buyer;
    private Inspector inspector;
    private Property property;
    private String inspectorNote;
     private String buyerNote;
    private String status;
    private String requestedDate;

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Inspector getInspector() {
        return inspector;
    }

    public void setInspector(Inspector inspector) {
        this.inspector = inspector;
    }

    public String getInspectorNote() {
        return inspectorNote;
    }

    public void setInspectorNote(String inspectorNote) {
        this.inspectorNote = inspectorNote;
    }

    public String getBuyerNote() {
        return buyerNote;
    }

    public void setBuyerNote(String buyerNote) {
        this.buyerNote = buyerNote;
    }

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    

}
