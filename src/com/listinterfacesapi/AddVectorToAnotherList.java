package com.listinterfacesapi;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class AddVectorToAnotherList {
	
		public static void main(String[] args) {
			
//			Vector<String> v1=new Vector<>();
//			v1.addElement("First");
//			v1.addElement("First");
//			v1.addElement("Second");
//			v1.addElement("Third");
//			v1.addElement(null);
//			v1.addElement(null);
//			
//			//add vector list to arraylist.
//			
//			ArrayList<String> a1=new ArrayList<>(v1);
//			a1.add("Tiger");
//			a1.add("Tiger");
//			a1.add("Lion");
//			a1.add("Kangaroo");
//			a1.add(null);
//			a1.add(null);
//
//			for(String s1:a1) {
//				System.out.println(s1);
//			}
			
			//using add all method. add vector with array list.
			Vector<String> v3=new Vector<>();
			v3.addElement("First");
			v3.addElement("First");
			v3.addElement("Second");
			v3.addElement("Third");
			v3.addElement(null);
			v3.addElement(null);
			
			ArrayList<String> a3=new ArrayList<>();
			a3.add("Tiger");
			a3.add("Tiger");
			a3.add("Lion");
			a3.add("Kangaroo");
			a3.add(null);
			a3.add(null);

			a3.addAll(v3);
			
			for(String s2:a3) {
				System.out.println(s2);
			}

		}

	}
