package com.infinite.ex;

import java.util.Scanner;

public class Voting {
	public void check(int age) throws VotingException {
		if(age < 18) {
			throw new VotingException("you are not eligible for voting...!");
		} else {
			System.out.println("you can vote...");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age..");
		int age = sc.nextInt();
		Voting obj = new Voting();
		try {
			obj.check(age);
		} catch (VotingException e) {
			
			e.printStackTrace();
		}
	}

	
}
