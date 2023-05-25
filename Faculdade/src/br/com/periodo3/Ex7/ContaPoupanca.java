package br.com.periodo3.Ex7;

public class ContaPoupanca extends Conta {

	int x;

	public ContaPoupanca() {
	}

	public ContaPoupanca(int x) {
		setX(x);
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public void setX(int x) {
		this.x = x;
	}

	public int atualizar() {
		return x * 3;
	}
}