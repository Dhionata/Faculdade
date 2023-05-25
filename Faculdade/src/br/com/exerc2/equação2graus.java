package br.com.exerc2;

import javax.swing.JOptionPane;

public class equação2graus {

	private static double x1, x2, delta, A, B, C;
	private static int cod;
	private static String erro = "Deu ruim, n�o � um n�mero o que vc digitou...";

	public static void main(String[] args) {

		do {
			do {
				try {
					A = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de A",
							"Equação do 2º Grau", JOptionPane.QUESTION_MESSAGE));
					if (A == 0) {
						JOptionPane.showMessageDialog(null, erro, "Poxa...", JOptionPane.ERROR_MESSAGE);
					} else if (A < 0 || A > 0) {
						cod = 1;
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, erro, "Poxa...", JOptionPane.ERROR_MESSAGE);
					cod = 0;
				}
			} while (cod == 0);

			do {
				try {
					B = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de B",
							"Equação do 2º Grau", JOptionPane.QUESTION_MESSAGE));
					if (B < 0 || B > 0 || B == 0) {
						cod = 1;
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, erro, "Poxa...", JOptionPane.ERROR_MESSAGE);
					cod = 0;
				}
			} while (cod == 0);

			do {
				try {
					C = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de C",
							"Equação do 2º Grau", JOptionPane.QUESTION_MESSAGE));
					if (C < 0 || C > 0 || C == 0) {
						cod = 1;
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, erro, "Poxa...", JOptionPane.ERROR_MESSAGE);
					cod = 0;
				}
			} while (cod == 0);
			delta = Math.pow(B, 2) - 4 * A * C;

			if (delta < 0) {
				JOptionPane.showMessageDialog(null, "Imposs�vel Calcular!" + "\nA Ra�z Deu\n" + delta, "Deu ruim...",
						JOptionPane.ERROR_MESSAGE);
			} else {
				x1 = (-B + Math.sqrt(delta)) / (2 * A);
				x2 = (-B - Math.sqrt(delta)) / (2 * A);

				JOptionPane.showMessageDialog(null, "X' = " + x1 + "\nX'' = " + x2);
			}
			cod = JOptionPane.showConfirmDialog(null, "Deseja Fazer outra equação?", "Eae? ",
					JOptionPane.YES_NO_OPTION);
		} while (cod == 0);
		JOptionPane.showMessageDialog(null, "Valeu por testar isso daqui ;D");
	}
}