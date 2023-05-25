package br.com.periodo3.Ex8;

public class Casa extends Porta {

	private String cor;
	private Porta porta1, porta2, porta3;

	public Casa() {

	}

	@Override
	public void pinta(String s) {
		setCor(s);
	}

	public int quantasPortasEstaoAbertas() {
		int x = 0;
		if (porta1.estaAberta()) {
			x++;
		} else if (porta2.estaAberta()) {
			x++;
		} else if (porta3.estaAberta()) {
			x++;
		}
		return x;
	}

	public int totalDePortas() {
		int x = 0;
		if (porta1.getDimensaoX() != 0) {
			x++;
		} else if (porta2.getDimensaoX() != 0) {
			x++;
		} else if (porta3.getDimensaoX() != 0) {
			x++;
		}
		return x;
	}

	@Override
	public String getCor() {
		return cor;
	}

	@Override
	public void setCor(String cor) {
		this.cor = cor;
	}

	public Porta getPorta1() {
		return porta1;
	}

	public void setPorta1(Porta porta1) {
		this.porta1 = porta1;
	}

	public Porta getPorta2() {
		return porta2;
	}

	public void setPorta2(Porta porta2) {
		this.porta2 = porta2;
	}

	public Porta getPorta3() {
		return porta3;
	}

	public void setPorta3(Porta porta3) {
		this.porta3 = porta3;
	}

	@Override
	public String toString() {
		return "\n-- Casa --" + "\ncor: " + getCor() + "\nQuantas Portas Est�o Abertas: " + quantasPortasEstaoAbertas()
				+ "\nTotal De Portas: " + totalDePortas();
	}
}