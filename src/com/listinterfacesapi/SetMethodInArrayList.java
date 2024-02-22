package com.listinterfacesapi;

import java.util.ArrayList;
import java.util.Iterator;

public class SetMethodInArrayList {
	
	
		
		public static void main(String[] args) {
			
			ArrayList<String> a1=new ArrayList<>();
			a1.add("First");
			a1.add("First");
			a1.add(null);
			a1.add(null);
			a1.add("Second");
			
			System.out.println(a1.set(2, "Bob")); //will return value which was replaced.
			System.out.println("=================");
			
			//traverse using iterator
			Iterator<String>it1=a1.iterator();
			while(it1.hasNext()) {
				System.out.println(it1.next());
			}
			System.out.println("=================");
			
			//traverse using for loop
			for(String s1:a1) {
				System.out.println(s1);
			}
		}

	}

