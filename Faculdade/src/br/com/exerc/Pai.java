package br.com.exerc;

import java.util.Scanner;

public class Pai {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);
		System.out.println("Digite a quilometragem: ");
		float km = entrada.nextInt();

		System.out.println("Digite a quantidade de litros: ");
		float l = entrada.nextInt();

		float kml = km / l;

		System.out.println("O seu carro fez em " + km + " Com: " + l + " km/l: " + kml);

	}

}
