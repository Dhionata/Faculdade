package br.com.exerc3;

public class Produto {

	private long codigo;
	private String nome;

	public Produto(long cod, String nom) {
		this.codigo = cod;
		this.nome = nom;
	}

	public Produto(String nom) {
		this.nome = nom;
	}

	public void consultaNome() {

	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "\nC�digo do produto: " + this.codigo + "\nNome do produto: " + this.nome;
	}
}