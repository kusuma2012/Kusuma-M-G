package com.infinite.AgentProject;

public class Agent {
	private int agentId;
	private String firstName;
	private String lastName;
	private Paymode paymode;
	private double premium;
	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", firstName=" + firstName + ", lastName=" + lastName + ", paymode="
				+ paymode + ", premium=" + premium + "]";
	}
	public Agent(int agentId, String firstName, String lastName, Paymode paymode, double premium) {
		this.agentId = agentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.paymode = paymode;
		this.premium = premium;
	}
	public Agent() {
	}
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Paymode getPaymode() {
		return paymode;
	}
	public void setPaymode(Paymode paymode) {
		this.paymode = paymode;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	

}
