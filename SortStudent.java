package com.infinite.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;



public class SortStudent {
	public static void main(String[] args) {
		CityComparator c  = new CityComparator();
		SortedSet<Student> studentList = new TreeSet<Student>(c);
		studentList.add(new Student(1,"suma","bangalore",9.0));
		studentList.add(new Student(2,"surabhi","delhi",9.2));
		studentList.add(new Student(3,"pavan","hyderabhad",9.3));
		studentList.add(new Student(4,"kamal","UP",9.8));
		studentList.add(new Student(5,"usha","maharastra",9.1));
		for (Student student : studentList) {
			System.out.println(student);
			
		}
	}

}
