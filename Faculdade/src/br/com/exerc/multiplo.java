package br.com.exerc;

import java.util.Scanner;

public class multiplo {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		int A, B;

		A = entrada.nextInt();
		B = entrada.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
	}
}