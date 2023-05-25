package br.com.Exercício4;

public class Quadrado {

	private double lado;

	public Quadrado(double l) {
		this.lado = l;
	}

	public double area() {
		return Math.pow(this.lado, 2);
	}

	public double perimetro() {
		return 4 * this.lado;
	}
}