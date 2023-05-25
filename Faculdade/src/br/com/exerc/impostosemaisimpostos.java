package br.com.exerc;

import java.util.Scanner;

public class impostosemaisimpostos {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		double s, i, i2, i3;

		s = entrada.nextDouble();

		if (s >= 0 && s <= 2000.00) {
			System.out.println("Isento");
		} else if (s > 2000.00 && s <= 3000.00) {
			i = s * 0.08;
			System.out.printf("R$ %.2f", i);
		} else if (s > 3000.00 && s <= 4500.00) {
			i = 1000 * 0.08;
			i2 = (s - 3000) * 0.18;
			System.out.printf("R$ %.2f", i + i2);
		} else if (s > 4500.00) {
			i = 1000 * 0.08;
			i2 = (s - 3000) * 0.18;
			i3 = (s - 4500) * 0.28;
			System.out.printf("R$ %.2f", i + i2 + i3);
		}
	}
}