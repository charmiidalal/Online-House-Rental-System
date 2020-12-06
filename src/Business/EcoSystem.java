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
import Business.Cleaner.CleanerDirectory;
import Business.Electrician.ElectricianDirectory;
import Business.ElectricianRequest.ElectricianRequestDirectory;
import Business.GovermentEmployee.GovermentEmployeeDirectory;
import Business.Inspector.InspectorDirectory;
import Business.InspectRequest.InspectRequestDirectory;
import Business.Organization.OrganizationDirectory;
import Business.PackersMovers.PackersMoversDirectory;
import Business.Photographer.PhotographerDirectory;
import Business.PropertyManager.PropertyManagerDirectory;
import Business.Seller.SellerDirectory;
import Business.Plumber.PlumberDirectory;
import Business.PlumbingRequest.PlumbingRequestDirectory;

import Business.Property.PropertyDirectory;

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
    private InspectRequestDirectory orderDirectory;
    private AgentDirectory agentDirectory;
    private BuilderDirectory builderDirectory;
    private ElectricianDirectory electricianDirectory;
    private PropertyManagerDirectory propertyManagerDirectory;
    private PlumberDirectory plumberDirectory;
    private CleanerDirectory cleanerDirectory;
    private PackersMoversDirectory packersMoversDirectory;
    private GovermentEmployeeDirectory govermentEmployeeDirectory;
    private PropertyDirectory propertyDirectory;
    private InspectRequestDirectory inspectRequestDirectory;
    private PlumbingRequestDirectory plumbingRequestDirectory;
    private ElectricianRequestDirectory electricianRequestDirectory;
    
    
    

    public ElectricianRequestDirectory getElectricianRequestDirectory() {
        return electricianRequestDirectory;
    }

    public void setElectricianRequestDirectory(ElectricianRequestDirectory electricianRequestDirectory) {
        this.electricianRequestDirectory = electricianRequestDirectory;
    }
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

    public InspectRequestDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(InspectRequestDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public PlumbingRequestDirectory getPlumbingRequestDirectory() {
        return plumbingRequestDirectory;
    }

    public void setPlumbingRequestDirectory(PlumbingRequestDirectory plumbingRequestDirectory) {
        this.plumbingRequestDirectory = plumbingRequestDirectory;
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

    public ElectricianDirectory getElectricianDirectory() {
        return electricianDirectory;
    }

    public void setElectricianDirectory(ElectricianDirectory electricianDirectory) {
        this.electricianDirectory = electricianDirectory;
    }

    public PlumberDirectory getPlumberDirectory() {
        return plumberDirectory;
    }

    public void setPlumberDirectory(PlumberDirectory plumberDirectory) {
        this.plumberDirectory = plumberDirectory;
    }

    public CleanerDirectory getCleanerDirectory() {
        return cleanerDirectory;
    }

    public void setCleanerDirectory(CleanerDirectory cleanerDirectory) {
        this.cleanerDirectory = cleanerDirectory;
    }

    public PackersMoversDirectory getPackersMoversDirectory() {
        return packersMoversDirectory;
    }

    public void setPackersMoversDirectory(PackersMoversDirectory packersMoversDirectory) {
        this.packersMoversDirectory = packersMoversDirectory;
    }

    public GovermentEmployeeDirectory getGovermentEmployeeDirectory() {
        return govermentEmployeeDirectory;
    }

    public void setGovermentEmployeeDirectory(GovermentEmployeeDirectory govermentEmployeeDirectory) {
        this.govermentEmployeeDirectory = govermentEmployeeDirectory;
    }

    public PropertyDirectory getPropertyDirectory() {
        return propertyDirectory;
    }

    public void setPropertyDirectory(PropertyDirectory propertyDirectory) {
        this.propertyDirectory = propertyDirectory;
    }

    public InspectRequestDirectory getInspectRequestDirectory() {
        return inspectRequestDirectory;
    }

    public void setInspectRequestDirectory(InspectRequestDirectory inspectRequestDirectory) {
        this.inspectRequestDirectory = inspectRequestDirectory;
    }

}
