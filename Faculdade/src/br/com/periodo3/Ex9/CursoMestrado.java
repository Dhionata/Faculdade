package br.com.periodo3.Ex9;

import java.util.ArrayList;

public class CursoMestrado extends Curso {

	private boolean strictoSensu;
	private double adicionalDiploma;

	public CursoMestrado(int cod, int ch, int sala, String n, String nP, double v, ArrayList<Aluno> alunos,
			boolean IS) {
		super(cod, ch, sala, n, nP, v, alunos);
		this.setStrictoSensu(IS);
	}

	public CursoMestrado() {

	}

	public boolean isStrictoSensu() {
		return strictoSensu;
	}

	public void setStrictoSensu(boolean strictoSensu) {
		this.strictoSensu = strictoSensu;
	}

	public double getAdicionalDiploma() {
		return adicionalDiploma;
	}

	public void setAdicionalDiploma() {
		if (getAlunos().size() <= 5) {
			this.adicionalDiploma = getAlunos().size() * 45;
		} else if (getAlunos().size() <= 15) {
			this.adicionalDiploma = getAlunos().size() * 43;
		} else if (getAlunos().size() <= 30) {
			this.adicionalDiploma = getAlunos().size() * 40;
		} else {
			this.adicionalDiploma = getAlunos().size() * 36;
		}
	}

	@Override
	public String toString() {
		return "\n-- CursoMestrado --\n" + super.toString() + "\nStrictoSensu: " + isStrictoSensu()
				+ "\nAdicionalDiploma: " + getAdicionalDiploma() + "\n";
	}
}