package edu.itacademy.test1;

import java.util.Random;

public class Task6 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a;
		int b;
		int m;
		int k;
		double f;
		double t1, t2, t3, t4;

		a = 3 * (int) Math.pow(10, 3);
		b = 6 * (int) Math.pow(10, 4);
		m = 4;
		t1 = Math.sqrt(a + b + m);
		t2 = m * Math.sqrt(a + b);
		t3 = Math.sqrt(a * b * m);
		t4 = m * Math.sqrt(a * b);
		
		//System.out.println(t1);
		//System.out.println(t2);
		//System.out.println(t3);
		//System.out.println(t4);
		
		for (int i = 1; i <= 20; i++) {
			k = rand.nextInt(-30, 60);
			f = Math.pow(k, 3) - 25 * Math.pow(k, 2) + 50 * k + 1000;

			if (((f > t1) && (f < t2)) || ((f < t1) && (f > t2))) {
				System.out.println("Значение номер № " + i + " = " + f);
			} else {
				if (((f > t3) && (f < t4)) || ((f < t3) && (f > t4))) {
					System.out.println("Значение номер № " + i + " = " + f);
				}
			}
		}
	}

}
