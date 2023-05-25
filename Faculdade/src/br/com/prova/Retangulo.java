package br.com.prova;

public class Retangulo implements Formas {

	private int tamanhoperimetro;
	private int tamanhodaArea;
	private int lado;
	private int altura;

	public Retangulo() {
	}

	public Retangulo(int l, int h) {
		this.setLado(l);
		this.setAltura(h);
	}

	public double calcularPerimetro() {
		this.setTamanhoperimetro((2 * this.getLado()) + (2 * this.getAltura()));
		return this.getTamanhoperimetro();
	}

	public double calcularArea() {
		this.setTamanhodaArea((this.getLado() * this.getAltura()) / 2);
		return this.getTamanhodaArea();
	}

	public int getTamanhoperimetro() {
		return tamanhoperimetro;
	}

	public void setTamanhoperimetro(int tperimetro) {
		this.tamanhoperimetro = tperimetro;
	}

	public int getTamanhodaArea() {
		return tamanhodaArea;
	}

	public void setTamanhodaArea(int tadaArea) {
		this.tamanhodaArea = tadaArea;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "-- Retangulo --" + "\nPerimetro: " + calcularPerimetro() + "\nArea: " + calcularArea() + "\nLado: "
				+ getLado() + "\nAltura: " + getAltura() + "\n";
	}
}