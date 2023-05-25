package br.com.periodo3.Ex8;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Porta p1 = new Porta();
		Porta p2 = new Porta();
		Porta p3 = new Porta();
		Porta p4 = new Porta();

		Casa c1 = new Casa();
		Edificio e1 = new Edificio();

		ArrayList<Porta> portasaqui = new ArrayList<Porta>();

		p1.setCor("amarelo");
		p1.setDimensaoX(10);
		p1.setDimensaoY(30);
		p1.setDimensaoZ(20);
		p1.setAberta(true);
		portasaqui.add(p1);

		p2.setCor("verde");
		p2.setDimensaoX(10);
		p2.setDimensaoY(30);
		p2.setDimensaoZ(20);
		p2.setAberta(true);
		portasaqui.add(p2);

		p3.setCor("azul");
		p3.setDimensaoX(10);
		p3.setDimensaoY(30);
		p3.setDimensaoZ(20);
		p3.setAberta(true);
		portasaqui.add(p3);

		p4.setCor("preta");
		p4.setDimensaoX(10);
		p4.setDimensaoY(30);
		p4.setDimensaoZ(20);
		p4.setAberta(true);
		portasaqui.add(p4);

		c1.setCor("cor-de-rosa");
		c1.setPorta1(p1);

		e1.setCor("Marrom");
		e1.setTotalDeAndares(10);
		e1.setPortas(portasaqui);
		e1.setTotalDePortas(e1.getPortas());

		System.out.println(p1);
		System.out.println(c1);
		System.out.println(e1);
	}
}