/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Property.PropertyDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
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