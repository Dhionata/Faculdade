package br.com.periodo3.Ex7;

public class Conta {

	private double saldo, depositar, sacar;
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Conta() {
	}

	public Conta(double saldo, double depositar, double sacar, int x) {
		setSaldo(saldo);
		setDepositar(depositar);
		setSacar(sacar);
		setX(x);
	}

	public Conta(double saldo) {
		setSaldo(saldo);
	}

	public double taxa() {
		return this.saldo + this.saldo * (getX() / 100);
	}

	public double getSaldo() {
		return taxa() + getDepositar() - getSacar();
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getDepositar() {
		return depositar;
	}

	public void setDepositar(double depositar) {
		this.depositar = depositar;
	}

	public double getSacar() {
		return sacar;
	}

	public void setSacar(double sacar) {
		this.sacar = sacar;
	}
}