package br.com.periodo3.ex3;

import java.util.ArrayList;

public class Televisor extends Canal {

	private Canal canal;
	private int volume = 15;
	private boolean estado;
	private ArrayList<Canal> canais = new ArrayList<Canal>();

	public Televisor() {
	}

	public Televisor(String n) {
		super();
	}

	public Televisor(int num) {
		super();
	}

	public Televisor(String n, int num) {
		super();
	}

	public Televisor(String n, int num, int v) {
		super();
		setVolume(v);
	}

	public Televisor(String n, int num, boolean es) {
		super();
		setEstado(es);
	}

	public Televisor(String n, int num, int v, boolean es) {
		super();
		setVolume(v);
		setEstado(es);
	}

	public Canal getCanal() {
		return canal;
	}

	public void setCanal(Canal nome) {
		this.canal = nome;
	}

	public int getVolume() {
		return volume;
	}

	public void aumentarVolume() {
		this.volume++;
	}

	public void diminuirVolume() {
		this.volume--;
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

	public void setCanais(Canal c) {
		canais.add(c);
	}

	public ArrayList<Canal> getCanais() {
		return canais;
	}

	public void setCanais(ArrayList<Canal> canais) {
		this.canais = canais;
	}

	public String imprimir() {
		return "\n-- Televisor -- " + "\nEstado = " + isEstado() + "\nVolume = " + getVolume();
	}
}