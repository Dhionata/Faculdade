package Ex4;

public class Operario extends Empregado {

	private float valorProducao, comissao;

	public Operario(String n, String tele, int cs, float sb, float imp) {
		super(n, tele, cs, sb, imp);
	}

	public Operario() {
	}

	public Operario(String n, String end, String tele, int cs, float sb, float imp, float vdp, float comi) {
		super(n, end, tele, cs, sb, imp);
		this.setValorProducao(vdp);
		this.setComissao(comi);
	}

	public float calculaComissa() {
		return this.getValorProducao() * (super.getImposto() / 100);
	}

	public float calcularSalario() {
		return super.calcularSalario() + this.getComissao();
	}

	public float getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(float valorProducao) {
		this.valorProducao = valorProducao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public String toString() {
		return "---- Oper�rio ----" + super.toString() + "\nValor de produ��o: " + this.getValorProducao()
				+ "\nComiss�o: " + this.calculaComissa() + "\n";
	}
}