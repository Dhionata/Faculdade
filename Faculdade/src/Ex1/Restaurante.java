package Ex1;

import java.util.ArrayList;

public class Restaurante {

	private ArrayList<Mesa> mesas;
	private double faturamento = 0;

	public Restaurante(ArrayList<Mesa> me, double fat) {
		this.setMesas(me);
		this.setFaturamento(fat);
	}

	public Restaurante() {

	}

	public ArrayList<Mesa> getMesas() {
		return mesas;
	}

	public void setMesas(ArrayList<Mesa> mesas) {
		this.mesas = mesas;
	}

	public double getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(double faturamento) {
		this.faturamento = faturamento;
	}

	public String toString() {
		return "-- Restaurante --" + "\nMesas: " + this.getMesas() + "\nFaturamento: " + this.getFaturamento() + "\n";
	}
}