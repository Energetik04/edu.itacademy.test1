package edu.itacademy.test1;

public class Task1 {

	public static void main(String[] args) {
		double x;
		double result;
		x = 0.5;
		result = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin(((Math.PI) * x) / (x + 2.0 / 3))) + 1.7;

		System.out.println(result);
	}

}
