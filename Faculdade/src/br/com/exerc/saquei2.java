package br.com.exerc;

public class saquei2 {

	public static void main(String[] args) {

		double j = 0, i;
		for (i = 0; i <= 2; i = i + 0.2) {

			if (i == 1 || i == 0 || i == 2) {
				j++;
				System.out.printf("I=%.0f J=%.0f\n", i, j);
				j = j + 1;
				System.out.printf("I=%.0f J=%.0f\n", i, j);
				j = j + 1;
				System.out.printf("I=%.0f J=%.0f\n", i, j);
				j = j - 3 + 0.2;
			} else {
				j++;
				System.out.printf("I=%.1f J=%.1f\n", i, j);
				j = j + 1;
				System.out.printf("I=%.1f J=%.1f\n", i, j);
				j = j + 1;
				System.out.printf("I=%.1f J=%.1f\n", i, j);
				j = j - 3 + 0.2;
			}
		}
	}
}