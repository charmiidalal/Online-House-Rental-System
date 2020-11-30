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
    private ArrayList<Builder> builderDirectory;

    public BuilderDirectory(ArrayList<Builder> builderDirectory) {
        this.builderDirectory = builderDirectory;
    }

    public ArrayList<Builder> getBuilderDirectory() {
        return builderDirectory;
    }

    public void setBuilderDirectory(ArrayList<Builder> builderDirectory) {
        this.builderDirectory = builderDirectory;
    }
    
    
}
