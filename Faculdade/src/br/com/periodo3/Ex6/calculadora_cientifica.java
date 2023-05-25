package br.com.periodo3.Ex6;

public class calculadora_cientifica extends calculadora {

	@Override
	public double soma() {
		return x + y;
	}

	@Override
	public double subtracao() {
		return x - y;
	}

	@Override
	public double divisao() {
		return x / y;
	}

	@Override
	public double multiplicacao() {
		return x * y;
	}

	public double raiz() {
		return Math.sqrt(x);
	}

	public double potencia() {
		return Math.pow(x, y);
	}

	@Override
	public String toString() {
		return "-- calculadora cientifica --" + "\nValores: " + "\n" + x + "\n" + y + "\nsoma: " + soma()
				+ "\nsubtra��o: " + subtracao() + "\ndivisao: " + divisao() + "\nmultipli��o: " + multiplicacao()
				+ "\nraiz: " + raiz() + "\npot�ncia: " + potencia();
	}
}