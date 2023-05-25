package br.com.prova;

public class Quadrado implements Formas {

	private int tamanhoperimetro;
	private int tamanhodaArea;
	private int lado;

	public Quadrado() {
	}

	public Quadrado(int lado) {
		this.setLado(lado);
	}

	@Override
	public double calcularPerimetro() {
		this.setTamanhoperimetro(this.getLado() * 4);
		return this.getTamanhoperimetro();
	}

	@Override
	public double calcularArea() {
		this.setTamanhodaArea(this.getLado() * this.getLado());
		return this.getTamanhodaArea();
	}

	public int getTamanhoperimetro() {
		return this.tamanhoperimetro;
	}

	public void setTamanhoperimetro(int tamaperimetro) {
		this.tamanhoperimetro = tamaperimetro;
	}

	public int getTamanhodaArea() {
		return this.tamanhodaArea;
	}

	public void setTamanhodaArea(int taArea) {
		this.tamanhodaArea = taArea;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "-- Quadrado --" + "\nPerimetro: " + this.calcularPerimetro() + "\nArea: " + this.calcularArea()
				+ "\nLado: " + this.getLado() + "\n";
	}
}