package br.com.periodo3.ex10;

public class Retângulo implements FormaGeometrica {

	private double x;
	private double y;

	public Retângulo(double x2, double y2) {
		setX(x2);
		setY(y2);
	}

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

	@Override
	public double getArea() {
		return (getX() * getY());
	}

	@Override
	public double getPerimetro() {
		return (getX() * 2) + (getY() * 2);
	}

	@Override
	public String exibirDados() {
		return "\n-- RetÃ¢ngulo --" + "\nÃ�rea: " + getArea() + "\nPerÃ­metro: " + getPerimetro();
	}
}