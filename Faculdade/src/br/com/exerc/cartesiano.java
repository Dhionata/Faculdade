package br.com.exerc;

import java.util.Scanner;

public class cartesiano {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		double x, y;

		x = entrada.nextDouble();
		y = entrada.nextDouble();

		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x == 0) {
			System.out.println("Eixo X");
		} else if (y == 0) {
			System.out.println("Eixo Y");
		} else if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
	}
}