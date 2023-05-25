package br.com.periodo3.Ex8;

public class Porta {

	private String cor;
	private int dimensaoX, dimensaoY, dimensaoZ;
	private boolean aberta;

	public Porta() {

	}

	public void abre() {
		setAberta(true);
	}

	public void fecha() {
		setAberta(false);
	}

	public void pinta(String s) {
		setCor(s);
	}

	public boolean estaAberta() {
		return isAberta();
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(int dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public int getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(int dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public int getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(int dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}

	public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	@Override
	public String toString() {
		return "\n-- Porta --" + "\nEsta Aberta: " + estaAberta() + "\nCor: " + getCor() + "\nDimensaoX: "
				+ getDimensaoX() + "\nDimensaoY: " + getDimensaoY() + "\nDimensaoZ: " + getDimensaoZ();
	}
}