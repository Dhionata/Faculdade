package Ex4;

public class Empregado extends Pessoa {

	private int codigoSetor;
	private float salarioBase, imposto;

	public Empregado(String n, String tele, int cs, float sb, float imp) {
		super(n, tele);
		this.setCodigoSetor(cs);
		this.setSalarioBase(sb);
		this.setImposto(imp);
	}

	public Empregado(String n, String end, String tele, int cs, float sb, float imp) {
		super(n, end, tele);
		this.setCodigoSetor(cs);
		this.setSalarioBase(sb);
		this.setImposto(imp);
	}

	public Empregado() {
	}

	public float calcularSalario() {
		return this.getSalarioBase() - (this.getSalarioBase() * (this.getImposto() / 100));
	}

	public int getCodigoSetor() {
		return this.codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return this.salarioBase;
	}

	public void setSalarioBase(float sBase) {
		this.salarioBase = sBase;
	}

	public float getImposto() {
		return this.imposto;
	}

	public void setImposto(float imp) {
		this.imposto = imp;
	}

	public String toString() {
		return "\n---- Empregado ----\n" + super.toString() + "\nCodigo do Setor:" + this.getCodigoSetor()
				+ "\nSalario Base:" + this.getSalarioBase() + "\nImposto(s):" + this.getImposto() + "%" + "\nSal�rio: "
				+ this.calcularSalario() + "\n";
	}
}