package com.listinterfacesapi;

import java.util.ArrayList;
import java.util.Iterator;

public class AddingMultipleArrayList {

		
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

