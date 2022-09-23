package com.infinite.ex;

import java.util.Scanner;

public class Calculation {
	public void calc(int a, int b) throws NegetiveException, NumberZeroException{
		if(a<0 || b<0) {
			throw new NegetiveException("Negetive numbers not allowed..");
		} else if ( a==0 || b==0) {
			throw new NumberZeroException("zero is invalid value...");
		} else {
			int c=a+b;
			System.out.println("sum is.." +c);
		}
	}
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers...");
		a=sc.nextInt();
		b=sc.nextInt();
		try {
			new Calculation().calc(a, b);
		} catch (NegetiveException | NumberZeroException e) {
			e.printStackTrace();
		}
	}
}
