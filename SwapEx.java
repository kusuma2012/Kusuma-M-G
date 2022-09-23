package com.infinite.gen;
class Data<T> {
	public void swap(T a, T b) {
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value is  " +a+ "B value is  " +b);
	}
}

public class SwapEx {
	public static void main(String[] args) {
		Data obj = new Data();
		int a=5, b=3;
		obj.swap(a, b);
		
		String s1="kushi", s2="nayana";
		obj.swap(s1, s2);
		boolean b1=true, b2=false;
		obj.swap(b1, b2);
		
	}

}
