package com.listinterfacesapi;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorClassAndItsWorking {

	public static void main(String[] args) {

		Vector<String> v1=new Vector<>(3,7);
		v1.addElement("First");
		v1.addElement("First");
		v1.addElement(null);
		v1.addElement(null);
		v1.addElement("Second");
		v1.addElement("Third");

		//to get size of vector
		int sizeOfVector=v1.size();
		//System.out.println(sizeOfVector);

		//to get capacity of vector
		int capacityOfVector=v1.capacity();
		//System.out.println(capacityOfVector); //returns addition of the capacity and load.

		//no way to calculate only load.

		//enumerations to iterate vector
		//		Enumeration<String> e1=v1.elements();
		//		while(e1.hasMoreElements()) {
		//			System.out.println(e1.nextElement());
		//		}

		//Iterators to traverse vector- this also works.
		//		Iterator<String> it1=v1.iterator();
		//		while(it1.hasNext()) {
		//			System.out.println(it1.next());
		//		}

		//using enhanced for loop for vectors. this also works.
		//		for(String s1:v1) {
		//			System.out.println(s1);
		//		}

		//using list iterator for vectors.
		ListIterator<String> lt1=v1.listIterator();
		System.out.println("In forward direction");
		while(lt1.hasNext()) {
			System.out.println(lt1.next());
		}

		ListIterator<String> lt2=v1.listIterator();
		System.out.println("In backward direction");
		while(lt1.hasPrevious()) {
			System.out.println(lt1.previous());
		}
	}

}
