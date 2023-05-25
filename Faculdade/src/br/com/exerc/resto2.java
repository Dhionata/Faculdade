package br.com.exerc;

import java.util.Scanner;

public class resto2 {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int x, i;
		x = entrada.nextInt();

		for (i = 1; i <= 10000; i++) {
			if (i % x == 2) {
				System.out.println(i);
			}
		}
	}
}