package com.listinterfacesapi;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkListWithCustomClass {
	
	public static void main(String[] args) {
		
		LinkedList<CustomBookClass> l1=new LinkedList<>();
		
		CustomBookClass b1=new CustomBookClass(1, "Karan", "Tiger", "Lion", 100); 
		CustomBookClass b2=new CustomBookClass(1, "Karan", "Tiger", "Lion", 100); 
		CustomBookClass b3=new CustomBookClass(2, null, "Tiger", "Lion", 100);
		CustomBookClass b4=new CustomBookClass(3, null, "Tiger", "Lion", 100);
		CustomBookClass b5=new CustomBookClass(0, "Hogan", "WWE", "Wrestling", -9864);
		
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(b4);
		l1.add(b5);
		//l1.add("Texas"); //we can only add type of data which belongs to custom class, nothing else allowed. It throws compiler Issue.

		//using enhanced for loop
		for(CustomBookClass s1:l1) {
			System.out.println
			(s1.author + " " + s1.id + " " + s1.name + " " + s1.publisher + " " + s1.quantity);
		}
		System.out.println("==============");
		
		//using list iterator
		//forward direction
		ListIterator<CustomBookClass>it1=l1.listIterator();
		while(it1.hasNext()) {
			CustomBookClass cb1=it1.next();
			//System.out.println(it1.next());
			System.out.println(cb1.author + " " + cb1.id + " " + cb1.name + " " + cb1.publisher + " " + cb1.quantity);	
		}
		System.out.println("==============");
		//backward direction
		while(it1.hasPrevious()) {
			CustomBookClass cb2=it1.previous();
			//System.out.println(it1.previous());
			System.out.println(cb2.author + " " + cb2.id + " " + cb2.name + " " + cb2.publisher + " " + cb2.quantity);
		}
	}

}
