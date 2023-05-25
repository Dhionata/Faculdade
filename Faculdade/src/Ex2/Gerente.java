package Ex2;

public class Gerente extends Empregado {

	private String nomeGerencia;

	public Gerente(String nome, int idade, String sexo, double sala, String mat, String noge) {
		super(nome, idade, sexo, sala, mat);
		this.nomeGerencia = noge;
	}

	public Gerente() {
		super();
	}

	public Gerente(Pessoa p3, String string, int i, int j) {
	}

	public String getNomeGerencia() {
		return nomeGerencia;
	}

	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}

	public String toString() {
		return " -- Gerente --\nNome da Gerencia = " + getNomeGerencia() + "\nMatr�cula = " + super.getMatricula()
				+ "\nNome do� gerente = " + super.getNome() + "\nIdade = " + super.getIdade() + "\nValor do INSS = R$"
				+ super.getSalario() + "\n";
	}
}
