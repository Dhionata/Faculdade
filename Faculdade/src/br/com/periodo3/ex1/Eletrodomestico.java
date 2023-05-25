package br.com.periodo3.ex1;

public class Eletrodomestico {

	private String nome;
	private String descrição;
	private boolean estado;

	public Eletrodomestico() {
	}

	public Eletrodomestico(String n, String d) {
		setNome(n);
		setDescrição(d);
	}

	public Eletrodomestico(String n, boolean e) {
		setNome(n);
		setEstado(e);
	}

	public Eletrodomestico(String n, String d, boolean e) {
		setNome(n);
		setDescrição(d);
		setEstado(e);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void ligado(boolean l) {
		this.setEstado(true);
	}

	public void desligado(boolean d) {
		this.setEstado(false);
	}

	public String imprimir() {
		return "\n-- Eletrodomestico -- " + "\nNome = " + getNome() + "\nDescrição = " + getDescrição() + "\nEstado = "
				+ isEstado();
	}
}