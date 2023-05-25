package br.com.periodo3.ex5;

import java.util.ArrayList;

public class Pais {

	private String nome;
	private String nome_da_capital;
	private int Km2;
	private String pais_fronteira;
	private ArrayList<Pais> paisesdefronteira = new ArrayList<Pais>();

	public boolean equals(final Pais outro) {
		return true;
	}

	public Pais() {
	}

	public Pais(String n, String nc, int k, Pais pafron) {
		setNome(n);
		setNome_da_capital(nc);
		setKm2(k);
		paisesdefronteira.add(pafron);
	}

	public Pais(String n, String nc, int k) {
		setNome(n);
		setNome_da_capital(nc);
		setKm2(k);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome_da_capital() {
		return nome_da_capital;
	}

	public void setNome_da_capital(String nome_da_capital) {
		this.nome_da_capital = nome_da_capital;
	}

	public int getKm2() {
		return Km2;
	}

	public void setKm2(int km2) {
		Km2 = km2;
	}

	public ArrayList<Pais> getPaisesdefronteira() {
		return paisesdefronteira;
	}

	public void setPaisesdefronteira(Pais e) {
		paisesdefronteira.add(e);
	}

	public String getPais_fronteira() {
		return pais_fronteira;
	}

	public void setPais_fronteira(String string2, String string, int i) {
		this.pais_fronteira = string2;
		this.nome = string;
		this.Km2 = i;
	}

	@Override
	public String toString() {
		return "\n-- Pais --" + "\nNome: " + getNome() + "\nNome da capital: " + getNome_da_capital() + "\nKm�: "
				+ getKm2() + "\nPaises que fazem fronteira: " + getPaisesdefronteira();
	}
}