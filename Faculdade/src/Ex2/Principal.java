package Ex2;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Cliente> Clientes = new ArrayList<Cliente>();
		ArrayList<Gerente> Gerentes = new ArrayList<Gerente>();
		ArrayList<Vendedor> Vendedores = new ArrayList<Vendedor>();

		Cliente c1 = new Cliente("Dhionatã Carlos Vieira", 18, "Masculino", 2000, 440.20);
		Clientes.add(c1);

		Gerente g1 = new Gerente("Maria", 40, "Feminino", c1.getValorDivida() * 0.11, "20182238", "olocomeu");
		Gerentes.add(g1);

		Vendedor v1 = new Vendedor("Jubiscleusa", 25, "Feminino", c1.getValorDivida() - (c1.getValorDivida() * 0.11),
				"282828", c1.getValorDivida(), 3);
		Vendedores.add(v1);

		System.out.println(c1);
		System.out.println(g1);
		System.out.println(v1);
		// System.out.println(Clientes);
		// System.out.println(Gerentes);
		// System.out.println(Vendedores);
	}
}