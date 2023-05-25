package Ex4;

public class Administrador extends Empregado {

	private float ajudaDeCusto;

	public Administrador(String n, String tele, int cs, float sb, float imp) {
		super(n, tele, cs, sb, imp);
	}

	public Administrador() {
	}

	public Administrador(String n, String end, String tele, int cs, float sb, float imp, float ajc) {
		super(n, end, tele, cs, sb, imp);
		this.setAjudaDeCusto(ajc);
	}

	public float calcularSalario() {
		return super.calcularSalario() + this.getAjudaDeCusto();
	}

	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public String toString() {
		return "\n---- Administrador ---- " + super.toString() + "\nAjuda de Custo: " + this.getAjudaDeCusto() + "\n";
	}
}