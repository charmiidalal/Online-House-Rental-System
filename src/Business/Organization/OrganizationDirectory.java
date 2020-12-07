/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private final ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type, String name) {
        Organization organization = null;
        if (type.getValue().equals(Type.Agent.getValue())) {
            organization = new AgentOrganization(name);
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Type.Builder.getValue())) {
            organization = new BuilderOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PropertyManager.getValue())) {
            organization = new PropertyManagerOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Inspector.getValue())) {
            organization = new InspectorOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Photographer.getValue())) {
            organization = new PhotographerOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Cleaning.getValue())) {
            organization = new CleaningOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Plumbing.getValue())) {
            organization = new PlumbingOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Electrician.getValue())) {
            organization = new ElectricianOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PackersMovers.getValue())) {
            organization = new PackersMoversOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Goverment.getValue())) {
            organization = new GovermentOrganization(name);
            organizationList.add(organization);
        }

        return organization;
    }
}