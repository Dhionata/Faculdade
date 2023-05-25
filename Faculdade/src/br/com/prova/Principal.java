package br.com.prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);

		int formas;
		int tf;
		int para = 0;

		ArrayList<Formas> formados = new ArrayList<Formas>();

		System.out.println("Quantas formas deseja criar: ");
		formas = entrada.nextInt();

		do {
			System.out.println("Qual o tipo da forma?\n 1 = Quadrado" + "\n 2 = Retângulo \n 3 = Círculo");
			tf = entrada.nextInt();

			if (tf == 1) {
				System.out.println("Informe o tamanho do Lado: ");
				Quadrado q1 = new Quadrado(entrada.nextInt());
				formados.add(q1);
				para++;
			} else if (tf == 2) {
				Retangulo r1 = new Retangulo();
				System.out.println("Informe o tamanho do Lado(base): ");
				r1.setLado(entrada.nextInt());
				System.out.println("Informe o tamanho da Altura: ");
				r1.setAltura(entrada.nextInt());
				formados.add(r1);
				para++;
			} else if (tf == 3) {
				System.out.println("Informe o tamanho do Raio: ");
				Circulo c1 = new Circulo(entrada.nextInt());
				formados.add(c1);
				para++;
			} else {
				System.out.println("Código inválido");
			}
		} while (para < formas);
		System.out.println(formados);
	}
}