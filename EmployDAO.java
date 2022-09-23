package com.infinite.employproject;

import java.util.ArrayList;
import java.util.List;

public class EmployDAO {
	static List<Employ> employList;
	static {
		employList = new ArrayList<Employ>();
	}
	public String updateEmployDao(Employ employNew) {
		Employ employFound = searchEmployDao(employNew.getEmpno());
		if (employFound != null) {
			for (Employ employ : employList) {
				if(employ.getEmpno()==employNew.getEmpno()){
					employ.setName(employNew.getName());
					employ.setDept(employNew.getDept());
					employ.setGender(employNew.getGender());
					employ.setDesig(employNew.getDesig());
					employ.setBasic(employNew.getBasic());
				}
			}
			return "employ record updated";
		}
		return "Employ record not found";
	}
	public String deleteEmployDao(int empno) {
		Employ employFound = searchEmployDao(empno);
		if (employFound != null) {
			employList.remove(employFound);
			return "Employ Record Deleted..";
		}
		return "employ record not found...";
		
	}
	public Employ searchEmployDao(int empno) {
		Employ employFound = null;
		for (Employ employ : employList) {
			if (employ.getEmpno()==empno) {
				employFound = employ;
			}	
		}
		return employFound;
	}
	public List<Employ> showEmployDAO() {
		return employList;
	}
	public String addEmployDAO(Employ employ) {
		employList.add(employ);
		return "Employ Record Inserted...";
	}
}
