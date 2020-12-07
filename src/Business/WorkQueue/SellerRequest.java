/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;

/**
 *
 * @author anush
 */
public class SellerRequest {
    private Network network;
    private Enterprise enterprise;
    private Organization.Type orgType;
    private String requestID;
    private String sellerNo;
    private String Name;
    private String Phone;
    private String Street;
    private String Zipcode;
    private String Email;
    private String City;
    private String State;
    private Boolean isApproved;
    private String username;
}
