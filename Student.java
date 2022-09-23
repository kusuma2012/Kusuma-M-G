package com.infinite.gen;

public class Student {
	int id;
	String name;
	String city;
	double cgpa;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", cgpa=" + cgpa + "]";
	}
	public Student(int id, String name, String city, double cgpa) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.cgpa = cgpa;
	}
	

}
