/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PackersMoversRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class PackersMoversOrganization extends Organization{

    public PackersMoversOrganization() {
        super(Type.PackersMovers.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PackersMoversRole());
        return roles;
    }
     
}
