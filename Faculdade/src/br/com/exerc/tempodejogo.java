package br.com.exerc;

import java.util.Scanner;

public class tempodejogo {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int x, y, t;

		x = entrada.nextInt();
		y = entrada.nextInt();

		if (x == y) {
			t = 24 - x + y;
			System.out.printf("O JOGO DUROU %d HORA(S)\n", t);
		} else if (x <= y) {
			t = y - x;
			System.out.printf("O JOGO DUROU %d HORA(S)\n", t);
		} else {
			t = 24 - x + y;
			System.out.printf("O JOGO DUROU %d HORA(S)\n", t);
		}
	}
}