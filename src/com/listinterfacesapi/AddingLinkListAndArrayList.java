package com.listinterfacesapi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class AddingLinkListAndArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<>();
		a1.add(null);
		a1.add(null);
		a1.add("First");
		a1.add("First");
		a1.add("Second");
		
		LinkedList<String> l1=new LinkedList<>();
		l1.add("Tiger");
		l1.add("Anaconda");
		l1.add(null);
		l1.add(null);
		l1.add("Tiger");
		
		l1.addAll(a1);
		
		Iterator<String>it1=l1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}

}
