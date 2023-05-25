package br.com.Exercício1;

import java.util.Scanner;

public class principal {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		Operações p1 = new Operações();

		int i, f;
		String b;
		System.out.println("Informe a palavra a ser invertida: ");
		b = entrada.nextLine();
		System.out.println("Informe o valor inicial: ");
		i = entrada.nextInt();
		System.out.println("Informe o valor final: ");
		f = entrada.nextInt();

		p1.Hello();
		System.out.println("------ímpares------");
		p1.ímpares(i, f);
		System.out.println("------Palavra invertida------");
		p1.InverterString(b);
		System.out.println("\n\n------Operaçõo 1------");
		p1.Operacao1(i, f);
		System.out.println("\n------Operaçõo 2------");
		p1.Operacao2(i, f);

	}
}