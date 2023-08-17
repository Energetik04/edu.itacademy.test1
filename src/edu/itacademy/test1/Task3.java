package edu.itacademy.test1;

public class Task3 {

	public static void main(String[] args) {
		double x;
		double result;
		double result1;
		int n;

		n = 20;
		x = 0.5;
		result = 0;

		for (int i = 1; i < n; i++) {
			result = (Math.sin(i * x / 2) + Math.sin((i * x - 1.0) / 2)) / (Math.pow(Math.E, (x - 1) / i)) + result;
		}

		result1 = (Math.sqrt(n * Math.PI)) * result;
		System.out.println(result1);

	}

}
