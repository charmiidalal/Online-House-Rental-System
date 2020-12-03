/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PropertyManager;

import java.util.ArrayList;

/**
 *
 * @author Charmi Dalal
 */
public class PropertyManagerDirectory {
   ArrayList<PropertyManager> propertyManagerList = new ArrayList<PropertyManager>();

    public ArrayList<PropertyManager> getPropertyManagerList() {
        return propertyManagerList;
    }

    public void setPropertyManagerList(ArrayList<PropertyManager> propertyManagerList) {
        this.propertyManagerList = propertyManagerList;
    }
    
    public void addPropertyManager(PropertyManager propertyManager) {
        propertyManagerList.add(propertyManager);
    }

    public void removePropertyManager(PropertyManager propertyManager) {
        propertyManagerList.remove(propertyManager);
    }

    public String generatePropertyManagerID() {
        return "PropertyManager" + (propertyManagerList.size() + 1);
    }

}
