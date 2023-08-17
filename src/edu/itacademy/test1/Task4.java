package edu.itacademy.test1;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		int x;
		int y;
		int count;
		int n;
		boolean flag;

		Scanner str = new Scanner(System.in);
		flag = true;
		count = 0;

		System.out.println("Введи какое количество точек будешь вводить");
		System.out.print("> ");
		n = str.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Введи координату X,точки №" + i);
			System.out.print("> ");
			do {
				while (!str.hasNextInt()) {
					System.out.println("не-не,пирожок, введи координату(число целое)");
					str.nextLine();
					System.out.print("> ");
				}
				flag = false;
				x = str.nextInt();
			} while (flag == true);

			System.out.println("Введи координату Y,точки №" + i);
			System.out.print("> ");

			do {
				while (!str.hasNextInt()) {
					System.out.println("не-не,пирожок, введи координату(число целое)");
					str.nextLine();
					System.out.print("> ");
				}
				flag = false;
				y = str.nextInt();
			} while (flag == true);
			if ((x >= 0 && x <= 2) && (y <= 1 && y >= -1)) {
				count++;
			} else {
			}
			if ((x >= -2 && x <= 0) && (y <= 2 && y >= 0) && (x != 0 && (y > 0 && y < 1))) {
				count++;
			}
		}
		System.out.println("Количество точек попавших в область: " + count);
	}
}
