package br.com.exerc;

import java.util.Scanner;

public class salário {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		double s, n, d;

		s = entrada.nextDouble();

		if (s > 0 && s <= 400.00) {
			n = s + (s * 0.15);
			d = n - s;
			System.out.printf("Novo salario: %.2f\n", n);
			System.out.printf("Reajuste ganho: %.2f\n", d);
			System.out.println("Em percentual: 15 %");
		} else if (s > 400.00 && s <= 800.00) {
			n = s + (s * 0.12);
			d = n - s;
			System.out.printf("Novo salario: %.2f\n", n);
			System.out.printf("Reajuste ganho: %.2f\n", d);
			System.out.println("Em percentual: 12 %");
		} else if (s > 800.00 && s <= 1200.00) {
			n = s + (s * 0.10);
			d = n - s;
			System.out.printf("Novo salario: %.2f\n", n);
			System.out.printf("Reajuste ganho: %.2f\n", d);
			System.out.println("Em percentual: 10 %");
		} else if (s > 1200.00 && s <= 2000.00) {
			n = s + (s * 0.07);
			d = n - s;
			System.out.printf("Novo salario: %.2f\n", n);
			System.out.printf("Reajuste ganho: %.2f\n", d);
			System.out.println("Em percentual: 7 %");
		} else if (s > 2000.00) {
			n = s + (s * 0.04);
			d = n - s;
			System.out.printf("Novo salario: %.2f\n", n);
			System.out.printf("Reajuste ganho: %.2f\n", d);
			System.out.println("Em percentual: 4 %");
		}
	}
}
