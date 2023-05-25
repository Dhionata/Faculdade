package br.com.periodo3.ex1;

import java.util.Scanner;

public class Principal {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int cód;

		do {

			Eletrodomestico a1 = new Eletrodomestico();

			System.out.println("Informe o nome do Eletrodomestico: ");
			a1.setNome(entrada.nextLine());

			System.out.println("Informe a descrição: ");
			a1.setDescrição(entrada.nextLine());

			System.out.println("Informe o estado (true/false): ");
			a1.setEstado(entrada.nextBoolean());

			System.out.println(a1.imprimir());

			System.out.println("\nDeseja cadastrar outro produto?" + "\n(0 para fechar o programa).");

			cód = entrada.nextInt();

		} while (cód != 0);
	}
}