package br.com.exerc;

import java.util.Scanner;

public class rapaz {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		int a, b, c, x, y, z, top;

		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();

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
		System.out.printf("%d\n%d\n%d", x, y, z);
		System.out.printf("\n\n%d\n%d\n%d\n", a, b, c);
	}
}