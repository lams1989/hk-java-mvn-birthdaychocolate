package com.lams1989.birthdaychocolate;

import java.util.List;

public class Birthday {

	static int birthday(List<Integer> s, int d, int m) {
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < m; i++) {
			sum += s.get(i);
		}
		for (int j = 0; j < s.size() - m + 1; j++) {
			if (sum == d) {
				count++;
			}
			if (j + m < s.size()) {
				sum = sum - s.get(j) + s.get(j + m);
			}
		}
		return count;
	}
}
