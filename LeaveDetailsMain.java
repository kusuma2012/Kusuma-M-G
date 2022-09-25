package com.infinite.lms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class LeaveDetailsMain {
	
	static LeaveDetailsBAL bal= new LeaveDetailsBAL();
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("O P T I O N S");
			System.out.println("-------------");
			System.out.println("1. Add leave ");
			System.out.println("2. show leave");
			System.out.println("3. search leave");
			System.out.println("enter your choice.....");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				try {
					addLeave();	
				} catch (ParseException | LeaveDetailsException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2 : 
				showLeave();
				break;
			case 3 :
				searchLeave();
				break;
			}	
		} while (choice!=6);		
	}
	
	public static void searchLeave() {
		int LeaveId;
		System.out.println("enter leave id...");
		LeaveId = sc.nextInt();
		LeaveDetails Leave = bal.searchLeaveBal(LeaveId);
		if (Leave != null) {
			System.out.println(Leave);
		} else {
			System.out.println("***Record not found***");			
		}
	}
	public static void showLeave() {
		List<LeaveDetails> leaves = bal.showLeaveBal();
		for (LeaveDetails Id : leaves) {
			System.out.println(Id);		
		}
	}
	
		public static void addLeave() throws ParseException, LeaveDetailsException {
			LeaveDetails leave = new LeaveDetails();
			System.out.println("Enter Employ Id ");
			leave.setEmpId(sc.nextInt());
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/DD");
			System.out.println("Enter LeaveStartDate (YYYY/MM/DD) ");
			leave.setLeaveStartDate(sdf.parse(sc.next()));
			System.out.println("Enter LeaveEndDate (YYYY/MM/DD) ");
			leave.setLeaveEndDate(sdf.parse(sc.next()));
			System.out.println("Enter LeaveType (EL/PL/ML) ");
			String type = sc.next();
			if (type.equals("EL")) {
				leave.setLeavetype(LeaveType.EL);
			}
			if (type.equals("PL")) {
				leave.setLeavetype(LeaveType.PL);
			}
			if (type.equals("ML")) {
				leave.setLeavetype(LeaveType.ML);
			}
			System.out.println("Enter LeaveReason  ");
			leave.setLeaveReason(sc.next());
			System.out.println(bal.addLeaveBal(leave));	
	}
}
