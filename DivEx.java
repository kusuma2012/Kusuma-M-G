package com.infinite.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivEx {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter two numbers...");
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println("division..." +c);
		} catch(ArithmeticException e) {
			System.out.println("division by zero impossible");
		} catch(InputMismatchException e) {
			System.out.println("String cannot be converted as integer...");
		}
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("welcome to infinite...!");
		}									  		
	}
}
