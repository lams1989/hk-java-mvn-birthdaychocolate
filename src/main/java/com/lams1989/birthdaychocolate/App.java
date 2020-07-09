package com.lams1989.birthdaychocolate;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		int n = 5;
		List<Integer> s = new ArrayList<Integer>();
		int c[] = { 1, 2, 1, 3, 2 };
		int d = 3;
		int m = 2;
		
		 for (int i = 0; i < n; i++) {
			 s.add(i, c[i]);
			 
		 }
		 int result = Birthday.birthday(s, d, m);
		 
		 System.out.println("" + result);
	}
}
