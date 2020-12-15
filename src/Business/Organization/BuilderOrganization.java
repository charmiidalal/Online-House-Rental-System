/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BuilderRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Anusha
 */
public class BuilderOrganization extends Organization{

    public BuilderOrganization(String name) {
        super(name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BuilderRole());
        return roles;
    }
       @Override
    public Type getType() {
        return Organization.Type.Builder;
    }  
     
}
