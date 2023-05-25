package br.com.Exercício1;

public class Operações {

	int inicio;
	int fim;

	public void Hello() {
		System.out.println("Bem vindos a Orientaçõo a Objetos.");
	}

	public void ímpares(int i, int f) {
		int j;
		this.inicio = i;
		this.fim = f;
		for (j = this.inicio; j <= this.fim; j++) {
			if (j % 2 != 0) {
				System.out.println(j);
			}
		}
	}

	public void InverterString(String b) {
		System.out.print(new StringBuilder(b).reverse().toString());
	}

	public void Operacao1(int i, int f) {
		this.inicio = i;
		this.fim = f;
		System.out.print("\n" + Math.pow(this.inicio, this.fim));
	}

	public void Operacao2(int i, int f) {
		this.inicio = i;
		this.fim = f;
		System.out
				.println("\n" + ((Math.pow(this.inicio, 2)) + (2 * this.inicio * this.fim) + (Math.pow(this.fim, 2))));
	}
}