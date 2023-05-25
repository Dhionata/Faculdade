package br.com.exerc;

import java.util.Scanner;;

public class ouxi {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		int cod, q;
		double p;

		cod = entrada.nextInt();
		q = entrada.nextInt();

		switch (cod) {
		case 1:
			p = q * 4;
			System.out.printf("Total: R$ %.2f\n", p);
			break;
		case 2:
			p = q * 4.5;
			System.out.printf("Total: R$ %.2f\n", p);
			break;
		case 3:
			p = q * 5;
			System.out.printf("Total: R$ %.2f\n", p);
			break;
		case 4:
			p = q * 2;
			System.out.printf("Total: R$ %.2f\n", p);
			break;
		case 5:
			p = q * 1.5;
			System.out.printf("Total: R$ %.2f\n", p);
			break;
		}
	}
}