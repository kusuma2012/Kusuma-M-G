package com.infinite.employproject;

import java.util.List;

public class EmployBAL {
	static StringBuilder sb = new StringBuilder();
	static EmployDAO dao = new EmployDAO();
	public String deleteEmployBal(int empno) {
		return dao.deleteEmployDao(empno);
	}
	public Employ searchEmployBal(int empno) {
		return dao.searchEmployDao(empno);
	}
	public List<Employ> showEmployBal() {
		return dao.showEmployDAO();
	}
	public String addEmployBal(Employ employ) throws EmployException {
		if (isValid(employ)==false) {
			throw new EmployException(sb.toString());
		}
		return dao.addEmployDAO(employ);
		
	}
	public String updateEmployBal(Employ employ) throws EmployException {
		if (isValid(employ)==false) {
			throw new EmployException(sb.toString());
		}
		return dao.updateEmployDao(employ);
	}
	public boolean isValid(Employ employ) {
		boolean valid=true;
		if (employ.getEmpno()<0){
			valid=false;
			sb.append("employ no cannot be negative or zero...\r\n");
		}
		if (employ.getName().length()<6) {
			valid=false;
			sb.append("Employ name contains min 5 chars...\r\n");
		}
		if (employ.getDept().length()<4) {
			valid=false;
			sb.append("Employ dept contains min 3 chars...\r\n");
		}
		if (employ.getDesig().length()<5) {
			valid=false;
			sb.append("Employ desig contains min 4 chars..\r\n");
		}
		if (employ.getBasic()<5000 || employ.getBasic()>80000) {
			valid=false;
			sb.append("Employ basic must be between 5000 to 80000...\r\n");
		}
		return valid;
	}

}
