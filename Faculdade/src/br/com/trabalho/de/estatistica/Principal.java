package br.com.trabalho.de.estatistica;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int confirmação = 1, ContagemUtilizacao = 1;

		do {
			long n, repete, fatorialN = 1, divisor = 1, formula, verificar = 0;
			do {
				n = Long.parseLong(JOptionPane.showInputDialog("Digite o valor total de elementos da permutação"));
				if (n > 20) {// limite da fatoração.
					JOptionPane.showMessageDialog(null,
							"Desculpa prof.a, mas o limite do java para fatoração como ainda conhecemos � 20.."
									+ "apos isso ele excede a memaria do tipo da variavel.");
				} else if (n <= 0) {
					JOptionPane.showMessageDialog(null, "Ops, o n�mero de elementos n�o pode ser igual ou menor que 0");
				}
			} while (n <= 0);
			do {// validação do n�mero de repeti��es
				do {// Validação se o usu�rio n�o est� querendo burlar o sistema de repeti��es
					repete = Long.parseLong(
							JOptionPane.showInputDialog("Digite o n�mero de elementos que se repetem A,B,C..."));
					verificar += repete;
					System.out.println(verificar);
					if ((repete > n || repete <= 0) || verificar > n) {
						System.out.println(
								"O n�mero de repeti��es n�o pode ser maior que o n�mero de elementos, ser 0 ou menor que 0");
						JOptionPane.showMessageDialog(null, "O n�mero de repeti��es nao pode ser"
								+ " maior que o n�mero de elementos, ser 0 ou menor que 0");
						verificar -= repete;
					}
				} while (repete > n | verificar > n | repete <= 0);

				// fatorial do divisor
				divisor *= fatorar(repete);

				if (verificar < n) {
					System.out.println("Mais algum n�mero se repete?");
					confirmação = JOptionPane.showConfirmDialog(null, "Mais algum n�mero se repete?");
				} else if (verificar == n) {
					confirmação = 1;
				}
			} while (confirmação != 1);

			// fatorial de n
			fatorialN = fatorar(n);

			formula = fatorialN / divisor; // formula final

			// apresentação para o usu�rio
			System.out.println("O total de permuta��es �: " + formula);
			JOptionPane.showMessageDialog(null, "O total de permuta��es � : " + formula + " !!!");
			confirmação = JOptionPane.showConfirmDialog(null, "Deseja testar outra permutação? ");
			if (confirmação != 1) {
				ContagemUtilizacao += 1;
			}
		} while (confirmação != 1);

		// finalização do programa
		if (ContagemUtilizacao > 1) {
			System.out.println("Obg por usar o programa" + ContagemUtilizacao + " vezes");
			JOptionPane.showMessageDialog(null,
					"Obrigado por utilizar o programa " + ContagemUtilizacao + " vezes Prof.a ;D");
		} else {
			System.out.println("Obg por usar o programa s� 1 vez ;D");
			JOptionPane.showMessageDialog(null, "Obrigado por utilizar o programa 1 vez Prof.a ;D");
		}
	}

	public static Long fatorar(Long n) {
		Long FatorialN = (long) 1;
		for (long j = n; j >= 1; j--) {
			FatorialN *= j;
			System.out.println("N: " + n + " Indice: " + j + " Fatorial: " + FatorialN);
		}
		return FatorialN;
	}
}