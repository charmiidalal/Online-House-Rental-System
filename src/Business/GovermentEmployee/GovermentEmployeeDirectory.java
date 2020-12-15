/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GovermentEmployee;

import java.util.ArrayList;

/**
 *
 * @author Charmi Dalal
 */
public class GovermentEmployeeDirectory {

    ArrayList<GovermentEmployee> govermentEmployeeList = new ArrayList<GovermentEmployee>();

    public ArrayList<GovermentEmployee> getPackersMoversList() {
        return govermentEmployeeList;
    }

    public void setGovermentEmployeeList(ArrayList<GovermentEmployee> govermentEmployeeList) {
        this.govermentEmployeeList = govermentEmployeeList;
    }

    public void addGovermentEmployee(GovermentEmployee govermentEmployee) {
        govermentEmployeeList.add(govermentEmployee);
    }

    public void removeGovermentEmployee(GovermentEmployee govermentEmployee) {
        govermentEmployeeList.remove(govermentEmployee);
    }

    public String generateGovermentEmployeeID() {
        return "GovermentEmployee" + (govermentEmployeeList.size() + 1);
    }
}
