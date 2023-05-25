package Ex5;

public class Animal {

	private boolean deveEmitirSom;
	private String nome;
	private int idade;
	private boolean correr;
	private boolean subirEmArvores;

	public Animal(String n, int i, boolean des, boolean cr, boolean sa) {
		this.setNome(n);
		this.setIdade(i);
		this.setDeveEmitirSom(des);
		this.setCorrer(cr);
		this.setSubirEmArvores(sa);
	}

	public Animal(String n, int i, boolean des) {
		this.setNome(n);
		this.setIdade(i);
		this.setDeveEmitirSom(des);
	}

	public Animal(String n, int i) {
		this.setNome(n);
		this.setIdade(i);
	}

	public Animal() {

	}

	public boolean isDeveEmitirSom() {
		return deveEmitirSom;
	}

	public void setDeveEmitirSom(boolean deveEmitirSom) {
		this.deveEmitirSom = deveEmitirSom;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}

	public boolean isSubirEmArvores() {
		return subirEmArvores;
	}

	public void setSubirEmArvores(boolean subirEmArvores) {
		this.subirEmArvores = subirEmArvores;
	}

	public String toString() {
		return "\nNome: " + getNome() + "\nIdade: " + getIdade() + " anos" + "\nDeve emitir som: " + isDeveEmitirSom()
				+ "\n";
	}
}