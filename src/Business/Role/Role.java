/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Buyer.Buyer;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {

    public Component createWorkArea(JPanel container, Buyer buyer, EcoSystem system) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum RoleType{
        Admin("Admin"),
        Buyer("Buyer"),
        Seller("Seller"),
        Inspector("Inspector"),
        Agent("Agent"),
        Builder("Builder"),
        PropertyManager("Property Manager"),
        Electrician("Electrician"),
        Miscellaneous("Miscellaneous"),
        Cleaning("Cleaning"),
        PackersMovers("Movers & Packers"),
        Photographer("Photographer"),
        Plumbing("Plumbing"),
        GovermentEmployee("Goverment Employee");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
   public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);
    

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}