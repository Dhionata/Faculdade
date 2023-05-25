package Ex5;

public class Cavalo extends Animal {

	public Cavalo(String n, int i, boolean des, boolean cr, boolean sa) {
		super(n, i, des, cr, sa);
	}

	public Cavalo(String n, int i, boolean des) {
		super(n, i, des);
	}

	public Cavalo(String n, int i) {
		super(n, i);
	}

	public Cavalo() {

	}

	public String toString() {
		return "\n-- Cavalo --" + "\n" + super.toString() + "Corre: " + super.isCorrer() + "\n";
	}
}