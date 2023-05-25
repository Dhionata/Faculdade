package br.com.periodo3.ex3;

import java.util.Scanner;

public class Principal {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int cod;
		int i;

		System.out.println("\nDeseja ligar a televis�o? \n1 - Sim\n2 - N�o");
		cod = entrada.nextInt();

		if (cod == 1) {

			do {

				Televisor a1 = new Televisor();

				int max = a1.getCanais().size();
				int min = 0;
				int auxi = (min + (int) Math.random() * (max - min));

				a1.setEstado(true);
				System.out.println("\nEstado da televis�o: " + a1.isEstado());

				do {
					Canal c1 = new Canal();

					System.out.println("\n-- Cadastro de canais --");
					entrada.nextLine();

					System.out.println("\nInforme o nome do Canal: ");
					c1.setNomdc(entrada.nextLine());

					System.out.println("\nInforme o n�mero do Canal: ");
					c1.setNumdc(entrada.nextInt());

					a1.setCanais(c1);

					System.out.println("\nDeseja cadastrar mais canais? \n1 - Sim \n2 - N�o");
					cod = entrada.nextInt();

				} while (cod == 1);

				for (i = 0; i < a1.getCanais().size(); i++) {
					System.out.println("\nIndice: " + i + " - " + a1.getNomdc() + " - N�mero: " + a1.getNumdc());
				}

				System.out.println("\n-- Remover canais --");
				System.out.println("\nDeseja remover algum canal? \n1 - Sim\n2 - N�o");
				cod = entrada.nextInt();

				do {
					if (cod == 1) {
						System.out.println("\nInforme o indice do canal a ser removido. ");
						a1.getCanais().remove(entrada.nextInt());

						System.out.println("\nDeseja remover mais canais? \n1 - Sim\n2 - N�o");
						cod = entrada.nextInt();
					}
				} while (cod != 2);

				System.out.println("\n-- Lista de canais --");

				for (i = 0; i < a1.getCanais().size(); i++) {
					System.out.println("\nIndice: " + i + " - " + a1.getNomdc() + " - N�mero: " + a1.getNumdc());
				}

				System.out.println("\nCanal sintonizado:\n " + a1.getNumdc());

				do {
					System.out.println("\nDeseja mudar de canal?\n1 - Sim\n2 - N�o");
					cod = entrada.nextInt();

					if (cod == 1) {
						System.out.println("\nPassar canal - 1 \nVoltar canal - 2");
						cod = entrada.nextInt();

						if (cod == 1) {
							auxi = auxi++;
						}
						if (auxi > a1.getCanais().size()) {
							auxi = 0;
						}
					}
					System.out.println("\nDeseja mudar de canal novamente?\n1 - Sim\n2 - N�o");
					cod = entrada.nextInt();

				} while (cod != 2);

				System.out.println("\nEstado da TV: " + a1.isEstado() + "\nCanal Sintonizado: " + a1.getNumdc()
						+ "\nVolume: " + a1.getVolume());

				System.out.println("\n-- Configura��es de Som --");
				a1.getVolume();

				do {

					System.out.println("\nInforme o volume: ");
					a1.setVolume(entrada.nextInt());

					if (a1.getVolume() > 80 || a1.getVolume() < 0) {
						System.out.println("O Volume deve ser no m�ximo 80 e no m�nimo 0");
					}

				} while (a1.getVolume() > 80 || a1.getVolume() < 0);

				System.out.println("Deseja aumentar ou diminuir o volume?" + "\n1 - sim\n2 - n�o");

				cod = entrada.nextInt();

				if (cod == 1) {
					do {
						System.out.println("\n1 - Aumentar volume\n2 - Diminuir volume");
						cod = entrada.nextInt();

						if (cod == 1 && a1.getVolume() < 80) {
							a1.aumentarVolume();
							System.out.println(a1.getVolume());

							System.out.println("Deseja aumentar ou diminuir o volume?" + "\n1 - sim\n2 - n�o");

							cod = entrada.nextInt();
						} else if (cod == 2 && a1.getVolume() > 0) {
							a1.diminuirVolume();
							System.out.println(a1.getVolume());

							System.out.println("Deseja aumentar ou diminuir o volume?" + "\n1 - sim\n2 - n�o");

							cod = entrada.nextInt();
						} else {
							System.out.println("\nC�digo inv�lido\n1 - aumentar\n2 - diminuir");
						}
					} while (cod != 2);
				}

				System.out.println(a1.imprimir());

				for (i = 0; i < a1.getCanais().size(); i++) {
					System.out.println("\nIndice: " + i + " - " + a1.getNomdc() + " - N�mero: " + a1.getNumdc());
				}
				System.out.println("\nDeseja cadastrar outro televisor?" + "\n(0 para fechar o programa).");

				cod = entrada.nextInt();

			} while (cod != 2);
		} else {
			System.out.println("Beleza kk, beba �gua.");
		}
	}
}