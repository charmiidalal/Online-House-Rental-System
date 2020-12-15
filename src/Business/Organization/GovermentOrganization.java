/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GovermentEmployeeRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Anusha
 */
public class GovermentOrganization extends Organization{

    public GovermentOrganization(String name) {
        super(name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovermentEmployeeRole());
        return roles;
    }
       @Override
    public Type getType() {
        return Organization.Type.Goverment;
    }  
     
}
