package Ex5;

public class Cachorro extends Animal {

	public Cachorro(String n, int i, boolean des, boolean cr, boolean sa) {
		super(n, i, des, cr, sa);
	}

	public Cachorro(String n, int i, boolean des) {
		super(n, i, des);
	}

	public Cachorro(String n, int i) {
		super(n, i);
	}

	public Cachorro() {

	}

	public String toString() {
		return "\n-- Cachorro --" + "\n" + super.toString() + "Corre: " + super.isCorrer() + "\n";
	}
}