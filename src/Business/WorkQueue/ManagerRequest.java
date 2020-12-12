/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Property.Property;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Dinesh
 */
public class ManagerRequest extends WorkRequest{
    private Network network;
    private Enterprise enterprise;
    private Organization.Type orgType;
    private String requestID;
    private UserAccount seller;
    private UserAccount buyer;
    private UserAccount manager;
    private Property property;
    private String inspectorNote;
    private String buyerNote;
    private String status;
    private String requestedDate;
    int min = 100;
    int max = 999;

    public ManagerRequest() {
//        int randomNum = (int) (Math.random() * (max - min + 1) + min);
//        requestID = "Request" + randomNum;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Organization.Type getOrgType() {
        return orgType;
    }

    public void setOrgType(Organization.Type orgType) {
        this.orgType = orgType;
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID() {
         int randomNum = (int) (Math.random() * (max - min + 1) + min);
        this.requestID = "Request" + randomNum;
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

    public UserAccount getManager() {
        return manager;
    }

    public void setManager(UserAccount manager) {
        this.manager = manager;
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

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    @Override
    public String toString() {
        return requestID;
    }
}
