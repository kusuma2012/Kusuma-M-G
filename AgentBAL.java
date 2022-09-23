package com.infinite.AgentProject;

import java.util.List;

public class AgentBAL {
	static StringBuilder sb = new StringBuilder();
	static AgentDAO dao = new AgentDAO();
	public Agent searchAgentBal(int AgentId) {
		return dao.searchAgentDao(AgentId);	
	}
	public List<Agent> showAgentBal() {
		return dao.showAgentDAO();	
	}
	public String addAgentBal (Agent agent) throws AgentException {
		if(isValid(agent)==false) {
			throw new AgentException(sb.toString());		
		}
		return dao.addAgentDAO(agent);
	}
	public boolean isValid(Agent Agent) {
		boolean valid=true;
		if (Agent.getAgentId()<0) {
			valid=false;
			sb.append("agent id should not be negative or zero.....\r\n");
		}
		if (Agent.getFirstName().length()<6) {
			valid=false;
			sb.append("Agent Fisrt name contains min 5 chars...\r\n");
		}
		if (Agent.getLastName().length()<6) {
			valid=false;
			sb.append("Agent Last name contains min 5 chars...\r\n ");
		}
		if (Agent.getPremium()< 10000) {
			valid=false;
			sb.append("Agent premium should be minimum of 10000...\r\n");
		}
		return valid;
	}

}
