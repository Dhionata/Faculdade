package br.com.periodo3.Ex9;

import java.util.ArrayList;

public class CursoEspecializacao extends Curso {

	private boolean latoSensu;
	private double adicionalDiploma;

	public CursoEspecializacao(int cod, int ch, int sala, String n, String nP, double v, ArrayList<Aluno> alunos,
			boolean IS) {
		super(cod, ch, sala, n, nP, v, alunos);
		this.setLatoSensu(IS);
	}

	public CursoEspecializacao() {

	}

	public double getAdicionalDiploma() {
		return adicionalDiploma;
	}

	public void setAdicionalDiploma() {
		if (getAlunos().size() <= 10) {
			this.adicionalDiploma = getAlunos().size() * 25;
		} else if (getAlunos().size() <= 30) {
			this.adicionalDiploma = getAlunos().size() * 20;
		} else {
			this.adicionalDiploma = getAlunos().size() * 18;
		}
	}

	public boolean isLatoSensu() {
		return latoSensu;
	}

	public void setLatoSensu(boolean latoSensu) {
		this.latoSensu = latoSensu;
	}

	@Override
	public String toString() {
		return "\n-- CursoEspecialização --\n" + super.toString() + "\nLatoSensu: " + isLatoSensu()
				+ "\nAdicionalDiploma: " + getAdicionalDiploma() + "\n";
	}
}