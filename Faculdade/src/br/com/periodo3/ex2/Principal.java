package br.com.periodo3.ex2;

import java.util.Scanner;

public class Principal {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int cód;

		do {

			Televisor a1 = new Televisor();

			System.out.println("Informe o nome do Eletrodomestico: ");
			a1.setCanal(entrada.nextInt());

			System.out.println("Informe a descrição: ");
			a1.setVolume(entrada.nextInt());

			System.out.println("Informe o estado do televisor (true/false): ");
			a1.setEstado(entrada.nextBoolean());

			System.out.println(a1.imprimir());

			System.out.println("\nDeseja cadastrar outro televisor?" + "\n(0 para fechar o programa).");

			cód = entrada.nextInt();

		} while (cód != 0);
	}
}