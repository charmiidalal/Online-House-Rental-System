/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ElectricianRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anush
 */
public class ElectricianOrganization extends Organization{

    public ElectricianOrganization(String name) {
        super(name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ElectricianRole());
        return roles;
    }
       @Override
    public Type getType() {
        return Organization.Type.Electrician;
    }  
     
     
}
