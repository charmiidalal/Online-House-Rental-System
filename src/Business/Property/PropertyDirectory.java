/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Property;

import java.util.ArrayList;

/**
 *
 * @author Dinesh
 */
public class PropertyDirectory {

    private ArrayList<Property> propertyList = new ArrayList<Property>();

    public ArrayList<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(ArrayList<Property> propertyList) {
        this.propertyList = propertyList;
    }

    public String generatePropertyID() {
        return "Property" + (propertyList.size() + 1);
    }

    public Property fetchProperty(String PropertyNo) {
        for (Property property : propertyList) {
            if (property.getPropertyID().equalsIgnoreCase(PropertyNo)) {
                return property;
            }
        }
        return null;
    }
     public Property searchPropertyName(String PropertyName) {
        for (Property property : propertyList) {
            if (property.getPropertyName().equalsIgnoreCase(PropertyName)) {
                return property;
            }
        }
        return null;
    }

    ///./////// need to change ///////////////
    public Property getPropertyByIndex(int index) {
        return propertyList.get(index);
    }

    public void addProperty(Property property) {
        propertyList.add(property);
    }

    public void removeProperty(Property property) {
        propertyList.remove(property);
    }
   
}
