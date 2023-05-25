package br.com.exerc1;

public class Aluno {

	private int nmatriculas;
	private double notaBimestre1, notaBimestre2;
	private String nome;

	public Aluno() {
	}

	public Aluno(int nmatri, String nom, int notab1, int notab2) {
		this.nmatriculas = nmatri;
		this.nome = nom;
		this.notaBimestre1 = notab1;
		this.notaBimestre2 = notab2;
	}

	public int getNmatriculas() {
		return nmatriculas;
	}

	public void setNmatriculas(int nmatriculas) {
		this.nmatriculas = nmatriculas;
	}

	public double getNotaBimestre1() {
		return notaBimestre1;
	}

	public void setNotaBimestre1(int notaBimestre1) {
		this.notaBimestre1 = notaBimestre1;
	}

	public double getNotaBimestre2() {
		return notaBimestre2;
	}

	public void setNotaBimestre2(int notaBimestre2) {
		this.notaBimestre2 = notaBimestre2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "\nN� da matricula: " + this.getNmatriculas() + "\nNome: " + this.getNome() + "\nNota Bimestre 1: "
				+ this.getNotaBimestre1() + "\nNota Bimestre 2: " + this.getNotaBimestre2() + "\nM�dia: "
				+ (this.getNotaBimestre1() + this.getNotaBimestre2()) / 2;
	}
}