package br.com.exerc;

import java.util.Scanner;

public class intervalo {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		double i;

		i = entrada.nextDouble();

		if (i >= 0 & i <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (i > 25 & i <= 50) {
			System.out.println("Intervalo (25,50]");
		} else if (i > 50 & i <= 75) {
			System.out.println("Intervalo (50,75]");
		} else if (i > 75 & i <= 100) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
	}
}