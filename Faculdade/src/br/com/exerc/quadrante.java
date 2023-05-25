package br.com.exerc;

import java.util.Scanner;

public class quadrante {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		int x, y, t = 1;

		while (t != 0) {
			x = entrada.nextInt();
			y = entrada.nextInt();

			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else {
				t--;
			}
		}
	}
}