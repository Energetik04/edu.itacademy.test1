package edu.itacademy.test1;

public class Task2 {

	public static void main(String[] args) {
		double x;
		double result;
		double a;
		double b;
		int n;
		double h;

		n = 10;
		a = 0.5;
		b = 1.0;
		x = a;

		if (a > b) {
			h = (a - b) / n;
		} else {
			h = (b - a) / n;
		}

		System.out.println("|----------------|");
		System.out.printf("|%5s|%10s|\n", "x", "f(x)");
		System.out.println("|----------------|");
		for (int i = 0; i < n; i++) {
			result = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin(((Math.PI) * x) / (x + 2.0 / 3))) + 1.7;
			System.out.printf("| %.1f | %.6f |\n", x, result);
			x = x + h;

		}
	}

}
