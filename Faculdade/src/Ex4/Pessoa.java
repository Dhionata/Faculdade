package Ex4;

public class Pessoa {

	private String nome, endereço, telefone;

	public Pessoa(String n, String end, String tele) {
		this.setNome(n);
		this.setEndereço(end);
		this.setTelefone(tele);
	}

	public Pessoa(String n, String tele) {
		this.setNome(n);
		this.setTelefone(tele);
	}

	public Pessoa(String n) {
		this.setNome(n);
	}

	public Pessoa() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String toString() {
		return "\n---- Pessoa ----" + "\nNome: " + getNome() + "\nEndereço: " + getEndereço() + "\nTelefone: "
				+ getTelefone() + "\n";
	}
}