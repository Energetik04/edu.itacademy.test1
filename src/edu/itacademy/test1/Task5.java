package edu.itacademy.test1;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		double x;
		double y;
		double a;
		double dX;
		int n;
		Scanner str = new Scanner(System.in);
		boolean flag;

		a = 1;
		x = (-2) * a;
		dX = a / 5.0;
		y = 0;

		System.out.println("Введи какое количество значение функций будем считать");
		System.out.print("> ");
		do {
			while (!str.hasNextInt()) {
				System.out.println("не-не,пирожок, введи челое положительное число =)");
				str.nextLine();
				System.out.print("> ");
			}
			n = str.nextInt();
			if (n > 0) {
				break;
			}
		} while (true);
		for (int i = 1; i <= n; i++) {
			if (x <= 0) {
				y = (a / 2) * (Math.pow(Math.E, (x / a)) + Math.pow(Math.E, (-1) * (x / a)));
			} else {
				if (x > 0) {
					y = 4 * Math.pow(a, 3) * (Math.pow(x, 2) + 4 * Math.pow(a, 2));
				}
			}
			System.out.println("Значение " + i + " значения Y= " + y);
			x = x + dX;
		}

	}
}
