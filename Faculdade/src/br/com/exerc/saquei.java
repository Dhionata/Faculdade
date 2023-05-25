package br.com.exerc;

public class saquei {

	public static void main(String[] args) {

		int j = 65;
		for (int i = 1; i <= 37; i = i + 3) {
			j = j - 5;
			System.out.printf("I=%d" + " J=%d\n", i, j);
		}
	}
}