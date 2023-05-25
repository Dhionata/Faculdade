package br.com.exerc;

import java.util.Scanner;

public class divisaoxy {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		int x, y, n;
		double d;

		n = entrada.nextInt();

		for (int i = 0; i <= n; i++) {
			x = entrada.nextInt();
			y = entrada.nextInt();

			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				d = x / y;
				System.out.printf("%.1f", d);
			}
		}
	}
}