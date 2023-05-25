package br.com.periodo3.ex2;

public class Televisor {

	private int canal;
	private int volume;
	private boolean estado;

	public Televisor() {
	}

	public Televisor(int c, int v) {
		setCanal(c);
		setVolume(v);
	}

	public Televisor(int c, boolean e) {
		setCanal(c);
		setEstado(e);
	}

	public Televisor(int c, int v, boolean e) {
		setCanal(c);
		setVolume(v);
		setEstado(e);
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int nome) {
		this.canal = nome;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void ligado(boolean l) {
		this.setEstado(true);
	}

	public void desligado(boolean d) {
		this.setEstado(false);
	}

	public String imprimir() {
		return "\n-- Televisor -- " + "\nCanal = " + getCanal() + "\nVolume = " + getVolume() + "\nEstado = "
				+ isEstado();
	}
}