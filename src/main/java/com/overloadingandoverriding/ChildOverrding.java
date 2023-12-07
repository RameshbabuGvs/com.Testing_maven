package com.overloadingandoverriding;

public class ChildOverrding extends ParentOverriding{
	
	public static void Color() {
		System.out.println("skin color also same");
	}
	public static void Properies() {
		System.out.println("Properies value is increased upto 2 cre");
	}
	
	public static void main(String [] args) {
		
		Color();
		Properies();
	}

}
