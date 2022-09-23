package com.infinite.gen;

import java.util.ArrayList;
import java.util.List;

public class GenListEx1 {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("kamala");
		names.add("rekha");
		names.add("sachin");
		names.add("suma");
		System.out.println("names are...");
		for (String s : names) {
			System.out.println(s);
			
		}
	}

}
