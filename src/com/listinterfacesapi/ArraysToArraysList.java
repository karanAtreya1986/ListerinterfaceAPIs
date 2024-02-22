package com.listinterfacesapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArraysToArraysList {
	
	public static void main(String[] args) {
		
		String a[]= {"Titanic", "Jack", "Kate", "Monster", "Jack"};
		
		ArrayList<String> a1=new ArrayList<>(Arrays.asList(a));
		a1.add("Tiger");
		a1.add("Tiger");
		a1.add(null);
		a1.add("Lion");
		a1.add(null);
		
		Iterator<String> it1=a1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
	}

}
