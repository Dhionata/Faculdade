package br.com.exerc;

import java.util.Scanner;

public class sequenciadenumerosesomas {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		int x, y, p = 0, p2 = 0;

		x = entrada.nextInt();
		y = entrada.nextInt();

		if (x <= 0 || y <= 0) {

		} else if (x < y) {
			p = x;
			y = x;
			x = p;
			for (int i = y; i <= x; i++) {
				System.out.print(i + " ");
				p2 = p2 + i;
			}
			System.out.println("Sum=" + p2);
		} else {
			for (int i = y; i <= x; i++) {
				p2 = p2 + i;
				System.out.print(i + " ");
			}
			System.out.println("Sum=" + p2);
		}
	}
}
