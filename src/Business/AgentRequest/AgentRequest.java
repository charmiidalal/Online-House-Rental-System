/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AgentRequest;

import Business.Agent.Agent;
import Business.Buyer.Buyer;
import Business.Property.Property;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author Dinesh
 */
public class AgentRequest extends WorkRequest {

    private String requestID;
    private Buyer buyer;
    private Agent agent;
    private Property property;
    private String inspectorNote;
    private String buyerNote;
    private String status;
    private String requestedDate;
    private String bhk;
    private String bathroom;
    private String specialNote;
    private String city;
    private String state;
    private String zipcode;
    private String rent;
    ArrayList<String> propertyList = new ArrayList<>();

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public String getAgentNote() {
        return inspectorNote;
    }

    public void setAgentNote(String inspectorNote) {
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

    public ArrayList<String> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(ArrayList<String> propertyList) {
        this.propertyList = propertyList;
    }

    public String getBhk() {
        return bhk;
    }

    public void setBhk(String bhk) {
        this.bhk = bhk;
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    public String getSpecialNote() {
        return specialNote;
    }

    public void setSpecialNote(String specialNote) {
        this.specialNote = specialNote;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }
    
    
}
