package br.com.exerc4;

import java.util.Random;

public class Pessoa {

	private String nome;
	private Dado meuDado;
	private Data datadenascimento;
	private Endereco endereço;
	private Dado meuDado6;
	private Dado meuDado8;
	private Dado sexo;

	public Pessoa() {
		this.meuDado6 = new Dado(6);
		this.meuDado8 = new Dado(8);
	}

	public Pessoa(String nome) {
		this.nome = nome;
		this.meuDado6 = new Dado(6);
		this.meuDado8 = new Dado(8);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Dado getmeuDado() {
		return meuDado;
	}

	public void setMeuDado(Dado meuDado) {
		this.meuDado = meuDado;
	}

	public int jogarDadoDe6faces() {
		Random rd = new Random();
		return rd.nextInt(meuDado6.getnLados()) + 1;
	}

	public int jogarDadoDe8faces() {
		Random rd = new Random();
		return rd.nextInt(meuDado8.getnLados()) + 1;
	}

	public Dado getMeuDado6() {
		return meuDado6;
	}

	public void setMeuDado6(Dado meuDado6) {
		this.meuDado6 = meuDado6;
	}

	public Dado getMeuDado8() {
		return meuDado8;
	}

	public void setMeuDado8(Dado meuDado8) {
		this.meuDado8 = meuDado8;
	}

	public Dado getMeuDado() {
		return meuDado;
	}

	public Data getDatadenascimento() {
		return datadenascimento;
	}

	public void setDatadenascimento(Data datadenascimento) {
		this.datadenascimento = datadenascimento;
	}

	public Endereco getEndereço() {
		return endereço;
	}

	public void setEndereço(Endereco endereço) {
		this.endereço = endereço;
	}

	public Dado getSexo() {
		return sexo;
	}

	public void setSexo(Dado sexo) {
		this.sexo = sexo;
	}
}