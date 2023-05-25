package br.com.exerc;

import java.util.Scanner;

public class parinmparblablablaingles {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int x, i, y;

		x = entrada.nextInt();

		for (i = 1; i <= x; i++) {
			y = entrada.nextInt();
			if (y == 0) {
				System.out.println("NULL");
			} else if (y > 0 && y % 2 == 0) {
				System.out.println("EVEN POSITIVE");
			} else if (y > 0 && y % 2 != 0) {
				System.out.println("ODD POSITIVE");
			} else if (y < 0 && y % 2 != 0) {
				System.out.println("ODD NEGATIVE");
			} else if (y < 0 && y % 2 == 0) {
				System.out.println("EVEN NEGATIVE");
			}
		}
	}
}