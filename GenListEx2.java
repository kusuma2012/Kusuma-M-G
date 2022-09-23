package com.infinite.gen;

import java.util.ArrayList;
import java.util.List;

public class GenListEx2 {
	
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1,"sirisha",76788));
		employList.add(new Employ(2,"saara",76788));
		employList.add(new Employ(3,"alia",76788));
		employList.add(new Employ(4,"suhana",76788));
		for (Employ e : employList) {
			System.out.println(e);
			
		}
	}

}
