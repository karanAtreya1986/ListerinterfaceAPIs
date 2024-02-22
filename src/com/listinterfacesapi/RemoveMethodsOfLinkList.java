package com.listinterfacesapi;

import java.util.Iterator;
import java.util.LinkedList;

public class RemoveMethodsOfLinkList {


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
			
			System.out.println("=======================================");
			
			//remove first occurrence of the element.
			boolean s2=l1.removeFirstOccurrence("Tiger");
			System.out.println(s2);
			
			//remove last occurrence of the element.
			boolean s3=l1.removeFirstOccurrence("Tiger");
			System.out.println(s3);
			
			System.out.println("=======================================");

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

