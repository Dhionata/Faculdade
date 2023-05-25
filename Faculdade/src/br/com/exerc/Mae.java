package br.com.exerc;

import java.util.Scanner;

public class Mae {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		System.out.println("Voc� compra as ampolas por R$130 e vem 100 unidades.");
		int valorinicial = 130;
		System.out.println("Cada ampola � R$3.");
		int amp = 3;
		System.out.println("quantas apolas eu tenho que vender pra dar lucro? ");
		System.out.println("Digite uma quantidade: ");
		int cod = entrada.nextInt();
		if (amp * cod < valorinicial) {
			System.out.println("N�o compensa.");
			System.out.println("Prejuizo: " + (amp * cod - 130));
		} else
			System.out.println("Compensa.");
		System.out.println("Lucro: " + (amp * cod - 130));

	}

}
