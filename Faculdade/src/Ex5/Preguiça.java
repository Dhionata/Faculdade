package Ex5;

public class Preguiça extends Animal {

	public Preguiça(String n, int i, boolean des, boolean cr, boolean sa) {
		super(n, i, des, cr, sa);
	}

	public Preguiça(String n, int i, boolean des) {
		super(n, i, des);
	}

	public Preguiça(String n, int i) {
		super(n, i);
	}

	public Preguiça() {

	}

	public String toString() {
		return "\n-- Preguiça --" + "\n" + super.toString() + "Sobe em �rvores: " + super.isSubirEmArvores() + "\n";
	}
}