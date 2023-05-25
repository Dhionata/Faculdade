package br.com.exerc;

import java.util.Scanner;

public class crescentedecrescente {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int x, y;

		do {
			x = entrada.nextInt();
			y = entrada.nextInt();

			if (x > y) {
				System.out.print("Decrescente\n");
			}

			else if (x < y) {
				System.out.print("Crescente\n");
			}
		} while (x != y);
	}
}