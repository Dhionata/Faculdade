package br.com.periodo3.Ex8;

import java.util.ArrayList;

public class Edificio extends Porta {

	private String cor;
	private ArrayList<Porta> totalDePortas;
	private int totalDeAndares = 0;
	private ArrayList<Porta> portas = new ArrayList<Porta>();

	public Edificio() {

	}

	@Override
	public void pinta(String s) {
		setCor(s);
	}

	public int quantasPortasEstaoAbertas() {
		return portas.size();
	}

	public void adicionaPorta(Porta p) {
		portas.add(p);
	}

	public int totalDePortas() {
		return getPortas().size();
	}

	public void adicionarAndar() {
		this.totalDeAndares = getTotalDeAndares() + 1;
	}

	public int totalDeAndares() {
		return getTotalDeAndares();
	}

	@Override
	public String getCor() {
		return cor;
	}

	@Override
	public void setCor(String cor) {
		this.cor = cor;
	}

	public ArrayList<Porta> getTotalDePortas() {
		return this.totalDePortas;
	}

	public void setTotalDePortas(ArrayList<Porta> arrayList) {
		this.totalDePortas = arrayList;
	}

	public int getTotalDeAndares() {
		return totalDeAndares;
	}

	public void setTotalDeAndares(int totalDeAndares) {
		this.totalDeAndares = totalDeAndares;
	}

	public ArrayList<Porta> getPortas() {
		return portas;
	}

	public void setPortas(ArrayList<Porta> portas) {
		this.portas = portas;
	}

	@Override
	public String toString() {
		return "\n-- Edificio --" + "\nQuantas Portas Est�o Abertas: " + quantasPortasEstaoAbertas()
				+ "\ntotalDePortas: " + totalDePortas() + "\nTotal De Andares: " + totalDeAndares() + "\nCor: "
				+ getCor();
	}

}
