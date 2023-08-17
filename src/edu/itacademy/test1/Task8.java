package edu.itacademy.test1;

public class Task8 {

	public static void main(String[] args) {
		double x;
		double result;
		
		x=0.1;
		result=0;
		while(x<=10){
			result=Math.pow(x, 2)-Math.pow(Math.E, 2*x)+4;
			if (result==0){
				break;
			}
			x=x+0.1;
			}
		System.out.println(result);
		}

	}
