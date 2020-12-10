/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PropertyManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anush
 */
public class PropertyManagerOrganization extends Organization{

    public PropertyManagerOrganization(String name) {
        super(name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PropertyManagerRole());
        return roles;
    }
       @Override
    public Type getType() {
        return Organization.Type.PropertyManager;
    } 
     
}
