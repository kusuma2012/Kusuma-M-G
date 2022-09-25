package com.infinite.lms;

import java.util.ArrayList;
import java.util.List;

public class LeaveDetailsDAO {
	static List <LeaveDetails> LeaveDetailsList;
	static {
		LeaveDetailsList = new ArrayList<LeaveDetails>();
	}
	
	public LeaveDetails searchLeaveDAO(int LeaveId) {
		LeaveDetails leaveFound = null;
		for (LeaveDetails leaveDetails : LeaveDetailsList) {
			if (leaveDetails.getLeaveId()==LeaveId) {
				leaveFound = leaveDetails;
				break;
			}	
		}
		return leaveFound;
		
	}
	public List<LeaveDetails> showLeaveDAO() {
		return LeaveDetailsList;
	}
	public int generateLeaveId() {
		int leaveId=0;
		if (LeaveDetailsList.isEmpty()) {
			leaveId=1;
			return leaveId;
		} else {
			for (LeaveDetails Id : LeaveDetailsList) {
				leaveId = Id.getLeaveId();	
			}
		}
		leaveId++;
		return leaveId;	
	}
	public String addLeaveDAO(LeaveDetails leave) {
		int leaveId = generateLeaveId();
		leave.setLeaveId(leaveId);
		LeaveDetailsList.add(leave);
		return "LeaveDetails record inserted...";
		
	}
}

	


