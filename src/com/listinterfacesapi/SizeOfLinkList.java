package com.listinterfacesapi;

import java.util.Iterator;
import java.util.LinkedList;

public class SizeOfLinkList {


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

		//remove first element from list.
		//String s2=l1.removeFirst();
		//System.out.println(s2);

		//remove last element from list.
		//String s3=l1.removeLast();
		//System.out.println(s3);

		//System.out.println("=======================================");

		//remove first occurrence of the element.
		//boolean s2=l1.removeFirstOccurrence("Tiger");
		//System.out.println(s2);

		//remove last occurrence of the element.
		//boolean s3=l1.removeFirstOccurrence("Tiger");
		//System.out.println(s3);

		//System.out.println("=======================================");

		System.out.println(l1);

		//set method for replacing values
		String s2=l1.set(4, "The Rock Is Cooking");
		//System.out.println(s2);
		//System.out.println("=======================================");

		//get method of link list
		String s3=l1.get(3); //get the value by passing in index
		//System.out.println(s3);

		String s4=l1.getFirst();
		//System.out.println(s4);

		String s5=l1.getLast();
		//System.out.println(s5);

		//System.out.println("=======================================");
		
		//size of link list
		int s21=l1.size();
		System.out.println(s21);

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

