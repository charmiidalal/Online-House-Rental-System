/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PlumberRole.PlumberWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class PlumbingRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        return new PlumberWorkAreaJPanel(userProcessContainer, business,account);
    }

     @Override
    public String toString(){
        return (Role.RoleType.Plumbing.getValue());
    }
    
}
