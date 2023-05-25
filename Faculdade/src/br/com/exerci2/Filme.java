package br.com.exerci2;

import java.util.ArrayList;

public class Filme {

	private String titulo;
	private Diretor diretor;
	private Ator ator_principal;
	private Ator atriz_principal;

	public Filme() {
	}

	public Filme(String tit, Diretor dir, Ator atp, Ator atzp) {
		this.titulo = tit;
		this.diretor = dir;
		this.ator_principal = atp;
		this.atriz_principal = atzp;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	public Ator getAtor_principal() {
		return ator_principal;
	}

	public void setAtor_principal(Ator ator_principal) {
		this.ator_principal = ator_principal;
	}

	public Ator getAtriz_principal() {
		return atriz_principal;
	}

	public void setAtriz_principal(Ator atriz_principal) {
		this.atriz_principal = atriz_principal;
	}

	public String toString() {
		return "Dados do Filme \n" + "Titulo: " + titulo + "\nDiretor: " + diretor.getNome() + "\nAtor Principal: "
				+ ator_principal.getNome() + "\nAtriz_principal: " + atriz_principal.getNome() + " \n";
	}

	public boolean insereFilme(ArrayList<Filme> filmes, String titulo2) {
		return false;
	}
}