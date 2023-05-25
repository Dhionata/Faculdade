package br.com.Exercício4;

public class PrincipalQuadrado {

	public static void main(String[] args) {

		Quadrado q1 = new Quadrado(2);
		Quadrado q2 = new Quadrado(4);
		Quadrado q3 = new Quadrado(5);
		System.out.println("------Q1------\n" + "Area: " + q1.area() + "\nPerimetro: " + q1.perimetro());
		System.out.println("------Q2------\n" + "Area: " + q2.area() + "\nPerimetro: " + q2.perimetro());
		System.out.println("------Q3------\n" + "Area: " + q3.area() + "\nPerimetro: " + q3.perimetro());

	}
}