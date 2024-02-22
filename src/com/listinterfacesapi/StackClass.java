package com.listinterfacesapi;

import java.util.Stack;

public class StackClass {
	
	public static void main(String[] args) {
		
		Stack<Integer> s1=new Stack<>();
		s1.push(10);
		System.out.println(s1);
		s1.push(10);
		System.out.println(s1);
		s1.push(0);
		System.out.println(s1);
		s1.push(-29);
		System.out.println(s1);
		s1.push(-1876);		
		System.out.println(s1);
		
		s1.pop();
		System.out.println(s1);
//		s1.pop();
//		System.out.println(s1);
//		s1.pop();
//		System.out.println(s1);
//		s1.pop();
//		System.out.println(s1);
//		s1.pop();
//		System.out.println(s1);
//		s1.pop();
//		System.out.println(s1);
		
//		s1.peek();
//		System.out.println(s1);
	}

}
