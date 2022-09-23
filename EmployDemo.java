package com.infinite.ex;

public class EmployDemo {
	public static void main(String[] args) {
		Employ employ = new Employ();
		employ.setEmpno(1);
		employ.setName("kushi");
		employ.setBasic(66258.99);
		System.out.println("Employ No " +employ.getEmpno());
		System.out.println("Employ name " +employ.getName());
		System.out.println("Employ Basic " +employ.getBasic());
	}

}
