package br.com.periodo3.ex5;

public class Principal {

	public static void main(String[] args) {

		Pais p1 = new Pais("Brasil", "Bras�lia", 20308);
		Pais p2 = new Pais("Argentina", "Buenos Aires", 1029);

		p1.setPaisesdefronteira(p2);

		System.out.println(p1);
	}
}