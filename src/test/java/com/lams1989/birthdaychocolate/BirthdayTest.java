package com.lams1989.birthdaychocolate;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

public class BirthdayTest extends TestCase {

	public void testeCount1() {
		List<Integer> s = Arrays.asList( 1, 2, 1, 3, 2 );
		int d = 3;
		int m = 2;

		int result = Birthday.birthday(s, d, m);
		
		assertEquals(2, result);
	}
	
	public void testeCount2() {
		List<Integer> s = Arrays.asList(1, 1, 1, 1, 1, 1);
		int d = 3;
		int m = 2;

		int result = Birthday.birthday(s, d, m);
		
		assertEquals(0, result);
	}
	
	public void testeCount3() {
		List<Integer> s = Arrays.asList(4);
		int d = 4;
		int m = 1;

		int result = Birthday.birthday(s, d, m);
		
		assertEquals(1, result);
	}

}
