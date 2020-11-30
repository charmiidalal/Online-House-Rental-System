/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Agent;

import java.util.ArrayList;

/**
 *
 * @author Charmi Dalal
 */
public class AgentDirectory {
    
    private ArrayList <Agent> agentDirectorty;

    public AgentDirectory(ArrayList<Agent> agentDirectorty) {
        this.agentDirectorty = agentDirectorty;
    }

    public ArrayList<Agent> getAgentDirectorty() {
        return agentDirectorty;
    }

    public void setAgentDirectorty(ArrayList<Agent> agentDirectorty) {
        this.agentDirectorty = agentDirectorty;
    }
    
    

}
