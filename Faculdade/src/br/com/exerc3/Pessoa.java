package br.com.exerc3;

public class Pessoa {

	private String nome;
	private int idade;
	private Endereco endereco;

	public Pessoa(String nom, int ida, String log, String cid, String est) {
		this.nome = nom;
		this.idade = ida;
		this.endereco = new Endereco(log, cid, est);
	}

	public Pessoa(String nom, int ida) {
		this.nome = nom;
		this.idade = ida;
	}

	public Pessoa() {
		endereco = new Endereco();
	}

	public Endereco consultaEndereco() {
		return endereco;
	}

	public String consultaNome() {
		return nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String toString() {
		return "\nNome: " + this.nome + "\nIdade: " + this.idade + "\nEndereco: " + this.endereco;
	}
}
