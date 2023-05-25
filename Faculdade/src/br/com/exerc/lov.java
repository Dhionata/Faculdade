package br.com.exerc;

import java.util.Scanner;

public class lov {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		String x;

		x = entrada.nextLine();

		if (x == "i love you") {
			System.out.println("i love you too");
		} else if (x != "i love you")
			System.out.println("te respeito");
	}
}