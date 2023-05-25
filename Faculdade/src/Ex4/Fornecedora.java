package Ex4;

public class Fornecedora extends Pessoa {

	private float valorCredito, valorDivida;

	public Fornecedora(String n, String end, String tele, float vc, float vd) {
		super(n, end, tele);
		this.setValorCredito(vc);
		this.setValorDivida(vd);
	}

	public Fornecedora() {
		super();
	}

	public float obterSaldo() {
		return this.valorCredito - this.valorDivida;
	}

	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}

	public String toString() {
		return "\n---- Fornecedora ----" + "\n" + super.toString() + "\nValor do Cr�dito: " + this.getValorCredito()
				+ "\nValor da Divida: " + this.getValorDivida() + "\nSaldo: " + this.obterSaldo() + "\n";
	}
}