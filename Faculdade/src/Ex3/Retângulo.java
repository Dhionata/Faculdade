package Ex3;

public class Retângulo extends Forma {

	private float lado, altura;

	public Retângulo(float l, float h) {
		this.setLado(l);
		this.setAltura(h);
	}

	public Retângulo() {

	}

	public Retângulo(float l) {
		this.setLado(l);
	}

	float calcularArea() {
		return this.lado * this.altura;
	}

	float calcularPerimetro() {
		return this.lado + this.lado + this.altura + this.altura;
	}

	public float getAltura() {
		return this.altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getLado() {
		return this.lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public String toString() {
		return "\n -- RetÃ¢ngulo --" + "\n\nBase = " + this.lado + "\nAltura = " + this.altura + "\nÃ�rea = "
				+ calcularArea() + "\nPerÃ­metro = " + calcularPerimetro() + "\n";
	}
}