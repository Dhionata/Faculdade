package Ex3;

public class Círculo extends Forma {

	private float raio;

	public Círculo(float r) {
		this.setRaio(r);
	}

	public Círculo() {

	}

	float calcularArea() {
		return (float) (Math.PI * Math.pow(this.raio, 2));
	}

	float calcularPerimetro() {
		return (float) (2 * Math.PI * this.raio);
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public String toString() {
		return "\n -- Círculo -- \n\nRaio = " + this.raio + "\n�rea = " + calcularArea() + "\nPer�metro = "
				+ calcularPerimetro() + "\n";
	}
}