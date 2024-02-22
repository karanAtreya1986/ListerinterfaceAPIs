package com.listinterfacesapi;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListWithListIterator {


	public static void main(String[] args) {

		ArrayList<String> a1=new ArrayList<>();
		a1.add("First");
		a1.add("First");
		a1.add("Second");
		a1.add(null);
		a1.add(null);

		ArrayList<String> a11=new ArrayList<>();
		a11.add("Tiger");
		a11.add("Kangaroo");
		a11.add("Lion");
		a11.add(null);
		a11.add(null);

		a1.addAll(a11);

		//using list iterator and moving in forward direction
		ListIterator<String> lt1=a1.listIterator();
		while(lt1.hasNext()) {
			System.out.println(lt1.next());
		}
		System.out.println("==========================");

		//using list iterator and moving in backward direction
		ListIterator<String> lt11=a1.listIterator();
		while(lt11.hasPrevious()) {
			System.out.println(lt11.previous());
		}
		


	}

}
