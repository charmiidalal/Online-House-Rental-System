/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import Business.Buyer.BuyerDirectory;
import Business.Organization.OrganizationDirectory;
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
    
}
