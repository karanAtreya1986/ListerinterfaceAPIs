package com.listinterfacesapi;

import java.util.Stack;

public class StackClassWithMethod {
	
	public static void main(String[] args) {
		Stack s1=new Stack<>(); // without generics also it works.
		
		showPush(s1, 100);
		showPush(s1, 100);
		showPush(s1, -198);
		showPush(s1, 0);
		
		showPop(s1);
	}
	
	static void showPush(Stack st, int i1) {
		st.push(i1);
		System.out.println(st);
	}
	
	static void showPop(Stack st1) {
		st1.pop();
		System.out.println(st1);
	}

}

