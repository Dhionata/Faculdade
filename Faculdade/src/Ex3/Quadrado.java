package Ex3;

public class Quadrado extends Retângulo {

	public Quadrado(float l, float h) {
		super(l);
	}

	public Quadrado() {

	}

	public float QuadradoArea() {
		return (float) Math.pow(super.getLado(), 2);
	}

	public float QuadradoPerimetro() {
		return (float) super.getLado() * 4;
	}

	public String toString() {
		return "\n -- Quadrado --" + "\n" + "\nValor do lado do quadrado = " + super.getLado()
				+ "\nÃ�rea do quadrado = " + QuadradoArea() + "\nPerÃ­metro do quadrado = " + QuadradoPerimetro()
				+ "\n";
	}
}