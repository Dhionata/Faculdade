package br.com.exerc;

import java.util.Scanner;

public class organizaretriangulo {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		double a, b, c, x, z, y, top;
		a = entrada.nextDouble();
		b = entrada.nextDouble();
		c = entrada.nextDouble();

		x = a;
		y = b;
		z = c;

		if (x > y) {
			top = x;
			x = y;
			y = top;
		}
		if (x > z) {
			top = x;
			x = z;
			z = top;
		}
		if (y > z) {
			top = y;
			y = z;
			z = top;
		}

		// z= maior y = intermediário x = menor

		if (z >= (y + x)) { // A ≥ B+C
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if (Math.pow(z, 2) == Math.pow(y, 2) + Math.pow(x, 2)) { // A2 = B2 + C2
				System.out.println("TRIANGULO RETANGULO");
			}
			if (Math.pow(z, 2) > (Math.pow(y, 2) + Math.pow(x, 2))) {// A2 > B2 + C2
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if (Math.pow(z, 2) < (Math.pow(y, 2) + Math.pow(x, 2))) { // A2 < B2 + C2
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (y == z && y == x && x == z) {
				System.out.println("TRIANGULO EQUILATERO");
			} else if (y == z || y == x || x == z) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
	}
}
