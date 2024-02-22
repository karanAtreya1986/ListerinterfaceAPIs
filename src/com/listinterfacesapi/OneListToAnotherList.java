package com.listinterfacesapi;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class OneListToAnotherList {
	
	public static void main(String[] args) {
		
//		ArrayList<String> a1=new ArrayList<>();
//		a1.add("Tiger");
//		a1.add("Tiger");
//		a1.add("Lion");
//		a1.add("Kangaroo");
//		a1.add(null);
//		a1.add(null);
//		
//		//add array list to vector.
//		Vector<String> v1=new Vector<>(a1);
//		v1.addElement("First");
//		v1.addElement("First");
//		v1.addElement("Second");
//		v1.addElement("Third");
//		v1.addElement(null);
//		v1.addElement(null);
		
//		Enumeration<String> e1=v1.elements();
//		while(e1.hasMoreElements()) {
//			System.out.println(e1.nextElement());
//		}
		
//		ArrayList<Integer> a2=new ArrayList<>();
//		a2.add(100);
//		a2.add(100);
//		a2.add(-8964);
//		a2.add(0);
//		
		//cannot add different types together.
//		Vector<String> v2=new Vector<>(a2);
//		v1.addElement("First");
//		v1.addElement("First");
//		v1.addElement("Second");
//		v1.addElement("Third");
//		v1.addElement(null);
//		v1.addElement(null);
		
		//using add all method.
		
		ArrayList<String> a3=new ArrayList<>();
		a3.add("Tiger");
		a3.add("Tiger");
		a3.add("Lion");
		a3.add("Kangaroo");
		a3.add(null);
		a3.add(null);
		
		//add array list to vector.
		Vector<String> v3=new Vector<>();
		v3.addElement("First");
		v3.addElement("First");
		v3.addElement("Second");
		v3.addElement("Third");
		v3.addElement(null);
		v3.addElement(null);
		v3.addAll(a3);
		Enumeration<String> e1=v3.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
	}

}
