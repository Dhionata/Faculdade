package br.com.periodo3.Ex9;

public class Notas {

	private double n1, n2, n3;

	public Notas(double n1, double n2, double n3) {
		this.setN1(n1);
		this.setN2(n2);
		this.setN3(n3);
	}

	public double getMedia() {
		return (this.getN1() + this.getN2() + this.getN3()) / 3;
	}

	public Notas() {
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	@Override
	public String toString() {
		return "-- Notas --" + "\nN1: " + getN1() + "\nN2: " + getN2() + "\nN3: " + getN3() + "\nM�dia: " + getMedia()
				+ "\n";
	}
}