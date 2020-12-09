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

import Business.Employee.Employee;
import Business.GovermentEmployee.GovermentEmployeeDirectory;
import Business.Inspector.InspectorDirectory;




import Business.Organization.OrganizationDirectory;

import Business.PackersMovers.PackersMoversDirectory;
import Business.Photographer.PhotographerDirectory;

import Business.PropertyManager.PropertyManagerDirectory;
import Business.Seller.SellerDirectory;
import Business.Plumber.PlumberDirectory;


import Business.Property.PropertyDirectory;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
    private AgentDirectory agentDirectory;
    private BuilderDirectory builderDirectory;
    private ElectricianDirectory electricianDirectory;
    private PropertyManagerDirectory propertyManagerDirectory;
    private PlumberDirectory plumberDirectory;
    private CleanerDirectory cleanerDirectory;
    private PackersMoversDirectory packersMoversDirectory;
    private GovermentEmployeeDirectory govermentEmployeeDirectory;
    private PropertyDirectory propertyDirectory;



  
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
    
    public static void setInstance(EcoSystem system) {
        business = system;
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

  

    
    
    public Boolean checkValidPhoneFormat(String phoneNo) {
        Pattern pattern;
        Matcher matcher;
        String PHONE_PATTERN = "^[0-9]{10}$";
        pattern = Pattern.compile(PHONE_PATTERN);
        matcher = pattern.matcher(phoneNo);
        return matcher.matches();
    }

    public Boolean checkValidEmailFormat(String email) {
        Pattern pattern;
        Matcher matcher;
        String EMAIL_PATTERN
                = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean checkValidPasswordFormat(String password) {
        Pattern p1;
        p1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1 = p1.matcher(password);
        boolean b1 = m1.matches();
        return b1;
    }

    public void setValidationAlert(JLabel lblName, JTextField txtBoxName, String validationMsg, Boolean flag) {
        if (flag) {
            lblName.setForeground(Color.red);
            txtBoxName.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, validationMsg);
        } else {
            lblName.setForeground(Color.BLACK);
            txtBoxName.setBorder(BorderFactory.createLineBorder(Color.black));
        }
    }
    
    public boolean checkExistingNetwork(String name){
        for(Network network : networkList){
            if(network.getName().equalsIgnoreCase(name)){
                return false;
            }
        }
        return true;
    }

}
