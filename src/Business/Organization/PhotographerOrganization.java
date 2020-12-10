/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PhotographerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anush
 */
public class PhotographerOrganization extends Organization{

    public PhotographerOrganization(String name) {
        super(name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PhotographerRole());
        return roles;
    }
       @Override
    public Type getType() {
        return Organization.Type.Photographer;
    }  
     
}
