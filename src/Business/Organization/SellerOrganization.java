/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SellerRole;
import java.util.ArrayList;

/**
 *
 * @author Charmi
 */
public class SellerOrganization extends Organization {

    public SellerOrganization(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SellerRole());
        return roles;
    }

    @Override
    public Type getType() {
        return Organization.Type.Seller;
    }

}
