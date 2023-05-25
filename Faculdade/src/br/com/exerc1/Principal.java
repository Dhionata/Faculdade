package br.com.exerc1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		Aluno p1 = new Aluno();
		System.out.println("--Aluno 1--");
		System.out.println("Informe a matr�cula");
		p1.setNmatriculas(entrada.nextInt());
		System.out.println("Seu Nome");
		p1.setNome(entrada.next());
		System.out.println("Sua Nota Bimestral 1");
		p1.setNotaBimestre1(entrada.nextInt());
		System.out.println("sua Nota Bimestral 2");
		p1.setNotaBimestre2(entrada.nextInt());

		Aluno p2 = new Aluno();
		System.out.println("--Aluno 2--");
		System.out.println("Informe a matr�cula");
		p2.setNmatriculas(entrada.nextInt());
		System.out.println("Seu Nome");
		p2.setNome(entrada.next());
		System.out.println("Sua Nota Bimestral 1");
		p2.setNotaBimestre1(entrada.nextInt());
		System.out.println("sua Nota Bimestral 2");
		p2.setNotaBimestre2(entrada.nextInt());

		Aluno p3 = new Aluno();
		System.out.println("--Aluno 3--");
		System.out.println("Informe a matr�cula");
		p3.setNmatriculas(entrada.nextInt());
		System.out.println("Seu Nome");
		p3.setNome(entrada.next());
		System.out.println("Sua Nota Bimestral 1");
		p3.setNotaBimestre1(entrada.nextInt());
		System.out.println("sua Nota Bimestral 2");
		p3.setNotaBimestre2(entrada.nextInt());

		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(p1);
		alunos.add(p2);
		alunos.add(p3);

		for (Aluno p : alunos) {
			if ((p.getNotaBimestre1() + p.getNotaBimestre2()) / 2 >= 6) {
				System.out.println("Aluno: " + p.getNome() + "\nMatr�cula N�: " + p.getNmatriculas() + "\nM�dia: "
						+ (p.getNotaBimestre1() + p.getNotaBimestre2()) / 2 + " --Aprovado!--\n");
			} else {
				System.out.println("Aluno: " + p.getNome() + "\nMatr�cula N�: " + p.getNmatriculas() + "\nM�dia: "
						+ (p.getNotaBimestre1() + p.getNotaBimestre2()) / 2 + " --Reprovado!--\n");
			}
		}
	}
}