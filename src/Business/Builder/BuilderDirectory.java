/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Builder;

import java.util.ArrayList;

/**
 *
 * @author Charmi Dalal
 */
public class BuilderDirectory {
    
    ArrayList<Builder> builderList = new ArrayList<Builder>();

    public ArrayList<Builder> getBuilderList() {
        return builderList;
    }

    public void setBuilderList(ArrayList<Builder> builderList) {
        this.builderList = builderList;
    }

    public void addBuilder(Builder builder) {
        builderList.add(builder);
    }

    public void removeInespector(Builder builder) {
        builderList.remove(builder);
    }

    public String generateBuilderID() {
        return "Builder" + (builderList.size() + 1);
    }
    
      public Builder fetchBuilder(String BuilderNO) {
        for (Builder builder : builderList) {
            if (builder.getBuilderNo().equalsIgnoreCase(BuilderNO)) {
                return builder;
            }
        }
        return null;
    }
    
}
