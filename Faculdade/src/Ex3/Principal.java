package Ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Forma> formas = new ArrayList<Forma>();

		// instâncias

		Retângulo r1 = new Retângulo();
		Círculo c1 = new Círculo();
		Quadrado q1 = new Quadrado();

		Retângulo r2 = new Retângulo();
		Círculo c2 = new Círculo();
		Quadrado q2 = new Quadrado();

		// entradas

		System.out.println("Informe a base do Retângulo 1: ");
		r1.setLado(entrada.nextFloat());

		System.out.println("Informe a altura do Retângulo 1: ");
		r1.setAltura(entrada.nextFloat());

		System.out.println("Informe o valor do Raio do Círculo 1: ");
		c1.setRaio(entrada.nextFloat());

		System.out.println("Informe o valor do Lado do Quadrado 1:");
		q1.setLado(entrada.nextFloat());

		// entradas #2

		System.out.println("Informe o lado do Retângulo 2: ");
		r2.setLado(entrada.nextFloat());

		System.out.println("Informe a altura do Retângulo 2: ");
		r2.setAltura(entrada.nextFloat());

		System.out.println("Informe o valor do Raio do Círculo 2: ");
		c2.setRaio(entrada.nextFloat());

		System.out.println("Informe o valor do Lado do Quadrado 2:");
		q2.setLado(entrada.nextFloat());

		// array(add)

		formas.add(r1);
		formas.add(c1);
		formas.add(q1);
		formas.add(r2);
		formas.add(c2);
		formas.add(q2);

		System.out.println("\n" + formas);
	}
}