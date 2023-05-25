package br.com.Exercício5;

public class Estoque {

	private String nome;
	private int qtdAtual, qtdMinima;

	public Estoque() {
		this.nome = null;
		this.qtdAtual = 0;
		this.qtdMinima = 0;
	}

	public Estoque(String n, int a, int m) {
		this.nome = n;
		this.qtdAtual = a;
		this.qtdMinima = m;
	}

	public void mudarNome(String nome) {
		this.nome = nome;
	}

	public void mudarQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}

	public void repor(int qtd) {
		this.qtdAtual += qtd;
	}

	public void darBaixa(int qtd) {
		if (qtd <= this.qtdAtual) {
			this.qtdAtual -= qtd;
		} else {
			System.out.println("Quantidade inválida");
		}
	}

	public String mostra() {
		return "Nome: " + nome + "\nQuantidade Minima: " + this.qtdMinima + "\nQuantidade atual: " + this.qtdAtual;
	}

	public boolean precisaRepor() {
		if (this.qtdAtual <= this.qtdMinima) {
			return true;
		} else {
			return false;
		}
	}
}