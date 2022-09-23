package com.infinite.AgentProject;

import java.util.List;
import java.util.Scanner;


public class AgentMain {
	static Scanner sc = new Scanner(System.in);
	static AgentBAL bal = new AgentBAL();
	 
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("O P T I O N S");
			System.out.println("--------------");
			System.out.println("1. Add Agent");
			System.out.println("2. Show Agent");
			System.out.println("3. search Agent");
			System.out.println("6. Exit");
			System.out.println("enter your choice...");
			choice =  sc.nextInt();
			switch(choice) {
			case 1 :
				try {
					addAgentMain();			
				} catch (AgentException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 2 :
				showAgentMain();
				break;
			case 3 :
				searchAgentMain();
				break;
			}	
		} while (choice != 6);
	}
	public static void searchAgentMain() {
		int AgentId;
		System.out.println("enter agent id..");
		AgentId = sc.nextInt();
		Agent agentFound = bal.searchAgentBal(AgentId);
		if (agentFound != null) {
			System.out.println(agentFound);
		} else {
			System.out.println("***record not found***...");
		}
	}
	public static void showAgentMain() {
		List<Agent> agentList = bal.showAgentBal();
		for (Agent agent : agentList) {
			System.out.println(agent);
		}
	}
	public static void addAgentMain() throws AgentException {
		Agent agent = new Agent();
		System.out.println("enter agent Id..");
		agent.setAgentId(sc.nextInt());
		System.out.println("enter agent firstName..");
		agent.setFirstName(sc.next());
		System.out.println("enter agent lastname...");
		agent.setLastName (sc.next());
		System.out.println("enter agent paymode...");
		String paymode = sc.next();
		if (paymode.toUpperCase().equals("YEARLY")) {
			agent.setPaymode(Paymode.YEARLY);
		}
		if (paymode.toLowerCase().equals("HALFYEARLY")) {
			agent.setPaymode(Paymode.HALFYEARLY);
		}
		if (paymode.toUpperCase().equals("QUARTERLY")){
			agent.setPaymode(Paymode.QUARTERLY);
		}
		System.out.println("enter premium..");
		agent.setPremium(sc.nextDouble());
		System.out.println(bal.addAgentBal(agent));
	
	}


	}


