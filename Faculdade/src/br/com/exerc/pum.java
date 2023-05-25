package br.com.exerc;

import javax.swing.JOptionPane;

public class pum {

	private static int x;

	public static void main(String[] args) {

		x = Integer.parseInt(JOptionPane.showInputDialog("Digita ai"));

		String[] números = new String[x + 1];

		for (int i = 0; i <= x; i++) {
			números[i] = i + " ";
			if (!((i % 2) == 0)) {
				números[i] = i + "BUM";
			}

		}
		JOptionPane.showMessageDialog(null, números);
	}
}