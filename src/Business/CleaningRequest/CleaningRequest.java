/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CleaningRequest;

import Business.Buyer.Buyer;
import Business.Cleaner.Cleaner;
import Business.Property.Property;
import Business.Seller.Seller;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author Dinesh
 */
public class CleaningRequest extends WorkRequest {
    private String requestID;
    private Seller seller;
    private Buyer buyer;
    private Cleaner cleaner;
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

    public Cleaner getCleaner() {
        return cleaner;
    }

    public void setCleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
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
    
}