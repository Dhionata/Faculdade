package Ex1;

public class Pedido {

	private String nome;
	private double valor;

	public Pedido(String n, String v) {
		this.setNome(n);
		this.setValor(valor);
	}

	public Pedido() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String toString() {
		return "\n-- Pedido --" + "\nNome: " + getNome() + "\nValor: " + getValor() + "\n";
	}
}