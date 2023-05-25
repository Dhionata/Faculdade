package br.com.exerc3;

public class Endereco {

	private String logradouro, cidade, estado;

	public Endereco(String log, String cid, String esta) {
		this.logradouro = log;
		this.cidade = cid;
		this.estado = esta;
	}

	public Endereco() {
	}

	public Endereco(String log, String cid) {
		this.logradouro = log;
		this.cidade = cid;
	}

	public String consultaLogradouro() {
		return logradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String toString() {
		return "\nLogradouro: " + this.logradouro + "\nCidade: " + this.cidade + "\nEstado: " + this.estado;
	}
}