package br.com.exerc;

import java.util.Scanner;

public class consecultivosimpares {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int x, y, v, g = 0, g1 = 0;
		v = entrada.nextInt();

		for (int i = 1; i <= v; i++) {
			x = entrada.nextInt();
			y = entrada.nextInt();

			if (x == y) {
				System.out.println(0);
			} else if (x > y) {
				for (int i1 = y + 1; i1 < x; i1++) {
					if (i1 % 2 != 0) {
						g += i1;
					}
				}
				System.out.println(g);
			} else {
				for (int i2 = x + 1; i2 < y; i2++) {
					if (i2 % 2 != 0) {
						g1 = i2;
					}
				}
				System.out.println(g1);
			}
		}
	}
}