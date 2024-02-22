package com.listinterfacesapi;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveMethodsInArrayList {



	public static void main(String[] args) {

		ArrayList<String> a1=new ArrayList<>();
		a1.add("First");
		a1.add("First");
		a1.add(null);
		a1.add(null);
		a1.add("Second");

		ArrayList<String> a2=new ArrayList<>();
		a2.add("Tiger");
		a2.add("Tiger");
		a2.add(null);
		a2.add(null);
		a2.add("Lion");

		a2.addAll(a1);
//		
//		System.out.println(a2.remove("Tiger")); //returns true or false. removes first occurrence of the element.
//		System.out.println("=================");
//		System.out.println(a2.remove("Tig")); //returns false as no match.
//		System.out.println("=================");
		
		System.out.println(a2.removeAll(a1)); //returns true or false. all common elements from both list are removed.
		System.out.println("=================");

		//traverse using iterator
		Iterator<String>it1=a2.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("=================");

		//traverse using for loop
		for(String s1:a2) {
			System.out.println(s1);
		}
	}

}

