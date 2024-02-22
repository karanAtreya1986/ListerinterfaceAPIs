package com.listinterfacesapi;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithCustomClass {

	public static void main(String[] args) {

		List<CustomBookClass> a1=new ArrayList<>();

		CustomBookClass b1=new CustomBookClass(1, "Karan", "Tiger", "Lion", 100); 
		CustomBookClass b2=new CustomBookClass(1, "Karan", "Tiger", "Lion", 100); 
		CustomBookClass b3=new CustomBookClass(2, null, "Tiger", "Lion", 100);
		CustomBookClass b4=new CustomBookClass(3, null, "Tiger", "Lion", 100);
		CustomBookClass b5=new CustomBookClass(0, "Hogan", "WWE", "Wrestling", -9864);

		a1.add(b1);
		a1.add(b2);
		a1.add(b3);
		a1.add(b4);
		a1.add(b5);

		for(CustomBookClass s1:a1) {
			System.out.println
			(s1.author + " " + s1.id + " " + s1.name + " " + s1.publisher + " " + s1.quantity);
		}

	}

}
