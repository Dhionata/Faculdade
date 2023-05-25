package br.com.exerc;

import java.util.Scanner;

public class triangulotrapezio {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		double A, B, C, p, a;

		A = entrada.nextDouble();
		B = entrada.nextDouble();
		C = entrada.nextDouble();

		if ((A + B) > C && (A + C) > B && (C + B) > A) {
			p = A + B + C;
			System.out.printf("Perimetro = %.1f\n", p);
		} else {
			a = ((A + B) / 2) * C;
			System.out.printf("Area = %.1f\n", a);
		}
	}
}