package br.com.exerc;

import java.util.Scanner;

public class jeff {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int b, h, at;

		b = entrada.nextInt();
		h = entrada.nextInt();

		at = b * h;
		at = at * 3;

		System.out.println("�rea total: " + at);
	}
}