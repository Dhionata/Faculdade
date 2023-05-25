package br.com.periodo3.Ex6;

public abstract class calculadora {

	public double x;
	public double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public abstract double soma();

	public abstract double subtracao();

	public abstract double divisao();

	public abstract double multiplicacao();
}