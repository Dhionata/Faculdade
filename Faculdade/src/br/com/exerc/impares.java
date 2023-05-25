package br.com.exerc;

import java.util.Scanner;

public class impares {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		int x, y, g = 0;

		x = entrada.nextInt();
		y = entrada.nextInt();

		if (x > y) {
			for (int i = x - 1; i > y; y--) {
				if (y % 2 != 0) {
					g += i;
				}
			}
		} else {
			for (int i = y - 1; i > x; i--) {
				if (x % 2 != 0) {
					g += i;
				}
			}
		}
		System.out.printf("%d\n", g);
	}
}