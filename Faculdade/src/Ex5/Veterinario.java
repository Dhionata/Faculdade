package Ex5;

public class Veterinario extends Animal {

	public Veterinario(String n, int i) {
		super(n, i, true);
	}

	public void Examinar(Animal a) {
		super.setDeveEmitirSom(true);
		super.setCorrer(true);
		super.setSubirEmArvores(true);
	}

	public String toString() {
		return "-- Veterin�rio --" + "\n" + super.toString() + "\n";
	}
}