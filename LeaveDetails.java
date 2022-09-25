package com.infinite.lms;

import java.util.Date;

public class LeaveDetails {
	private int LeaveId;
	private int empId;
	private Date LeaveStartDate;
	private Date LeaveEndDate;
	private int noOfDays;
	private String LeaveReason;
	private LeaveType leavetype;
	public int getLeaveId() {
		return LeaveId;
	}
	public void setLeaveId(int leaveId) {
		LeaveId = leaveId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Date getLeaveStartDate() {
		return LeaveStartDate;
	}
	public void setLeaveStartDate(Date leaveStartDate) {
		LeaveStartDate = leaveStartDate;
	}
	public Date getLeaveEndDate() {
		return LeaveEndDate;
	}
	public void setLeaveEndDate(Date leaveEndDate) {
		LeaveEndDate = leaveEndDate;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public String getLeaveReason() {
		return LeaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		LeaveReason = leaveReason;
	}
	public LeaveType getLeavetype() {
		return leavetype;
	}
	public void setLeavetype(LeaveType leavetype) {
		this.leavetype = leavetype;
	}
	@Override
	public String toString() {
		return "LeaveDetails [LeaveId=" + LeaveId + ", empId=" + empId + ", LeaveStartDate=" + LeaveStartDate
				+ ", LeaveEndDate=" + LeaveEndDate + ", noOfDays=" + noOfDays + ", LeaveReason=" + LeaveReason
				+ ", leavetype=" + leavetype + "]";
	}
	public LeaveDetails(int leaveId, int empId, Date leaveStartDate, Date leaveEndDate, int noOfDays,
			String leaveReason, LeaveType leavetype) {
		this.LeaveId = leaveId;
		this.empId = empId;
		this.LeaveStartDate = leaveStartDate;
		this.LeaveEndDate = leaveEndDate;
		this.noOfDays = noOfDays;
		this.LeaveReason = leaveReason;
		this.leavetype = leavetype;
	}
	public LeaveDetails() {
	}	
}