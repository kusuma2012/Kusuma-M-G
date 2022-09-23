package com.infinite.AgentProject;

import java.util.ArrayList;
import java.util.List;

public class AgentDAO {
	static List <Agent> AgentList;
	static {
		AgentList = new ArrayList<Agent>();
	}
	public Agent searchAgentDao(int AgentId) {
		Agent agentFound = null;
		for (Agent agent : AgentList) {
			if (agent.getAgentId()==AgentId) {
				agentFound = agent;
			}
			
		}
		return agentFound;
		
	}
	public List<Agent> showAgentDAO() {
		return AgentList;
	}
	public String addAgentDAO(Agent agent) {
		AgentList.add(agent);
		return "Agent record inserted";
	}

}
