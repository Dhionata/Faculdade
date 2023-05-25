package Ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoologico {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Animal> zoologico = new ArrayList<Animal>();
		int cód, cód2, cod3;

		Veterinario v1 = new Veterinario("Dhionat�", 25);
		Cavalo c1 = new Cavalo("Horseman", 18);
		Preguiça p1 = new Preguiça("Ronaldo", 19);
		Cachorro dog1 = new Cachorro("Bola-de-neve", 5);
		Cavalo c2 = new Cavalo("Spirit", 20);
		Preguiça p2 = new Preguiça("K�k�", 35);
		Cachorro dog2 = new Cachorro("Snoff", 2);
		Cavalo c3 = new Cavalo("Cor-de-rosa", 23);
		Preguiça p3 = new Preguiça("Allan", 40);
		Cachorro dog3 = new Cachorro("Luna", 10);
		Cachorro dog4 = new Cachorro("Dalmata", 7);

		System.out.println("-- Ger�ncia do Zoo --");
		System.out.println("Deseja que algum animal vá para o veterinário? \n1 - Sim\n2 - N�o");
		System.out.println("NOTA: \n-- Todos os animais est�o doentes! --");
		cód = entrada.nextInt();

		while (cód == 1) {
			do {
				System.out.println("Qual tipo de animal deve passar pelo veterinário: " + "\n1 - Cavalo"
						+ "\n2 - Cachorro" + "\n3 - Preguiça");
				cód2 = entrada.nextInt();

				if (cód2 == 1) {
					do {
						System.out.println("Qual cavalo deseja mandar para o veterinário?" + "\n1 - " + c1.getNome()
								+ "\n2 - " + c2.getNome() + "\n3 - " + c3.getNome());
						cod3 = entrada.nextInt();

						if (cod3 == 1) {
							v1.Examinar(c1);
							c1.setCorrer(true);
							c1.setDeveEmitirSom(true);
						} else if (cod3 == 2) {
							v1.Examinar(c2);
							c2.setCorrer(true);
							c2.setDeveEmitirSom(true);
						} else if (cod3 == 3) {
							v1.Examinar(c3);
							c3.setCorrer(true);
							c3.setDeveEmitirSom(true);
						} else {
							System.out.println("código errado!");
						}
					} while (cod3 != 1 && cod3 != 2 && cod3 != 3);
				}

				else if (cód2 == 2) {
					do {
						System.out.println("Qual cachorro deseja mandar para o veterinário?" + "\n1 - " + dog1.getNome()
								+ "\n2 - " + dog2.getNome() + "\n3 - " + dog3.getNome() + "\n4 - " + dog4.getNome());
						cod3 = entrada.nextInt();

						if (cod3 == 1) {
							v1.Examinar(dog1);
							dog1.setCorrer(true);
							dog1.setDeveEmitirSom(true);
						} else if (cod3 == 2) {
							v1.Examinar(dog2);
							dog2.setCorrer(true);
							dog2.setDeveEmitirSom(true);
						} else if (cod3 == 3) {
							v1.Examinar(dog3);
							dog3.setCorrer(true);
							dog3.setDeveEmitirSom(true);
						} else if (cod3 == 4) {
							v1.Examinar(dog4);
							dog4.setCorrer(true);
							dog4.setDeveEmitirSom(true);
						} else {
							System.out.println("código errado!");
						}
					} while (cod3 != 1 && cod3 != 2 && cod3 != 3);
				}

				else if (cód2 == 3) {
					do {
						System.out.println("Qual Preguiça deseja mandar para o veterinário?" + "\n1 - " + p1.getNome()
								+ "\n2 - " + p2.getNome() + "\n3 - " + p3.getNome());
						cod3 = entrada.nextInt();

						if (cod3 == 1) {
							v1.Examinar(p1);
							p1.setDeveEmitirSom(true);
							p1.setSubirEmArvores(true);
						} else if (cod3 == 2) {
							v1.Examinar(p2);
							p2.setDeveEmitirSom(true);
							p2.setSubirEmArvores(true);
						} else if (cod3 == 3) {
							v1.Examinar(p3);
							p3.setDeveEmitirSom(true);
							p3.setSubirEmArvores(true);
						} else {
							System.out.println("código errado!");
						}

					} while (cod3 != 1 && cod3 != 2 && cod3 != 3);
				}

				else {
					System.out.println("código errado !");
				}
			} while (cód2 != 1 && cód2 != 2 && cód2 != 3);

			System.out.println("Deseja que algum animal vá para o veterinário? \n1 - Sim\n2- N�o");
			cód = entrada.nextInt();
		}

		zoologico.add(c1);
		zoologico.add(c2);
		zoologico.add(c3);
		zoologico.add(p1);
		zoologico.add(p2);
		zoologico.add(p3);
		zoologico.add(dog1);
		zoologico.add(dog2);
		zoologico.add(dog3);
		zoologico.add(dog4);

		System.out.println("-- Jaulas --\n");
		System.out.println(zoologico);
	}
}