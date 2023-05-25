package br.com.Exercício3;

import java.util.Scanner;

public class FuncionarioTeste {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		double salario;

		salario = entrada.nextDouble();

		Funcionario ouxi = new Funcionario();

		System.out.printf("Salário: $%.2f", ouxi.calculaSalário(salario));

	}
}