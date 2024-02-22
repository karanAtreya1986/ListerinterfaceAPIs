package com.listinterfacesapi;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {
	
	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<>();
		a1.add("First");
		a1.add("First");
		a1.add("Second");
		a1.add(null);
		a1.add(null);
		
		//a1.addAll(null); //this will throw null pointer, it has to be another collection only.
		
		ArrayList<String> a11=new ArrayList<>();
		a11.add("Tiger");
		a11.add("Kangaroo");
		a11.add("Lion");
		a11.add(null);
		a11.add(null);
		
		a1.addAll(a11);
		//a1.remove("First");
		//System.out.println(a1.remove("werewr")); //nothing will be removed since no match. returns false.
		//System.out.println(a1.remove("First")); //returns true.
		//if multiple elements with same name, then only first occurrence is removed.
		
		//remove entire second list
		//System.out.println(a1.removeAll(a11));
		//a1.removeAll(a11);
		
		//remove entire first list
		//System.out.println(a1.retainAll(a11));
		
		//remove from certain index
		
		//String s1=a1.remove(3);
		//System.out.println(s1);
		
		//remove from certain index which does not exist. index out of bounds.
		
		//String s1=a1.remove(1034);
		//System.out.println(s1);
		
		//String s1=a1.set(4, "Bull dog is on the way");
		//System.out.println(s1); //returns the previous element which is being replaced.
		
		//size of list
//		int s1=a1.size();
//		System.out.println(s1);
		
		//clear method
		//System.out.println(a1.clear());
		//a1.clear();
		
		//use iterator for traversal
//		Iterator<String> i1=a1.iterator();
//		while(i1.hasNext()) {
//			System.out.println(i1.next());
//		}
		
		//using enhanced for loop
		for(String s1:a1) {
			System.out.println(s1);
		}
		
		
	}

}
