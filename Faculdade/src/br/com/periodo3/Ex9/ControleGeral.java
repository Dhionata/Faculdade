package br.com.periodo3.Ex9;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleGeral {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int sexo;
		int cont = 0;
		int Sensu = 0;
		int escolha = 0;

		ArrayList<Aluno> alunas = new ArrayList<Aluno>();
		ArrayList<AlunoMasculino> alunos = new ArrayList<AlunoMasculino>();
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		ArrayList<CursoEspecializacao> especialistas = new ArrayList<CursoEspecializacao>();
		ArrayList<CursoMestrado> mestres = new ArrayList<CursoMestrado>();
		// ArrayList <ArrayList> alunoscadastradocurso = new ArrayList <ArrayList>();
		// ArrayList <ArrayList> alunoscadastradocurso2 = new ArrayList <ArrayList>();
		// ArrayList <ArrayList> alunoscadastradocurso3 = new ArrayList <ArrayList>();

		do {
			do {
				System.out.println("1 -- Masculino \n2 -- Feminino");
				sexo = entrada.nextInt();

				if (sexo != 1 && sexo != 2) {
					System.out.println("Código Errado");
				} else {
					if (sexo == 1) {
						AlunoMasculino Aluno = new AlunoMasculino();

						entrada.nextLine();

						System.out.println("\nInforme o nome: ");
						Aluno.setNome(entrada.nextLine());
						System.out.println("\nInforme o Código: ");
						Aluno.setcódigo(entrada.nextInt());
						System.out.println("\nInforme a idade: ");
						Aluno.setIdade(entrada.nextInt());

						entrada.nextLine();

						System.out.println("Informe o CPF: ");
						Aluno.setCpf(entrada.nextLine());

						while (Aluno.getCpf().length() != 11) {
							System.out.println("\nCPF inv�lido, digite novamente, o CPF deve conter 11 caracteres!");
							Aluno.setCpf(entrada.nextLine());
						}

						System.out.println("Informe o endereço: ");
						Aluno.setEndereço(entrada.nextLine());
						System.out.println("-- Notas --");
						System.out.println("Informe n1: ");
						Aluno.setN1(entrada.nextDouble());
						while (Aluno.getN1() < 0 || Aluno.getN1() > 10) {
							System.out.println("Informe n1 (deve ser um valor entra 0 e 10: ");
							Aluno.setN1(entrada.nextDouble());
						}
						System.out.println("Informe n2: ");
						Aluno.setN2(entrada.nextDouble());
						while (Aluno.getN2() < 0 || Aluno.getN2() > 10) {
							System.out.println("Informe n2 (deve ser um valor entra 0 e 10: ");
							Aluno.setN2(entrada.nextDouble());
						}
						System.out.println("Informe n3: ");
						Aluno.setN3(entrada.nextDouble());
						while (Aluno.getN1() < 0 || Aluno.getN2() > 10) {
							System.out.println("Informe n3 (deve ser um valor entra 0 e 10: ");
							Aluno.setN1(entrada.nextDouble());
						}

						Aluno.setSexo(true);

						entrada.nextLine();
						System.out.println("Informe a identidade militar: ");
						Aluno.setIdentidadeMilitar(entrada.nextLine());

						while (Aluno.getIdentidadeMilitar().length() < 5) {
							System.out.println(
									"Id.M incorreta!, Informe a identidade militar novamente.\n(M�nimo de 5 caracteres): ");
							Aluno.setIdentidadeMilitar(entrada.nextLine());
						}

						alunos.add(Aluno);
					} else if (sexo == 2) {
						Aluno Aluna = new Aluno();

						entrada.nextLine();

						System.out.println("Informe o nome: ");
						Aluna.setNome(entrada.nextLine());
						System.out.println("\nInforme o Código: ");
						Aluna.setcódigo(entrada.nextInt());
						System.out.println("Informe a idade: ");
						Aluna.setIdade(entrada.nextInt());
						;

						entrada.nextLine();

						System.out.println("Informe o CPF: ");
						Aluna.setCpf(entrada.nextLine());

						while (Aluna.getCpf().length() != 11) {
							System.out.println("\nCPF inv�lido, digite novamente, o CPF deve conter 11 caracteres!");
							Aluna.setCpf(entrada.nextLine());
						}

						System.out.println("Informe o endereço: ");
						Aluna.setEndereço(entrada.nextLine());
						System.out.println("-- Notas --");
						System.out.println("Informe n1: ");
						Aluna.setN1(entrada.nextDouble());
						while (Aluna.getN1() < 0 || Aluna.getN1() > 10) {
							System.out.println("Informe n1 (deve ser um valor entra 0 e 10: ");
							Aluna.setN1(entrada.nextDouble());
						}
						System.out.println("Informe n2: ");
						Aluna.setN2(entrada.nextDouble());
						while (Aluna.getN2() < 0 || Aluna.getN2() > 10) {
							System.out.println("Informe n2 (deve ser um valor entra 0 e 10: ");
							Aluna.setN2(entrada.nextDouble());
						}
						System.out.println("Informe n3: ");
						Aluna.setN3(entrada.nextDouble());
						while (Aluna.getN1() < 0 || Aluna.getN2() > 10) {
							System.out.println("Informe n3 (deve ser um valor entra 0 e 10: ");
							Aluna.setN1(entrada.nextDouble());
						}

						Aluna.setSexo(false);

						alunas.add(Aluna);
					}
				}
			} while (sexo != 1 && sexo != 2);

			System.out.println("-- 1 -- Cadastrar Mais Alunos \n-- 0 -- Continuar Registros");
			cont = entrada.nextInt();

		} while (cont == 1);

		do {
			Curso CUR = new Curso();

			entrada.nextLine();

			System.out.println("-- Cursos --");
			System.out.println("Informe o nome do curso: ");
			CUR.setNome(entrada.nextLine());
			System.out.println("Informe o Código: ");
			CUR.setCódigo(entrada.nextInt());

			do {
				System.out.println("Informe a carga hor�ria: ");
				CUR.setCargaHoraria(entrada.nextInt());

			} while (CUR.getCargaHoraria() <= 0);

			System.out.println("Informe sala: ");
			CUR.setSala(entrada.nextInt());

			entrada.nextLine();

			System.out.println("Informe o nome do professor: ");
			CUR.setNomeProfessor(entrada.nextLine());

			do {
				System.out.println("Informe o valor do curso: ");
				CUR.setValorCurso(entrada.nextDouble());

			} while (CUR.getValorCurso() <= 0);

			System.out.println("-- Cadastro de alunos no curso --");
			System.out.println("-- Alunos que podem ser cadastrados -- ");

			for (int i = 0; i < alunas.size(); i++) {
				System.out.println("\nIndice: " + i + "\nNome da aluna: " + alunas.get(i).getNome());
			}
			for (int i = 0; i < alunos.size(); i++) {
				System.out.println("\nIndice: " + i + "\nNome da aluno: " + alunos.get(i).getNome());
			}

			// do {
			// System.out.println("Informe o Indice da aluna a ser cadastrado: ");
			// int indice = entrada.nextInt();

			// alunoscadastradocurso.add(alunas.get(indice));
			// CUR.setAlunos(alunas.get(alunoscadastradocurso));

			// System.out.println("Informe o Indice do aluno a ser cadastrado: ");
			// int indice2 = entrada.nextInt();

			// alunoscadastradocurso.add(alunos.get(indice));
			// CUR.setAlunos(alunos.get(alunoscadastradocurso));

			// System.out.println("-- 1 -- Cadastrar mais alunos no curso \n-- 0 --
			// Continuar Registros");
			// cont = entrada.nextInt();
			// }while(cont ==1);

			cursos.add(CUR);

			do {
				System.out.println("\n-- 1 -- Cadastrar Mais Cursos \n-- 0 -- Continuar Registros");
				cont = entrada.nextInt();
			} while (cont != 1 && cont != 0);

		} while (cont == 1);

		do {
			CursoEspecializacao CE = new CursoEspecializacao();
			System.out.println("-- Curso de Especializaço --");

			entrada.nextLine();

			System.out.println("Informe o nome do Curso: ");
			CE.setNome(entrada.nextLine());
			System.out.println("Informe o Código: ");
			CE.setCódigo(entrada.nextInt());

			do {
				System.out.println("Informe a carga hor�ria: ");
				CE.setCargaHoraria(entrada.nextInt());
			} while (CE.getCargaHoraria() <= 0);

			System.out.println("Informe a sala: ");
			CE.setSala(entrada.nextInt());

			entrada.nextLine();

			System.out.println("Informe o nome do professor: ");
			CE.setNomeProfessor(entrada.nextLine());

			do {
				System.out.println("Informe o valor do curso: ");
				CE.setValorCurso(entrada.nextDouble());
			} while (CE.getValorCurso() <= 0);

			do {
				System.out.println("LatoSensu: \n1 -- Sim -- \n2 -- Nço");
				Sensu = entrada.nextInt();
				if (Sensu == 1) {
					CE.setLatoSensu(true);
				} else if (Sensu == 2) {
					CE.setLatoSensu(false);
				}
			} while (Sensu != 1 && Sensu != 2);

			System.out.println("-- Cadastro de alunos no curso de especializaço --");
			System.out.println("-- Alunos que podem ser cadastrados --");

			for (int i = 0; i < alunas.size(); i++) {
				System.out.println("\nIndice: " + i + "\nNome da aluna: " + alunas.get(i).getNome());
			}
			for (int i = 0; i < alunos.size(); i++) {
				System.out.println("\nIndice: " + i + "\nNome da aluno: " + alunos.get(i).getNome());
			}

			// do {
			// System.out.println("Informe o Indice da aluna a ser cadastrado: ");
			// int indice = entrada.nextInt();

			// alunoscadastradocurso2.add(alunas.get(indice));
			// CE.setAlunos(alunas.get(alunoscadastradocurso2));

			// System.out.println("Informe o Indice do aluno a ser cadastrado: ");
			// int indice2 = entrada.nextInt();

			// alunoscadastradocurso2.add(alunos.get(indice));
			// CE.setAlunos(alunos.get(alunoscadastradocurso2));

			// System.out.println("-- 1 -- Cadastrar mais alunos no curso \n-- 0 --
			// Continuar Registros");
			// cont = entrada.nextInt();
			// }while(cont ==1);

			especialistas.add(CE);

			do {
				System.out.println("\n-- 1 -- Cadastrar Mais Curso de Especiailzaço \n-- 0 -- Continuar Registros");
				cont = entrada.nextInt();
			} while (cont != 1 && cont != 0);

		} while (cont == 1);

		do {
			CursoMestrado CM = new CursoMestrado();
			System.out.println("-- Curso de Mestrado --");

			entrada.nextLine();

			System.out.println("Informe o nome do curso: ");
			CM.setNome(entrada.nextLine());
			System.out.println("Informe o Código: ");
			CM.setCódigo(entrada.nextInt());

			do {
				System.out.println("Informe a carga hor�ria: ");
				CM.setCargaHoraria(entrada.nextInt());
			} while (CM.getCargaHoraria() <= 0);

			System.out.println("Informe a sala: ");
			CM.setSala(entrada.nextInt());

			entrada.nextLine();

			System.out.println("Informe o nome do professor: ");
			CM.setNomeProfessor(entrada.nextLine());

			do {
				System.out.println("Informe o valor do curso: ");
				CM.setValorCurso(entrada.nextDouble());
			} while (CM.getValorCurso() <= 0);

			do {
				System.out.println("LatoSensu: \n1 -- Sim -- \n2 -- Nço");
				Sensu = entrada.nextInt();
				if (Sensu == 1) {
					CM.setStrictoSensu(true);
				} else if (Sensu == 2) {
					CM.setStrictoSensu(false);
				}
			} while (Sensu != 1 && Sensu != 2);

			System.out.println("-- Cadastro de alunos no curso de mestrado --");
			System.out.println("-- Alunos que podem ser cadastrados --");

			for (int i = 0; i < alunas.size(); i++) {
				System.out.println("\nIndice: " + i + "\nNome da aluna: " + alunas.get(i).getNome());
			}
			for (int i = 0; i < alunos.size(); i++) {
				System.out.println("\nIndice: " + i + "\nNome da aluno: " + alunos.get(i).getNome());
			}

			// do {
			// System.out.println("Informe o Indice da aluna a ser cadastrado: ");
			// int indice = entrada.nextInt();

			// alunoscadastradocurso3.add(alunas.get(indice));
			// CM.setAlunos(alunas.get(alunoscadastradocurso3));

			// System.out.println("Informe o Indice do aluno a ser cadastrado: ");
			// int indice2 = entrada.nextInt();

			// alunoscadastradocurso3.add(alunos.get(indice));
			// CM.setAlunos(alunos.get(alunoscadastradocurso3));

			// System.out.println("-- 1 -- Cadastrar mais alunos no curso \n-- 0 --
			// Continuar Registros");
			// cont = entrada.nextInt();
			// }while(cont ==1);

			mestres.add(CM);

			do {
				System.out.println("\n-- 1 -- Cadastrar Mais Cursos de Metrado \n-- 0 -- Continuar Registros");
				cont = entrada.nextInt();
			} while (cont != 1 && cont != 0);

		} while (cont == 1);

		do {
			System.out.println(
					"\nOp��es:\n0 - Todos\n1 - Alunas\n2 - Alunos\n3 - Cursos\n4 - Especializaço\n5 - Mestrado");
			escolha = entrada.nextInt();

			if (escolha == 0) {
				System.out.println(alunas);
				System.out.println(alunos);
				System.out.println(cursos);
				System.out.println(especialistas);
				System.out.println(mestres);
			} else if (escolha == 1) {
				System.out.println(alunas);
			} else if (escolha == 2) {
				System.out.println(alunos);
			} else if (escolha == 3) {
				System.out.println(cursos);
			} else if (escolha == 4) {
				System.out.println(especialistas);
			} else if (escolha == 5) {
				System.out.println(mestres);
			} else {
				System.out.println("\nOpção inválida!");
			}
		} while (escolha < 0 || escolha > 5);
	}
}