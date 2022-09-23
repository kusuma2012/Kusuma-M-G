package com.infinite.employproject;

import java.util.List;
import java.util.Scanner;

public class EmployMain {
	static Scanner sc = new Scanner(System.in);
	static EmployBAL bal = new EmployBAL();
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("O P T I O N S");
			System.out.println("-------------");
			System.out.println("1. Add employ");
			System.out.println("2. Show Employ");
			System.out.println("3. Search Employ");
			System.out.println("4. delete Employ");
			System.out.println("5. update empploy");
			System.out.println("6. Exit");
			System.out.println("Enter your choice....");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				try {
					addEmployMain();
				} catch (EmployException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 2 :
				showEmployMain();
				break;
			case 3 : 
				searchEmployMain();
				break;
			case 4 :
				deleteEmployMain();
				break;
			case 5 :
				try {
					updateEmployMain();
				} catch (EmployException e) {
					System.err.println(e.getMessage());;
				}
				break;
			}
			
		} while (choice!=6);
	}
	public static void deleteEmployMain() {
		int empno;
		System.out.println("enter employ number...");
		empno = sc.nextInt();
		System.out.println(bal.deleteEmployBal(empno));
		}
	public static void searchEmployMain() {
		int empno;
		System.out.println("enter employ number...");
		empno = sc.nextInt();
		Employ employFound = bal.searchEmployBal(empno);
		if (employFound != null) {
			System.out.println(employFound);
		} else {
			System.out.println("***Record not found***...");
		}
	}
	public static void showEmployMain() {
		List<Employ> employList = bal.showEmployBal();
		for (Employ employ : employList) {
			System.out.println(employ);			
		}
	}
	public static void updateEmployMain() throws EmployException {
		Employ employ = new Employ();
		System.out.println("enter employ no..");
		employ.setEmpno(sc.nextInt());
		System.out.println("enter employ name..");
		employ.setName(sc.next());
		System.out.println("enter gender...");
		String gen = sc.next();
		if (gen.toUpperCase().equals("MALE")) {
			employ.setGender(Gender.MALE);
		}
		if (gen.toUpperCase().equals("FEMALE")) {
			employ.setGender(Gender.FEMALE);
		}
		System.out.println("enter DEpertment..");
		employ.setDept(sc.next());
		System.out.println("enter Designation..");
		employ.setDesig(sc.next());
		System.out.println("enter Basic");
		employ.setBasic(sc.nextDouble());
		System.out.println(bal.updateEmployBal(employ));
	}
	public static void addEmployMain() throws EmployException {
		Employ employ = new Employ();
		System.out.println("enter employ no..");
		employ.setEmpno(sc.nextInt());
		System.out.println("enter employ name..");
		employ.setName(sc.next());
		System.out.println("enter gender...");
		String gen = sc.next();
		if (gen.toUpperCase().equals("MALE")) {
			employ.setGender(Gender.MALE);
		}
		if (gen.toUpperCase().equals("FEMALE")) {
			employ.setGender(Gender.FEMALE);
		}
		System.out.println("enter DEpertment..");
		employ.setDept(sc.next());
		System.out.println("enter Designation..");
		employ.setDesig(sc.next());
		System.out.println("enter Basic");
		employ.setBasic(sc.nextDouble());
		System.out.println(bal.addEmployBal(employ));
	}
}