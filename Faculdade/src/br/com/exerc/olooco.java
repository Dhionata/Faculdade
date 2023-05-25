package br.com.exerc;

import java.util.Scanner;

public class olooco {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		int A, B, C, D;

		A = entrada.nextInt();
		B = entrada.nextInt();
		C = entrada.nextInt();
		D = entrada.nextInt();

		if (B > C) {
			if (D > A) {
				if ((C + D) > (A + B)) {
					if (C >= 0 && D >= 0) {
						if (A % 2 == 10)
							;
						System.out.println("Valores aceitos");
					}
				}
			}
		} else {
			System.out.println("Valores nao aceitos");
		}
	}
}