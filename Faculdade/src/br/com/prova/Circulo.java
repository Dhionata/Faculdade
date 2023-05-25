package br.com.prova;

public class Circulo implements Formas {

	private double tamanhoperimetro;
	private double tamanhodaArea;
	private int raio;

	public Circulo() {
	}

	public Circulo(int r) {
		this.setRaio(r);
	}

	@Override
	public double calcularPerimetro() {
		this.setTamanhoperimetro(2 * Math.PI * this.getRaio());
		return this.getTamanhoperimetro();
	}

	@Override
	public double calcularArea() {
		this.setTamanhodaArea(Math.PI * Math.pow(this.getRaio(), 2));
		return this.getTamanhodaArea();
	}

	public double getTamanhoperimetro() {
		return this.tamanhoperimetro;
	}

	public void setTamanhoperimetro(double tamanhoperimetro) {
		this.tamanhoperimetro = tamanhoperimetro;
	}

	public double getTamanhodaArea() {
		return this.tamanhodaArea;
	}

	public void setTamanhodaArea(double tamanhodaArea) {
		this.tamanhodaArea = tamanhodaArea;
	}

	public int getRaio() {
		return this.raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "-- Circulo --" + "\nPerimetro: " + calcularPerimetro() + "\nArea: " + calcularArea() + "\nRaio: "
				+ getRaio() + "\n";
	}
}