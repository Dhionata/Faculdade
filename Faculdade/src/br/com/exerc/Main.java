package br.com.exerc;

import java.util.Scanner;

public class Main {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		double x, divisao;

		x = entrada.nextDouble();

		System.out.println("NOTAS:");

		System.out.printf("%d nota(s) de R$ 100,00\n", (x / 100));
		divisao = (x % 100);

		System.out.printf("%d nota(s) de R$ 50,00\n", (divisao / 50));
		divisao = (divisao % 50);

		System.out.printf("%d nota(s) de R$ 20,00\n", (divisao / 20));
		divisao = (divisao % 20);

		System.out.printf("%d nota(s) de R$ 10,00\n", (divisao / 10));
		divisao = (divisao % 10);

		System.out.printf("%d nota(s) de R$ 5,00\n", (divisao / 5));
		divisao = (divisao % 5);

		System.out.printf("%d nota(s) de R$ 2,00\n", (divisao / 2));
		divisao = (divisao % 2);

		System.out.println("MOEDAS:");

		System.out.printf("%d moedas(s) de R$ 1,00\n", (divisao / 1));
		divisao = (divisao % 1);

		System.out.printf("%d moeda(s) de R$ 0,50\n", (divisao / 0.5));
		divisao = (divisao % 0.5);

		System.out.printf("%d moeda(s) de R$ 0,25\n", (divisao / 0.25));
		divisao = (divisao % 0.25);

		System.out.printf("%d moeda(s) de R$ 0,10\n", (divisao / 0.10));
		divisao = (divisao % 0.10);

		System.out.printf("%d moeda(s) de R$ 0,05\n", (divisao / 0.05));
		divisao = (divisao % 0.05);

		System.out.printf("%d moedas(s) de R$ 0.01\n", (divisao / 0.01));
		divisao = (divisao % 0.01);

	}
}