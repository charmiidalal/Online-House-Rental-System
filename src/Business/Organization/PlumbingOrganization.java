/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PlumbingRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Charmi
 */
public class PlumbingOrganization extends Organization{

    public PlumbingOrganization(String name) {
        super(name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PlumbingRole());
        return roles;
    }
       @Override
    public Type getType() {
        return Organization.Type.Plumbing;
    }  
     
}
