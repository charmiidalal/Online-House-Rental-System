/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AgentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Anusha
 */
public class AgentOrganization extends Organization{
    
    
    public AgentOrganization(String name) {
        super(name);
    }
    
  @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AgentRole());
        return roles;
    }
       @Override
    public Type getType() {
        return Organization.Type.Agent;
    }  
     
}
