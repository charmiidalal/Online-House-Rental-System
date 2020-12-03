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
    
    ArrayList<Agent> agentList = new ArrayList<Agent>();

    public ArrayList<Agent> getAgentList() {
        return agentList;
    }

    public void setAgentList(ArrayList<Agent> agentList) {
        this.agentList = agentList;
    }

    public void addAgent(Agent agent) {
        agentList.add(agent);
    }

    public void removeInespector(Agent agent) {
        agentList.remove(agent);
    }

    public String generateAgentID() {
        return "Agent" + (agentList.size() + 1);
    }
}
