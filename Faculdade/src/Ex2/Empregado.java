package Ex2;

public class Empregado extends Pessoa {

	private double salario;
	private String matricula;

	public Empregado(String nome, int idade, String sexo, double sala, String mat) {
		super(nome, idade, sexo);
		this.salario = sala;
		this.matricula = mat;
	}

	public Empregado() {

	}

	public double valorInss(double valinss) {
		return valinss = (salario * 0.11);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
//divida vai para o empregado, dividida em gerente e vendedor, 11% vai para o gerente e o restante pro vendedor.