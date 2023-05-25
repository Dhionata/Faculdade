package br.com.periodo3.Ex7;

public class ContaCorrente extends Conta {

	int x;

	public ContaCorrente() {

	}

	public ContaCorrente(int x) {
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
		return x * 2;
	}

	public double depositar2() {
		return super.getDepositar() - 0.10;
	}
}