package br.com.periodo3.Ex4;

public class Aluno {

	private int númeroDeMatrículas, notaBimestre1, notaBimestre2;
	private String nome;

	public Aluno() {

	}

	public Aluno(String n, int ndm, int n1, int n2) {
		setNome(n);
		setnúmeroDeMatrículas(ndm);
		setNotaBimestre1(n1);
		setNotaBimestre2(n2);
	}

	public int getnúmeroDeMatrículas() {
		return númeroDeMatrículas;
	}

	public void setnúmeroDeMatrículas(int númeroDeMatrículas) {
		this.númeroDeMatrículas = númeroDeMatrículas;
	}

	public int getNotaBimestre1() {
		return notaBimestre1;
	}

	public void setNotaBimestre1(int notaBimestre1) {
		this.notaBimestre1 = notaBimestre1;
	}

	public int getNotaBimestre2() {
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

	public int gerarMédia() {
		return (getNotaBimestre1() + getNotaBimestre2()) / 2;
	}

	public String aprovrepro() {
		if (gerarMédia() < 6) {
			return "reprovado";
		} else {
			return "aprovado";
		}
	}

	@Override
	public String toString() {
		return "\n\n-- Aluno --" + "\nNome: " + getNome() + "\nN�dematr�cula: " + getnúmeroDeMatrículas()
				+ "\nNotaBimestre1: " + getNotaBimestre1() + "\nNotaBimestre2: " + getNotaBimestre2() + "\nM�dia: "
				+ gerarMédia() + "\nEstado: " + aprovrepro();
	}

	public String aprovadosnoenemkk() {
		if (gerarMédia() >= 6) {
			return "\n\n-- Aluno --" + "\nNome: " + getNome() + "\nN�dematr�cula: " + getnúmeroDeMatrículas()
					+ "\nNotaBimestre1: " + getNotaBimestre1() + "\nNotaBimestre2: " + getNotaBimestre2() + "\nM�dia: "
					+ gerarMédia() + "\nEstado: " + aprovrepro();
		} else {
			return "";
		}
	}
}