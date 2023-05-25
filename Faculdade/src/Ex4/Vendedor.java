package Ex4;

public class Vendedor extends Empregado {

	private float valorVendas, comissao;

	public Vendedor(String n, String tele, int cs, float sb, float imp) {
		super(n, tele, cs, sb, imp);
	}

	public Vendedor() {
	}

	public Vendedor(String n, String end, String tele, int cs, float sb, float imp, int vdv, int comi) {
		super(n, end, tele, cs, sb, imp);
		this.setValorVendas(vdv);
		this.setComissao(comi);
	}

	public float calculaComissa(int x) {
		return this.getValorVendas() * (x / 100);
	}

	public float calcularSalario() {
		return super.calcularSalario() + this.getComissao();
	}

	public float getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public String toString() {
		return "\n---- Vendedor ----" + "\n" + super.toString() + "\nValor de Vendas: " + this.getValorVendas()
				+ "\nComiss�o: " + this.getComissao() + "\n";
	}
}