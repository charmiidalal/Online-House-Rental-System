/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BuilderRequest;

import Business.Builder.Builder;
import Business.Buyer.Buyer;
import Business.Cleaner.Cleaner;
import Business.Property.Property;
import Business.Seller.Seller;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author Dinesh
 */
public class BuilderRequest extends WorkRequest {

    private String requestID;
    private UserAccount seller;
    private UserAccount buyer;
    private UserAccount builder;
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

    public UserAccount getSeller() {
        return seller;
    }

    public void setSeller(UserAccount seller) {
        this.seller = seller;
    }

    public UserAccount getBuyer() {
        return buyer;
    }

    public void setBuyer(UserAccount buyer) {
        this.buyer = buyer;
    }

    public UserAccount getBuilder() {
        return builder;
    }

    public void setBuilder(UserAccount builder) {
        this.builder = builder;
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
