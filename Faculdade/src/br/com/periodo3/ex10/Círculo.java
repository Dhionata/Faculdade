package br.com.periodo3.ex10;

public class Círculo implements FormaGeometrica {

	private double x;

	public Círculo(double x2) {
		setX(x2);
	}

	@Override
	public double getArea() {
		return (Math.PI * (Math.pow(getX(), 2)));
	}

	@Override
	public double getPerimetro() {
		return (2 * Math.PI * getX());
	}

	@Override
	public String exibirDados() {
		return "\n-- CÃ­rculo --" + "\nÃ�rea: " + getArea() + "\nPerÃ­metro: " + getPerimetro();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
}