/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.Role.BuilderRole;
import Business.Role.PropertyManagerRole;
import Business.Role.Role;
import Business.Role.SellerRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class PropertyEnterprise extends Enterprise {
    
    public PropertyEnterprise(String name){
        super(name,EnterpriseType.Property);
    }
    
    @Override

    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new BuilderRole());
        roles.add(new PropertyManagerRole());
        roles.add(new SellerRole());
        return roles;
    }
    
}
