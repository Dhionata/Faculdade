package br.com.exerc;

import java.util.Scanner;

public class mediaponderada {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int x, i;
		double a, b, c, m;

		x = entrada.nextInt();

		for (i = 1; i <= x; i++) {
			a = entrada.nextDouble();
			b = entrada.nextDouble();
			c = entrada.nextDouble();

			m = ((2 * a) + (3 * b) + (5 * c)) / 10;
			System.out.printf("%.1f\n", m);
		}
	}
}