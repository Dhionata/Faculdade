package br.com.exerc4;

import java.util.ArrayList;

public class DadoPrincipal {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		p1.setNome("Lucas");
		p1.getMeuDado6().setnLados(6);
		p1.getMeuDado8().setnLados(8);

		Pessoa p2 = new Pessoa();
		p2.setNome("Jo�o");
		p2.getMeuDado6().setnLados(6);
		p2.getMeuDado8().setnLados(8);

		Pessoa p3 = new Pessoa();
		p3.setNome("Dhionat�");
		p3.getMeuDado6().setnLados(6);
		p3.getMeuDado8().setnLados(8);

		Pessoa p4 = new Pessoa();
		p4.setNome("Tay");
		p4.getMeuDado6().setnLados(6);
		p4.getMeuDado8().setnLados(8);

		Pessoa p5 = new Pessoa();
		p5.setNome("Marcos");
		p5.getMeuDado6().setnLados(6);
		p5.getMeuDado8().setnLados(8);

		Pessoa p6 = new Pessoa();
		p6.setNome("Bruna");
		p6.getMeuDado6().setnLados(6);
		p6.getMeuDado8().setnLados(8);

		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 1;

		ArrayList<String> vencedores = new ArrayList<String>();

		System.out.println("--Primeira dupla de jogadores--");

		do {

			int p1dado6 = p1.jogarDadoDe6faces();
			int p1dado8 = p1.jogarDadoDe8faces();

			int p2dado6 = p2.jogarDadoDe6faces();
			int p2dado8 = p2.jogarDadoDe8faces();

			int somadadop1 = p1dado6 + p1dado8;
			int somadadop2 = p2dado6 + p2dado8;

			System.out.println("\n--Rodada-- " + temp3);
			System.out.println(
					"\n" + p1.getNome() + "\nDado1: " + p1dado6 + "\nDado2: " + p1dado8 + "\nSomat�ria: " + somadadop1);
			System.out.println(
					"\n" + p2.getNome() + "\nDado1: " + p2dado6 + "\nDado2: " + p2dado8 + "\nSomat�ria: " + somadadop2);

			if (somadadop1 > somadadop2) {
				temp1++;
				temp3++;

			} else if (somadadop1 < somadadop2) {

				temp2++;
				temp3++;

			} else {
				temp1++;
				temp2++;
				temp3++;
			}
		} while (temp3 < 8);

		if (temp1 > temp2) {
			vencedores.add(p1.getNome());
			System.out.println("\n--Vencedor-- " + p1.getNome());
		} else if (temp1 < temp2) {
			vencedores.add(p2.getNome());
			System.out.println("\n--Vencedor-- " + p2.getNome());
		} else {
			vencedores.add(p1.getNome());
			vencedores.add(p2.getNome());
			System.out.println("\n\n--Vencedores-- " + p1.getNome() + " e " + p2.getNome());
		}

		temp1 = 0;
		temp2 = 0;
		temp3 = 1;

		System.out.println("\n\n--Segunda dupla de jogadores--");

		do {
			int p3dado6 = p3.jogarDadoDe6faces();
			int p3dado8 = p3.jogarDadoDe8faces();

			int p4dado6 = p4.jogarDadoDe6faces();
			int p4dado8 = p4.jogarDadoDe8faces();

			int somadadop3 = p3dado6 + p3dado8;
			int somadadop4 = p4dado6 + p4dado8;

			System.out.println("\n--Rodada-- " + temp3);
			System.out.println(
					"\n" + p3.getNome() + "\nDado1: " + p3dado6 + "\nDado2: " + p3dado8 + "\nSomat�ria: " + somadadop3);
			System.out.println(
					"\n" + p4.getNome() + "\nDado1: " + p4dado6 + "\nDado2: " + p4dado8 + "\nSomat�ria: " + somadadop4);

			if (somadadop3 > somadadop4) {
				temp1++;
				temp3++;

			} else if (somadadop3 < somadadop4) {

				temp2++;
				temp3++;

			} else {
				temp1++;
				temp2++;
				temp3++;
			}
		} while (temp3 < 8);

		if (temp1 > temp2) {
			vencedores.add(p3.getNome());
			System.out.println("\n--Vencedor--" + p3.getNome());
		} else if (temp1 < temp2) {
			vencedores.add(p4.getNome());
			System.out.println("\n--Vencedor--" + p4.getNome());
		} else {
			vencedores.add(p3.getNome());
			vencedores.add(p4.getNome());
			System.out.println("\n\n--Vencedores--" + p3.getNome() + " e " + p4.getNome());
		}

		temp1 = 0;
		temp2 = 0;
		temp3 = 1;

		System.out.println("\n\n--Terceira dupla de jogadores--");

		do {
			int p5dado6 = p5.jogarDadoDe6faces();
			int p5dado8 = p5.jogarDadoDe8faces();

			int p6dado6 = p6.jogarDadoDe6faces();
			int p6dado8 = p6.jogarDadoDe8faces();

			int somadadop5 = p5dado6 + p5dado8;
			int somadadop6 = p6dado6 + p6dado8;

			System.out.println("\n--Rodada-- " + temp3);
			System.out.println(
					"\n" + p5.getNome() + "\nDado1: " + p5dado6 + "\nDado2: " + p5dado8 + "\nSomat�ria: " + somadadop5);
			System.out.println(
					"\n" + p6.getNome() + "\nDado1: " + p6dado6 + "\nDado2: " + p6dado8 + "\nSomat�ria: " + somadadop6);

			if (somadadop5 > somadadop6) {
				temp1++;
				temp3++;

			} else if (somadadop5 < somadadop6) {

				temp2++;
				temp3++;

			} else {
				temp1++;
				temp2++;
				temp3++;
			}

		} while (temp3 < 8);

		if (temp1 > temp2) {
			vencedores.add(p5.getNome());
			System.out.println("\n--Vencedor--" + p5.getNome());
		} else if (temp1 < temp2) {
			vencedores.add(p6.getNome());
			System.out.println("\n--Vencedor-- " + p6.getNome());
		} else {
			vencedores.add(p5.getNome());
			vencedores.add(p6.getNome());
			System.out.println("\n\n--Vencedores-- " + p5.getNome() + " e " + p6.getNome());
		}
		System.out.println("\n\n--Vencedores--" + vencedores);
	}
}