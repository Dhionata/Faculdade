package br.com.periodo3.ex10;

public class Principal {

	public static void main(String[] args) {

		double x = 3;
		double y = 6;

		Círculo c1 = new Círculo(x);
		Quadrado q1 = new Quadrado(x);
		Retângulo r1 = new Retângulo(x, y);

		System.out.println(c1.exibirDados());
		System.out.println(q1.exibirDados());
		System.out.println(r1.exibirDados());
	}
}