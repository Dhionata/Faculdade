package br.com.exerci2;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroFilme {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Ator> atores = new ArrayList<Ator>();
		ArrayList<Ator> atrizes = new ArrayList<Ator>();
		ArrayList<Diretor> diretores = new ArrayList<Diretor>();
		ArrayList<Filme> filmes = new ArrayList<Filme>();

		String opc = "";

		do {
			System.out.println("Cadastro de Atores/Atrizes:");
			System.out.println("Digite 1 para ator e 2 para atriz: ");
			int decisao = entrada.nextInt();

			entrada.nextLine();

			Ator ator = new Ator();
			System.out.println("Informe o nome: ");
			ator.setNome(entrada.nextLine());
			System.out.println("Informe a idade: ");
			ator.setIdade(entrada.nextInt());
			System.out.println("Informe o numero de Oscars: ");
			ator.setN_oscars(entrada.nextInt());

			if (decisao == 1) {
				atores.add(ator);
			} else {
				atrizes.add(ator);
			}
			entrada.nextLine();
			System.out.println("Deseja cadastrar mais atores? ");

			opc = entrada.nextLine();

		} while (opc.equalsIgnoreCase("sim"));

		System.out.println("\n\nLista de Atores cadastrados");
		System.out.println(atores);
		System.out.println("\n\nLista de Atrizes cadastradas");
		System.out.println(atrizes);

		do {
			System.out.println("Cadastro de Diretores:");
			Diretor diretor = new Diretor();
			System.out.println("Informe o nome: ");
			diretor.setNome(entrada.nextLine());
			System.out.println("J� venceu algum Oscar? (true ou false): ");
			diretor.setGanhador_oscar(entrada.nextBoolean());

			diretores.add(diretor);
			entrada.nextLine();
			System.out.println("Deseja cadastrar mais Diretores? ");
			opc = entrada.nextLine();

		} while (opc.equalsIgnoreCase("sim"));

		do {
			System.out.println("Cadastro de Filmes:");
			Filme filme = new Filme();
			System.out.println("Informe o titulo do Filme: ");
			do {
				filme.setTitulo(entrada.nextLine());
			} while (filme.insereFilme(filmes, filme.getTitulo()));

			System.out.println("\n\nLista de Diretores cadastrados");
			for (int i = 0; i < diretores.size(); i++) {
				System.out.println("Indice: " + i + " - " + diretores.get(i).getNome());
			}

			System.out.println("Informe o indice do diretor do Filme " + filme.getTitulo() + " : ");
			int indice = entrada.nextInt();

			filme.setDiretor(diretores.get(indice));

			System.out.println("\n\nLista de Atores cadastrados");
			for (int i = 0; i < atores.size(); i++) {
				System.out.println("Indice: " + i + " - " + atores.get(i).getNome());
			}

			System.out
					.println("Informe o indice que representa o ATOR principal do Filme " + filme.getTitulo() + " : ");
			indice = entrada.nextInt();

			filme.setAtor_principal(atores.get(indice));

			System.out.println("\n\nLista de Atrizes cadastradas");
			for (int i = 0; i < atrizes.size(); i++) {
				System.out.println("Indice: " + i + " - " + atrizes.get(i).getNome());
			}

			System.out
					.println("Informe o indice que representa a ATRIZ principal do Filme " + filme.getTitulo() + " : ");
			indice = entrada.nextInt();

			filme.setAtriz_principal(atrizes.get(indice));

			filmes.add(filme);

			entrada.nextLine();
			System.out.println("\n\nDeseja cadastrar mais Filmes? ");
			opc = entrada.nextLine();

		} while (opc.equalsIgnoreCase("sim"));

		System.out.println("\n\n\nLista de Filmes cadastrados: ");
		System.out.println(filmes);

		for (Diretor d : diretores) {
			System.out.println("\n\nLista de Filmes cadastrados");
			for (int i = 0; i < filmes.size(); i++) {
				System.out.println("Indice: " + i + " - " + filmes.get(i).getTitulo());
			}
			System.out.println("Informe o indice do Principal filme do Diretor " + d.getNome() + " : ");
			int indice = entrada.nextInt();

			d.setPrincipal_filme(filmes.get(indice));
		}
		System.out.println("\n\n\nDados dos Diretores cadastrados: ");
		System.out.println(diretores);
	}
}