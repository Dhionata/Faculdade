package br.com.exerc;

import java.util.Scanner;

public class tabuada {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		int x, i, p;
		x = entrada.nextInt();

		for (i = 1; i <= 10; i++) {
			p = i * x;
			System.out.printf("%d x %d = %d\n", i, x, p);
		}
	}
}