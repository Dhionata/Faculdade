package Ex2;

public class Cliente extends Pessoa {

	private double valorDivida;
	private int anoNascim;

	public Cliente(String nome, int idade, String sexo, int an, double tadevendoem) {
		super(nome, idade, sexo);
		this.setAnoNascim(an);
		this.setValorDivida(tadevendoem);
	}

	public Cliente(Pessoa pess, int i, double d) {
		this.setAnoNascim(i);
		this.setValorDivida(d);
	}

	public double getValorDivida() {
		return this.valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public int getAnoNascim() {
		return this.anoNascim;
	}

	public void setAnoNascim(int anoNascim) {
		this.anoNascim = anoNascim;
	}

	public String toString() {
		return " -- Cliente --\nValor da divida = R$" + getValorDivida() + "\nAno de nascimento = " + getAnoNascim()
				+ "\nNome do cliente = " + super.getNome() + "\nIdade = " + super.getIdade() + "\nSexo = "
				+ super.getSexo() + "\n";
	}
}
