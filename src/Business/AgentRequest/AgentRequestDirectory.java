/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AgentRequest;


import java.util.ArrayList;

/**
 *
 * @author Dinesh
 */
public class AgentRequestDirectory {
    private ArrayList<AgentRequest> agentRequestList = new ArrayList<AgentRequest>();

    public ArrayList<AgentRequest> getAgentRequestList() {
        return agentRequestList;
    }

    public void setAgentRequestList(ArrayList<AgentRequest> agentRequestList) {
        this.agentRequestList = agentRequestList;
    }
    
     public AgentRequest addAgentRequest(AgentRequest pr) {
        agentRequestList.add(pr);
        return pr;
    }

    public AgentRequest getAgentRequestByID(String id) {
        for (AgentRequest er : agentRequestList) {
            if (er.getRequestID().equalsIgnoreCase(id)) {
                return er;
            }
        }
        return null;
    }

    public AgentRequest fetchAgentRequest(String PlumberNo) {
        for (AgentRequest Prequest : agentRequestList) {
            if (Prequest.getRequestID().equalsIgnoreCase(PlumberNo)) {
                return Prequest;
            }
        }
        return null;
    }
    public String generateAgentRequestID() {
        return "AgentRequest" + (agentRequestList.size() + 1);
    }
}
