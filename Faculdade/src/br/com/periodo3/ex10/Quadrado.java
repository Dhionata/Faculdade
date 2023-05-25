package br.com.periodo3.ex10;

public class Quadrado implements FormaGeometrica {

	private double x;

	public Quadrado(double x2) {
		setX(x2);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	@Override
	public double getArea() {
		return (getX() * getX());
	}

	@Override
	public double getPerimetro() {
		return (getX() * 4);
	}

	@Override
	public String exibirDados() {
		return "\n-- Quadrado --" + "\n�rea: " + getArea() + "\nPer�metro: " + getPerimetro();
	}
}