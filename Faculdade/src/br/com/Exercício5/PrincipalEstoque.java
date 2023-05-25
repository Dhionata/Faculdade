package br.com.Exercício5;

public class PrincipalEstoque {

	public static void main(String[] args) {

		Estoque estoque1 = new Estoque("Impressora Jato de Tinta", 13, 6);
		Estoque estoque2 = new Estoque("Monitor LCD 17 polegadas", 11, 13);
		Estoque estoque3 = new Estoque("Mouse ótico", 6, 2);

		// a
		estoque1.darBaixa(5);
		// b
		estoque2.repor(7);
		// c
		estoque3.darBaixa(4);
		// d
		System.out.println("Retorno estoque1: " + estoque1.precisaRepor() + "\nRetornor estoque2: "
				+ estoque2.precisaRepor() + "\nRetornor estoque3: " + estoque3.precisaRepor());
		// e
		System.out.println("\n\n" + estoque1.mostra() + "\n\n" + estoque2.mostra() + "\n\n" + estoque3.mostra());
	}
}