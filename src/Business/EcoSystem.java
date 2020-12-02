/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Agent.AgentDirectory;
import Business.Builder.BuilderDirectory;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import Business.Buyer.BuyerDirectory;
import Business.Inspector.InspectorDirectory;
import Business.Order.OrderDirectory;
import Business.Organization.OrganizationDirectory;
import Business.Photographer.PhotographerDirectory;
import Business.PropertyManager.PropertyManagerDirectory;
import Business.Seller.SellerDirectory;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization {

   
    private static EcoSystem business;
    private EnterpriseDirectory enterpriseDirectory;
    private BuyerDirectory buyerDirectory;
    private SellerDirectory sellerDirectory;
    private OrganizationDirectory organizationDirectory;
    private PhotographerDirectory photographerDirectory;
    private InspectorDirectory inspectorDirectory;
    private OrderDirectory orderDirectory;
    private AgentDirectory agentDirectory;
    private BuilderDirectory builderDirectory;
    private PropertyManagerDirectory propertyManagerDirectory;
    private ArrayList<Network> networkList;
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
        enterpriseDirectory = new EnterpriseDirectory();
        buyerDirectory = new BuyerDirectory();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public BuyerDirectory getBuyerDirectory() {
        return buyerDirectory;
    }

    public void setBuyerDirectory(BuyerDirectory buyerDirectory) {
        this.buyerDirectory = buyerDirectory;
    }

    public boolean checkIfUserIsUnique(String userName) {
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }
        for (Network network : networkList) {

        }
        return true;
    }

    public SellerDirectory getSellerDirectory() {
        return sellerDirectory;
    }


    public void setSellerDirectory(SellerDirectory sellerDirectory) {
        this.sellerDirectory = sellerDirectory;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public PhotographerDirectory getPhotographerDirectory() {
        return photographerDirectory;
    }

    public void setPhotographerDirectory(PhotographerDirectory photographerDirectory) {
        this.photographerDirectory = photographerDirectory;
    }

    public InspectorDirectory getInspectorDirectory() {
        return inspectorDirectory;
    }

    public void setInspectorDirectory(InspectorDirectory inspectorDirectory) {
        this.inspectorDirectory = inspectorDirectory;
    }

    public AgentDirectory getAgentDirectory() {
        return agentDirectory;
    }

    public void setAgentDirectory(AgentDirectory agentDirectory) {
        this.agentDirectory = agentDirectory;
    }

    public BuilderDirectory getBuilderDirectory() {
        return builderDirectory;
    }

    public void setBuilderDirectory(BuilderDirectory builderDirectory) {
        this.builderDirectory = builderDirectory;
    }

    public PropertyManagerDirectory getPropertyManagerDirectory() {
        return propertyManagerDirectory;
    }

    public void setPropertyManagerDirectory(PropertyManagerDirectory propertyManagerDirectory) {
        this.propertyManagerDirectory = propertyManagerDirectory;
    }
    
    
}
