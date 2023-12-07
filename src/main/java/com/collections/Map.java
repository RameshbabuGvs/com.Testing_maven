package com.collections;

import java.util.HashMap;

public class Map {
	 public static void main(String args[])
	    {

	    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	 
	        // Add Elements using put method
	    hashmap.put(1, "Ramesh");
	    hashmap.put(2, "Rana");
	    hashmap.put(3, "Leela");
	 
	    hashmap.put(4, "Tulasi");
	    hashmap.put(5, "Hari");
	    hashmap.put(6, "Sribinivas");

 System.out.println("Hashmap values are"+hashmap);

 //changing values
 hashmap.put(5, "krishna");
 System.out.println("changing values"+hashmap);
 System.out.println("The Value is: " + hashmap.get(4));
 System.out.println("The Value is: " + hashmap.get(4));
 
	    }}
	        
