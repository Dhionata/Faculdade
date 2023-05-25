package br.com.exerc4;

public class Dado {

	private int nLados;

	public Dado(int nLados) {
		this.nLados = nLados;
	}

	public Dado() {
		this.nLados = 6;
	}

	public int getnLados() {

		return nLados;
	}

	public void setnLados(int nLados) {
		this.nLados = nLados;
	}

	public String toString() {

		return "O dado possui = " + nLados + " lados.";
	}
}