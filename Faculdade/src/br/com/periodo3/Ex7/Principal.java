package br.com.periodo3.Ex7;

public class Principal {

	public static void main(String[] args) {

		Conta c1 = new Conta(820);
		ContaCorrente cc1 = new ContaCorrente(5);
		ContaPoupanca cp1 = new ContaPoupanca(5);

		System.out.println("-- Conta --");
		System.out.println("Saldo atual");
		System.out.println(c1.getSaldo());

		c1.setDepositar(80);
		System.out.println("Saldo com deposito");
		System.out.println(c1.getSaldo());

		c1.setSacar(100);
		System.out.println("Saldo com saque");
		System.out.println(c1.getSaldo());

		System.out.println("\n-- Conta Corrente --");

		cc1.setSaldo(1020);
		System.out.println("Saldo atual");
		System.out.println(cc1.getSaldo());

		cc1.setDepositar(80);
		System.out.println("Saldo com deposito");
		System.out.println(cc1.getSaldo());

		cc1.setSacar(100);
		System.out.println("Saldo com saque");
		System.out.println(cc1.getSaldo());

		System.out.println("\n-- Conta Poupan�a --");

		cp1.setSaldo(4020);
		System.out.println("Saldo atual");
		System.out.println(cp1.getSaldo());

		cp1.setDepositar(80);
		System.out.println("Saldo com deposito");
		System.out.println(cp1.getSaldo());

		cp1.setSacar(100);
		System.out.println("Saldo com saque");
		System.out.println(cp1.getSaldo());
	}
}