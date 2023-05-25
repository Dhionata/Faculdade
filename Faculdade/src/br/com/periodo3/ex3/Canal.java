package br.com.periodo3.ex3;

public class Canal {

	private int numdc;
	private String nomdc;

	public Canal() {
	}

	public Canal(String n) {
		setNomdc(n);
	}

	public Canal(int num) {
		setNumdc(num);
	}

	public Canal(String n, int num) {
		setNomdc(n);
		setNumdc(num);
	}

	public int getNumdc() {
		return numdc;
	}

	public void setNumdc(int numdc) {
		this.numdc = numdc;
	}

	public String getNomdc() {
		return nomdc;
	}

	public void setNomdc(String nomdc) {
		this.nomdc = nomdc;
	}

	@Override
	public String toString() {
		return "\n-- Canal --" + "\nNome do canal: " + getNomdc() + "\nN�mero do canal: " + getNumdc();
	}
}