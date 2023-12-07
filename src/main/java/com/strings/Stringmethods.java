package com.strings;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * //charAtmethod String str="Ramesh"; char ch=str.charAt(5);
		 * System.out.println(ch);
		 */
		
		/*
		 * //Comparasion String str1="Leela";
		 * 
		 * String str2="Mana";
		 * System.out.println("Compareto method out put is "+str1.compareTo(str2));
		 * System.out.println("compareToIgnoreCase output is  "+str1.compareToIgnoreCase
		 * (str2));
		 */
		
		/*
		 * //concatination String s1="Ramesh"; String s2="Babu";
		 * System.out.println(s1+s2); System.out.println("Concatinantion "+
		 * s1.concat(s2));
		 */
		
		/*
		 * //contains method String str1="Ram"; String str2="Leelakrishna";
		 * 
		 * if(str2.contains(str1)) { System.out.println("Text has been matched"); } else
		 * { System.out.println("Text has been not matched"); }
		 */
		/*
		 * //endswithmethod String str1="Rameshbabu"; int length=str1.length();
		 * System.out.println(length); if(str1.endsWith("u")) {
		 * System.out.println("Texthas been matched"); } else {
		 * System.out.println("Texthas been not matched"); }
		 */
	
		
		/*
		 * //startswith method
		 * 
		 * String str1="Rameshbabu"; int length=str1.length();
		 * System.out.println(length); if(str1.startsWith("u")) {
		 * System.out.println("Texthas been matched"); } else {
		 * System.out.println("Texthas been not matched"); }
		 */
				
		/*
		 * //equals method String str1="Ramesh"; String str2="Ramesh"; String
		 * str3="RAMESH"; System.out.println(str1.equals(str2));
		 * System.out.println(str1.equals(str3)); System.out.println(str1==str2);
		 * System.out.println(str1==str3);
		 * System.out.println(str1.equalsIgnoreCase(str3));
		 */
		
		/*//String replace
		String str="Leelakrishna";
		System.out.println(str.replace('e', 'a'));
		String words="Ram is good but he is very lazy";
		System.out.println(words.replace("is", "was"));
		//String replaceAll
		String str1="Rana is good but he is very lazy";
		System.out.println(str1.replaceAll("good", "bad"));
		*/
		
		/*//Split method
		
		String s1="Ram is good but he is very lazy";
		String[]words1=s1.split("\\s");
		System.out.println(words1);
		for(String w:words1) {
			System.out.println(w);
		}*/
		/*
		//Substring 012345678
		String st1="Prasannth";
		System.out.println(st1.substring(1));
		
		System.out.println(st1.substring(1, 5));
		System.out.println(st1.subSequence(1,5));
		*/
		/*
		//TocharArray
		String str1="Ramesh";
		char[]ch=str1.toCharArray();
		int len=str1.length();
		System.out.println(len);
		
		for(int i=0;i<len;i++) {
			System.out.println(ch[i]);
		}*/
		//Lowercasevalues
		String str="RAMESHBABU";
		System.out.println(str.toLowerCase());
		
		String str2="ramehbabu";
		System.out.println(str2.toUpperCase());
		String str3="Rameshbabu";
		
		//trim
		String str5="  Rameshbabu is good boy ";
		System.out.println(str5.trim());
		
	
		
		
		
	}

}
