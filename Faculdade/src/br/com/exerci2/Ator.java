package br.com.exerci2;

public class Ator {

	private String nome;
	private int idade, n_oscars;

	public Ator() {
	}

	public Ator(String nom) {
		this.nome = nom;
	}

	public Ator(String nom, int nos) {
		this.nome = nom;
		this.n_oscars = nos;
	}

	public Ator(String nom, int ida, int nos) {
		this.nome = nom;
		this.idade = ida;
		this.n_oscars = nos;
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

	public int getN_oscars() {
		return n_oscars;
	}

	public void setN_oscars(int n_oscars) {
		this.n_oscars = n_oscars;
	}

	public String toString() {
		return "Dados do Ator: \n" + "Nome: " + nome + "\n Idade: " + idade + "\nNumero de Oscars: " + n_oscars + "\n";
	}
}