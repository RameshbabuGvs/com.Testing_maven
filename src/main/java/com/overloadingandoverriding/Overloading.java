package com.overloadingandoverriding;

public class Overloading {

	public static void  add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("a and b values addition "+c);
	}
	public static void  add(int x,int y) {
		int a=x;
		int b=y;
		int c=a+b;
		System.out.println("a and b values addition "+c);
	}
	public static void  add(int x,int y,int z) {
		int a=x;
		int b=y;
		int c=z;
		int d=a+b+c;
		System.out.println("a and b values addition "+d);
	}
	public static void  add(int x,int y,int z,int z1,String name) {
		int a=x;
		int b=y;
		int c=z;
		int f=z1;
		int d=a+b+c+f;
		String str=name;
		System.out.println(name);
		System.out.println("a and b values addition "+d);
	}
	
	public static void main() {
		System.out.println("Hi");
	}
	public static void main(String arg) {
		System.out.println("Hi How are you");
	}
	
	public static void main(String args []) {
		// TODO Auto-generated method stub
		add(20,30);
       add(10,20);
       main();
     
		
	}

}
