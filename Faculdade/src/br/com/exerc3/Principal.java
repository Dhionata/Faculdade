package br.com.exerc3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int temp, temp2;

		ArrayList<Produto> produtos = new ArrayList<Produto>();

		Produto produto1 = new Produto("Ma�ã");
		produtos.add(produto1);
		produto1.setCodigo(produtos.size());

		Produto produto2 = new Produto("Uva Passa");
		produtos.add(produto2);
		produto2.setCodigo(produtos.size());

		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

		do {
			Pessoa pessoa1 = new Pessoa();
			System.out.println("Informe o nome do comprador: ");
			pessoa1.setNome(entrada.nextLine());

			System.out.println("Informe a idade do comprador: ");
			pessoa1.setIdade(entrada.nextInt());

			System.out.println("--Endere�o do comprador--");
			System.out.println("Logradouro: ");
			entrada.next();
			pessoa1.getEndereco().setLogradouro(entrada.nextLine());

			System.out.println("Cidade: ");
			pessoa1.getEndereco().setCidade(entrada.nextLine());

			System.out.println("Estado: ");
			pessoa1.getEndereco().setEstado(entrada.nextLine());

			pessoas.add(pessoa1);

			Compra compra1 = new Compra();
			Compra compra2 = new Compra();

			compra1.comprar(pessoa1, produto1);
			compra2.comprar(pessoa1, produto2);

			do {
				System.out.println("--Escolha o c�digo do produto--" + "\n" + produtos + "\n" + "C�digo: ");

				temp = entrada.nextInt();

				if (temp == 1) {
					System.out.println(compra1.getPessoa().getNome() + " comprou" + produto1);
				} else if (temp == 2) {
					System.out.println(compra2.getPessoa().getNome() + " comprou" + produto2);
				} else {
					System.out.println("\nC�digo errado, tente novamente");
				}
			} while (temp != 1 && temp != 2);

			System.out.println("\nDigite '1' para encerrar, caso queira continuar informe qualquer valor");
			temp2 = entrada.nextInt();
			if (temp2 != 1) {
				System.out.println("\nBuffer cheio, aperte enter");
				entrada.next();
			}
		} while (temp2 != 1);
	}
}