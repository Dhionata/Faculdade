package br.com.periodo3.Ex9;

public class Aluno extends Notas {

	private int código, idade;
	private String nome, cpf, endereço;
	boolean sexo;
	Notas notas;

	public Aluno(int cod, int i, String no, String cpf, String end, boolean s, Notas n) {
		this.setcódigo(cod);
		this.setIdade(i);
		this.setNome(no);
		this.setCpf(cpf);
		this.setEndereço(end);
		this.setSexo(s);
		this.setNotas(n);
	}

	public Aluno() {

	}

	public String getSituacao() {
		if (super.getMedia() >= 6) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}

	public int getcódigo() {
		return código;
	}

	public void setcódigo(int código) {
		this.código = código;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public Notas getNotas() {
		return notas;
	}

	public void setNotas(Notas notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "\n-- Aluno --" + "\nNome: " + getNome() + "\nSituacao: " + getSituacao() + "\ncódigo: " + getcódigo()
				+ "\nIdade: " + getIdade() + "\nCpf: " + getCpf() + "\nEndereço: " + getEndereço() + "\nSexo: "
				+ isSexo() + "\nN1: " + super.getN1() + "\nN2: " + super.getN2() + "\nN3:" + super.getN3() + "\nM�dia: "
				+ super.getMedia() + "\n";
	}
}