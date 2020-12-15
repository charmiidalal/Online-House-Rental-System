/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.InspectorRole;
import Business.Role.PhotographerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dinesh
 */
public class QualityAssuranceEnterprise extends Enterprise {

    public QualityAssuranceEnterprise(String name) {
        super(name, EnterpriseType.QualityAssurance);
    }

    @Override

    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new PhotographerRole());
        roles.add(new InspectorRole());
        return roles;
    }
}
