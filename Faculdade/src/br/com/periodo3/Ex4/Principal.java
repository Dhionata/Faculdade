package br.com.periodo3.Ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Aluno> alunos = new ArrayList<Aluno>();

		int cod;

		do {

			Aluno a1 = new Aluno();
			entrada.nextLine();

			System.out.println("Informe o nome do aluno: ");
			a1.setNome(entrada.nextLine());

			System.out.println("Informe o nº da matrícula: ");
			a1.setnúmeroDeMatrículas(entrada.nextInt());

			System.out.println("informe a N1: ");
			a1.setNotaBimestre1(entrada.nextInt());

			System.out.println("Informe a N2: ");
			a1.setNotaBimestre2(entrada.nextInt());

			alunos.add(a1);

			System.out.println("Deseja cadastrar mais alunos? \n1 - sim\n2 -não");

			cod = entrada.nextInt();

		} while (cod == 1);

		System.out.println("\n-- Menu --" + "\n0 - Encerrar programa"
				+ "\n1 - Impressão da lista de Alunos Cadastrados. " + "\n2 - Impressão da lista de Alunos Aprovados. "
				+ "\n3 - Busca de Aluno pelo nome ou matrícula. "
				+ "\n4 - Imprimir a lista de Alunos Cadastrados ordenados pela m�dia final.");
		cod = entrada.nextInt();

		if (cod == 0) {
			System.out.println("Tenha um bom dia =D");
		} else if (cod == 1) {
			System.out.println(alunos);
		} else if (cod == 2) {
			for (Aluno aluno : alunos) {
				if (aluno.gerarMédia() > 6) {
					System.out.println(aluno);
				}
			}
		} else if (cod == 3) {
			System.out.println("\n1 - nome\n2 - matrícula");
			cod = entrada.nextInt();
			do {
				if (cod == 1) {
					System.out.println("-- Alunos --");
					System.out.println("\ninforme o nome do aluno: ");

					String x;

					x = entrada.nextLine();

					for (Aluno aluno : alunos) {
						if (aluno.getNome() == x) {
							System.out.println(aluno);
						}
					}
				} else if (cod == 2) {
					System.out.println("-- Alunos --");
					System.out.println("\ninforme a matrícula do aluno: ");

					int x;

					x = entrada.nextInt();

					for (Aluno aluno : alunos) {
						if (aluno.getnúmeroDeMatrículas() == x) {
							System.out.println(aluno);
						}
					}
				}
				System.out.println("Deseja continuar a procura por nome ou metrícula? \n1 - Sim\n2 -não");
			} while (cod != 2);
		} else if (cod == 4) {
			System.out.println("Vou ficar devendo prof.");
		}
	}
}