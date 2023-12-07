package com.collections;

import java.util.HashSet;

public class Set {

	 public static void main(String[] args) 
	    { 
		 
		 HashSet<String> hs  = new HashSet<String>(); 
	  
		 hs.add("Mango");
		 hs.add("Apple");
		 hs.add("Grape");
		 hs.add("Grape");
		 hs.add("Ramesh");
	  System.out.println(hs);
	        // Adding the duplicate 
	        // element 
		hs.add("Ramesh");
	  
	    hs.remove("Ramesh");
	    System.out.println(hs);
	   
	    for(String names:hs) {
	    	System.out.println(names);
	    }
	  
	 
	  
	        
	    } 
	
}
