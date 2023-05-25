package br.com.exerc4;

public class Endereco {

	private String nomerua, nomecidade, nomeestado, nomebairo;
	private long númerodarua, CEP;

	public Endereco(String rua, int nrua, String cidade) {
		this.nomerua = rua;
		this.númerodarua = nrua;
		this.nomecidade = cidade;
	}

	public String getNomerua() {
		return nomerua;
	}

	public void setNomerua(String nomerua) {
		this.nomerua = nomerua;
	}

	public String getNomecidade() {
		return nomecidade;
	}

	public void setNomecidade(String nomecidade) {
		this.nomecidade = nomecidade;
	}

	public String getNomeestado() {
		return nomeestado;
	}

	public void setNomeestado(String nomeestado) {
		this.nomeestado = nomeestado;
	}

	public String getNomebairo() {
		return nomebairo;
	}

	public void setNomebairo(String nomebairo) {
		this.nomebairo = nomebairo;
	}

	public long getNúmerodarua() {
		return númerodarua;
	}

	public void setNúmerodarua(long númerodarua) {
		this.númerodarua = númerodarua;
	}

	public long getCEP() {
		return CEP;
	}

	public void setCEP(long cEP) {
		CEP = cEP;
	}

}