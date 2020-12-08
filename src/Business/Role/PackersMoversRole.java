
 
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PackersMoversRole.PackersMoversWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class PackersMoversRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        return new PackersMoversWorkAreaJPanel(userProcessContainer,business, account);
    }
 @Override
    public String toString(){
        return (Role.RoleType.PackersMovers.getValue());
    }
    
    
}
