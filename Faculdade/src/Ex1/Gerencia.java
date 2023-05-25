package Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerencia {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
		ArrayList<Mesa> mesas = new ArrayList<Mesa>();
		ArrayList<Restaurante> tudo = new ArrayList<Restaurante>();

		Restaurante restaurante = new Restaurante();

		int cod;
		double faturamento = 0;

		System.out.println("-- Welcome to Restaurant of HELL --");

		do {
			Mesa mesa = new Mesa();

			System.out.println("Informe o Número da mesa");
			mesa.setNúmero(entrada.nextInt());

			entrada.nextLine();

			System.out.println("\nInforme o nome do cliente: ");
			mesa.setCliente(entrada.nextLine());

			do {
				Pedido pedido = new Pedido();

				System.out.println("\n-- Informe o pedido --");

				System.out.println("Buffer BUG!!! aperte 'ENTER'");
				entrada.nextLine();

				System.out.println("\nInforme o prato a ser pedido: ");
				pedido.setNome(entrada.nextLine());

				System.out.println("\nInforme o valor do prato escolhido: ");
				pedido.setValor(entrada.nextDouble());

				pedidos.add(pedido);

				faturamento = faturamento + pedido.getValor();

				System.out.println("\nDeseja cadastrar mais pedidos?\n0 -- Sim\n1 -- Não");
				cod = entrada.nextInt();

			} while (cod != 1);

			mesa.setPedido(pedidos);

			mesas.add(mesa);

			System.out.println("\nDeseja cadastrar mais mesas?\n0 -- Sim\n1 -- Não");
			cod = entrada.nextInt();

		} while (cod != 1);

		restaurante.setMesas(mesas);
		restaurante.setFaturamento(faturamento);

		tudo.add(restaurante);

		System.out.println(tudo);
	}
}