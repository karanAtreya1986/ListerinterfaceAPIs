package com.listinterfacesapi;

import java.util.Iterator;
import java.util.LinkedList;

public class AddFirstAddLastMethodsInLinkList {

	public static void main(String[] args) {

		LinkedList<String> l1=new LinkedList<>();
		l1.add("Tiger");
		l1.add("Tiger");
		l1.add(null);
		l1.add(null);
		l1.add("Lion");

		//add first. adds to the start of the list.
		l1.addFirst("Dinosaur");

		//add last. adds to the end of the list.
		l1.addLast("Puliodare");

		//print using for loop
		for(String s1:l1) {
			System.out.println(s1);
		}
		System.out.println("=======================================");

		//print using iterator
		Iterator<String> it1=l1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}

}

