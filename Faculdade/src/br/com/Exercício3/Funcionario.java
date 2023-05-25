package br.com.Exercício3;

public class Funcionario {

	private double salario;

	public double calculaSalário(double salario) {
		this.salario = salario;

		if (this.salario > 8000) {
			this.salario = 382.33 + (0.08675 * this.salario);
		} else if (this.salario <= 8000) {
			this.salario = 177.12 + (0.0387 * this.salario);
		}
		return this.salario;
	}
}