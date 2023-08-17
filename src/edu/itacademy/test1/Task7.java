package edu.itacademy.test1;

public class Task7 {
	public static void main(String[] args) {

		double x;
		double z;
		int n;
		int m;
		double HX;
		double HZ;
		double xStart;
		double zStart;
		double y;
		
		x = xStart;
		z = zStart;
		y = 0;

		if (n >= m) {
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					y = Math.sqrt(Math.pow(z, 2) + Math.pow(x, 2)) * Math.log10(z)
							+ (Math.abs(Math.log10(z)) / (Math.sqrt(Math.pow(x, 2) - Math.pow(z, 2) + 3.2)));
					x = x + HX;
					z = z + HZ;
				}
			}
		} else {
			if (m >= n) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						y = Math.sqrt(Math.pow(z, 2) + Math.pow(x, 2)) * Math.log10(z)
								+ (Math.abs(Math.log10(z)) / (Math.sqrt(Math.pow(x, 2) - Math.pow(z, 2) + 3.2)));
						x = x + HX;
						z = z + HZ;
					}
				}

			}
		}
	}
}