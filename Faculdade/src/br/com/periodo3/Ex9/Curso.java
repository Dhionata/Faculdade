package br.com.periodo3.Ex9;

import java.util.ArrayList;

public class Curso {

	private int Código, cargaHoraria, sala;
	private String nome, nomeProfessor;
	private double valorCurso;

	private ArrayList<Aluno> alunos;

	public Curso(int cod, int ch, int sala, String n, String np, double v, ArrayList<Aluno> alunos) {
		this.setCódigo(cod);
		this.setCargaHoraria(ch);
		this.setSala(sala);
		this.setNome(n);
		this.setNomeProfessor(np);
		this.setValorCurso(v);
		this.setAlunos(alunos);
	}

	public Curso() {

	}

	public int getCódigo() {
		return Código;
	}

	public void setCódigo(int Código) {
		this.Código = Código;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public double getValorCurso() {
		return valorCurso;
	}

	public void setValorCurso(double valorCurso) {
		this.valorCurso = valorCurso;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	@Override
	public String toString() {
		return "-- Curso --" + "\nCódigo: " + getCódigo() + "\nCarga Horaria: " + getCargaHoraria() + "\nSala: "
				+ getSala() + "\nNome: " + getNome() + "\nNome do Professor: " + getNomeProfessor()
				+ "\nValor do Curso: " + getValorCurso() + "\nAlunos: " + getAlunos() + "\n";
	}
}