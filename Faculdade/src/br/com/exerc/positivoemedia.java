package br.com.exerc;

import java.util.Scanner;

public class positivoemedia {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		double a, p = 0, n = 0, par = 0, impar = 0;

		for (int i = 1; i <= 5; i++) {
			a = entrada.nextDouble();
			if (a % 2 == 0) {
				par++;
			} else if (a % 2 != 0) {
				impar++;
			}
			if (a > 0) {
				p++;
			} else if (a < 0) {
				n++;
			}
		}
		System.out.printf("%.0f valor(es) par(es)\n", par);
		System.out.printf("%.0f valor(es) impar(es)\n", impar);
		System.out.printf("%.0f valor(es) positivo(s)\n", p);
		System.out.printf("%.0f valor(es) negativo(s)\n", n);
	}
}