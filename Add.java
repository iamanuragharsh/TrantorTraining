package com.day4;

public class Add {

	public void add(int a, int b) throws Exception {
		try {
			if (a < 0 || b < 0) {
				throw new Exception("invalid input");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		if (a > 0 && b > 0) {
			int sum = a + b;
			System.out.println(sum);
		}

	}

	public static void main(String args[]) throws Exception {
		Add add = new Add();
		add.add(-40,10);
	}
}