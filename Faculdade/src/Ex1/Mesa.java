package Ex1;

import java.util.ArrayList;

public class Mesa {

	private int Número;
	private String cliente;
	private ArrayList<Pedido> pedido;

	public Mesa(int n, String cli, ArrayList<Pedido> pedi) {
		this.setNúmero(n);
		this.setCliente(cli);
		this.setPedido(pedi);
	}

	public Mesa(int n, String cli) {
		this.setNúmero(n);
		this.setCliente(cli);
	}

	public Mesa(String cli, ArrayList<Pedido> pedi) {
		this.setCliente(cli);
		this.setPedido(pedi);
	}

	public Mesa() {

	}

	public int getNúmero() {
		return Número;
	}

	public void setNúmero(int Número) {
		this.Número = Número;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(ArrayList<Pedido> pedido) {
		this.pedido = pedido;
	}

	public String toString() {
		return "\n-- Mesa --" + "\nNúmero: " + getNúmero() + "\nCliente: " + getCliente() + "\nPedido: " + getPedido()
				+ "\n";
	}
}