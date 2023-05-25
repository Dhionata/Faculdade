package br.com.exerci2;

public class Diretor {

	private String nome;
	private boolean ganhador_oscar;
	private Filme principal_filme;

	public Diretor() {

	}

	public Diretor(String no, boolean gos) {
		this.nome = no;
		this.ganhador_oscar = gos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isGanhador_oscar() {
		return ganhador_oscar;
	}

	public void setGanhador_oscar(boolean ganhador_oscar) {
		this.ganhador_oscar = ganhador_oscar;
	}

	public Filme getPrincipal_filme() {
		return principal_filme;
	}

	public void setPrincipal_filme(Filme principal_filme) {
		this.principal_filme = principal_filme;
	}

	public String toString() {
		return "Dados do Diretor: \n" + "Nome: " + nome + "\n" + "Ganhador_oscar: " + ganhador_oscar
				+ "\nPrincipal_filme: " + principal_filme.getTitulo() + "\n";
	}
}