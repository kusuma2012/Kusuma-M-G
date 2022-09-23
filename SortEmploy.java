package com.infinite.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator<Employ> c = new NameComparator();
		SortedSet<Employ> employList = new TreeSet<Employ>(c);
		employList.add(new Employ(1,"sirisha",76788));
		employList.add(new Employ(2,"saara",76788));
		employList.add(new Employ(3,"alia",76788));
		employList.add(new Employ(4,"suhana",76788));
		for (Employ employ : employList) {
			System.out.println(employ);
			
		}
	}
}
