package br.com.exerc;

import java.util.Scanner;

public class valorespares {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		double a, p = 0;

		for (int i = 1; i <= 5; i++) {
			a = entrada.nextDouble();
			if (a % 2 == 0) {
				p++;
			}
		}
		System.out.printf("%.0f valores pares\n", p);
	}
}