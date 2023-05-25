package br.com.exerc3;

public class Compra {

	private Pessoa pessoa;
	private Produto produto;

	public Compra(Pessoa pes, Produto prod) {
		this.pessoa = pes;
		this.produto = prod;
	}

	public void comprar(Pessoa pessoa, Produto produto) {
		this.pessoa = pessoa;
		this.produto = produto;
	}

	public String verificarCompra() {
		return null;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Compra(Pessoa nom) {
		this.pessoa = nom;
	}

	public Compra() {
	}

	public String toString() {
		return "\nPessoa: " + this.pessoa + "\nProduto: " + this.produto;

	}
}