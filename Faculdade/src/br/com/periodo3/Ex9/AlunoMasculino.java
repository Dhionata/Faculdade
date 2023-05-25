package br.com.periodo3.Ex9;

public class AlunoMasculino extends Aluno {

	private String identidadeMilitar;

	public AlunoMasculino(int cod, int i, String no, String cpf, String end, boolean s, Notas n, String idMil) {
		super(cod, i, no, cpf, end, s, n);
		this.setIdentidadeMilitar(idMil);
	}

	public AlunoMasculino() {

	}

	public String getIdentidadeMilitar() {
		return identidadeMilitar;
	}

	public void setIdentidadeMilitar(String identidadeMilitar) {
		this.identidadeMilitar = identidadeMilitar;
	}

	@Override
	public String toString() {
		return "\n-- AlunoMasculino --\n" + super.toString() + "\nIdentidade Militar: " + getIdentidadeMilitar() + "\n";
	}

}
