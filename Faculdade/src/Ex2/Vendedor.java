package Ex2;

public class Vendedor extends Empregado {

	private double valorVendas;
	private int qntVendas;

	public Vendedor(String nome, int idade, String sexo, double sala, String mat, double d, int i) {
		super(nome, idade, sexo, sala, mat);
		this.valorVendas = d;
		this.qntVendas = i;
	}

	public Vendedor() {
	}

	public Vendedor(Pessoa p2, double valorDivida, int qntVendas2) {
	}

	public Vendedor(Pessoa p2, double valorDivida) {
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public int getQntVendas() {
		return qntVendas;
	}

	public void setQntVendas(int qntVendas) {
		this.qntVendas = qntVendas;
	}

	public String toString() {
		return " -- Vendedor -- \nValor das vendas = R$" + getValorVendas() + "\nQuantidade de vendas = "
				+ getQntVendas() + "\nSal�rio = R$" + super.getSalario() + "\nNome do vendedor = " + super.getNome()
				+ "\n";
	}
}