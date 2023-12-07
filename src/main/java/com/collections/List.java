package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String>list=new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Grape");
		list.add("Grape");
		list.add("Ramesh");
		System.out.println(list);
		list.add("Leela");
		System.out.println(list);
		
		
		for(String fruits:list) {
			System.out.println(fruits);
		}
	
		
	}

}
