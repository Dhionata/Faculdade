package br.com.fibonacci.recurcivo;

import javax.swing.JOptionPane;

public class Principal {

	private static int count;
	private static int numero;
	private static int cod;
	private static String preNumero;

	public static void main(String[] args) {
		do {
			count = 0;
			do {
				preNumero = JOptionPane.showInputDialog(null, "numeroorme um número");
				if (!Char(preNumero)) {
					JOptionPane.showMessageDialog(null,
							"Não é um valor válido, por favor, repita o processo e numeroorme um NÚMERO NATURAL.",
							"Tá Errado Isso Ai", JOptionPane.ERROR_MESSAGE);
				} else {
					numero = Integer.parseInt(preNumero);
					if (numero >= 43) {
						JOptionPane.showMessageDialog(null, "Desculpe, o valor é muito grande para ser calculado",
								"FpreNumero mal...", JOptionPane.ERROR_MESSAGE);
					}
				}
			} while (numero >= 43 || !Char(preNumero));

			JOptionPane.showMessageDialog(null, "Número\n" + Fibo(numero));

			JOptionPane.showMessageDialog(null, "Chamadas\n" + count);

			cod = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

		} while (cod == 0);
		JOptionPane.showMessageDialog(null, "Obrigado por utilizar o programa ;D", "Aviso",
				JOptionPane.INFORMATION_MESSAGE);
	}

	private static long Fibo(int i) {
		if (i < 2) {
			count++;
			return i;
		} else {
			count++;
			return Fibo(i - 1) + Fibo(i - 2);
		}
	}

	private static boolean Char(String s) {
		char[] c = s.toCharArray();
		boolean d = true;

		for (int i = 0; i < c.length; i++)
			// verifica se o char é um dígito
			if (!Character.isDigit(c[i])) {
				d = false;
				break;
			}
		return d;
	}
}
