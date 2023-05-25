package Ex4;

import java.util.ArrayList;

public class CEO {

	public static void main(String[] args) {

		ArrayList<Pessoa> todomundo = new ArrayList<Pessoa>();

		Fornecedora f1 = new Fornecedora("Maria Eduarda", "Cachoeira Dourada - MG", "34 - 2089128", 2000, 1500);
		Empregado e1 = new Empregado("Dhionatã Carlos Vieira", "Trindade - GO", "62 - 982270768", 1231, 5000, 12);
		Administrador a1 = new Administrador("Matheus Alvez", "Brasília - DF", "64 - 1928391", 5432, 2000, 12, 2000);
		Operario o1 = new Operario("Juliana Batista", "Canápolis - MG", "34 - 19827472", 5028, 3000, 30, 5000, 100);
		Vendedor v1 = new Vendedor("Camylla Dias", "Besteirópolis - Oi", "62 - 1972731", 2928, 10000, 90, 200000, 3000);

		// System.out.println("-- Fornecedora --");

		// System.out.println("Informe o nome: ");
		// f1.setNome(entrada.nextLine());
		// System.out.println("Informe o endereço: ");
		// f1.setEndereço(entrada.nextLine());
		// System.out.println("Informe o telefone: ");
		// f1.setTelefone(entrada.nextLine());
		// System.out.println("Informe o limite do Cr�dito: ");
		// f1.setValorCredito(entrada.nextFloat());
		// System.out.println("Informe o valor da d�vida: ");
		// f1.setValorDivida(entrada.nextFloat());

		todomundo.add(f1);

		// System.out.println("-- Empregado� --");

		// System.out.println("Informe o nome: ");
		// e1.setNome(entrada.nextLine());
		// System.out.println("Informe o endereço: ");
		// e1.setEndereço(entrada.nextLine());
		// System.out.println("Informe o telefone: ");
		// e1.setTelefone(entrada.nextLine());
		// System.out.println("Informe o c�digo do setor: ");
		// e1.setCodigoSetor(entrada.nextInt());
		// System.out.println("Informe o salario base: ");
		// e1.setSalarioBase(entrada.nextFloat());
		// System.out.println("Informe a porcetagem de imposto(s): ");
		// e1.setImposto(entrada.nextFloat());

		todomundo.add(e1);

		// System.out.println("-- Administrador(a) --");

		// System.out.println("Informe o nome: ");
		// a1.setNome(entrada.nextLine());
		// System.out.println("Informe o endereço: ");
		// a1.setEndereço(entrada.nextLine());
		// System.out.println("Informe o telefone: ");
		// a1.setEndereço(entrada.nextLine());
		// System.out.println("Informe o c�digo do setor: ");
		// a1.setCodigoSetor(entrada.nextInt());
		// System.out.println("Informe o sal�rio base: ");
		// a1.setSalarioBase(entrada.nextFloat());
		// System.out.println("Informe a porcentagem de imposto(s): ");
		// a1.setImposto(entrada.nextFloat());
		// System.out.println("Informe a 'Ajuda de Custo': ");
		// a1.setAjudaDeCusto(entrada.nextFloat());

		todomundo.add(a1);

		// System.out.println("-- Operario� --");

		// System.out.println("Informe o nome: ");
		// o1.setNome(entrada.nextLine());
		// System.out.println("Informe o endereço: ");
		// o1.setEndereço(entrada.nextLine());
		// System.out.println("Informe o telefone: ");
		// o1.setEndereço(entrada.nextLine());
		// System.out.println("Informe o c�digo do setor: ");
		// o1.setCodigoSetor(entrada.nextInt());
		// System.out.println("Informe o sal�rio base: ");
		// o1.setSalarioBase(entrada.nextFloat());
		// System.out.println("Informe a porcentagem de imposto(s): ");
		// o1.setImposto(entrada.nextFloat());
		// System.out.println("Informe o valor de produ��o: ");
		// o1.setValorProducao(entrada.nextFloat());
		// System.out.println("Informe a comiss�o: ");
		// o1.setComissao(entrada.nextFloat());

		todomundo.add(o1);

		// System.out.println("-- Vendedor(a) --");

		// System.out.println("Informe o nome: ");
		// v1.setNome(entrada.nextLine());
		// System.out.println("Informe o endereço: ");
		// v1.setEndereço(entrada.nextLine());
		// System.out.println("Informe o telefone: ");
		// v1.setEndereço(entrada.nextLine());
		// System.out.println("Informe o c�digo do setor: ");
		// v1.setCodigoSetor(entrada.nextInt());
		// System.out.println("Informe o sal�rio base: ");
		// v1.setSalarioBase(entrada.nextFloat());
		// System.out.println("Informe a porcentagem de imposto(s): ");
		// v1.setImposto(entrada.nextFloat());
		// System.out.println("Informe o valor de vendas: ");
		// v1.setValorVendas(entrada.nextFloat());
		// System.out.println("Informe o valor da comiss�o: ");
		// v1.setComissao(entrada.nextFloat());

		todomundo.add(v1);

		System.out.println(todomundo);

	}
}