package br.com.exerc;

import java.util.Scanner;

public class quadradodospares {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		int N, i;
		double p;

		N = entrada.nextInt();

		for (i = 1; i <= N; i++) {
			if (i % 2 == 0) {
				p = Math.pow(i, 2);
				System.out.printf("%d^2 = %.0f\n", i, p);
			}
		}
	}
}