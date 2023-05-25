package br.com.Exercício2;

import java.util.Scanner;

public class TesteMetodoVariavel {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		MetodoVariavel p1 = new MetodoVariavel();

		int a, b, c;
		double d, e, f, g;

		System.out.println("------Informe 3 valores------");
		System.out.println("Informe o valor para A: ");
		a = entrada.nextInt();
		System.out.println("Informe o valor para B: ");
		b = entrada.nextInt();
		System.out.println("Informe o valor para C: ");
		c = entrada.nextInt();

		System.out.println("---Valores---");
		p1.A(a, b, c);
		System.out.println("\n\n------Informe 4 valores------");
		System.out.println("Informe o valor para D");
		d = entrada.nextDouble();
		System.out.println("Informe o valor para E");
		e = entrada.nextDouble();
		System.out.println("Informe o valor para F");
		f = entrada.nextDouble();
		System.out.println("Informe o valor para G");
		g = entrada.nextDouble();
		System.out.println("---Somat�ria---");
		System.out.println(p1.B(d, e, f, g));
	}
}