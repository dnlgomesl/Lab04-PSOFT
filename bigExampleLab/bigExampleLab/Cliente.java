package bigExampleLab;

import java.util.Enumeration;
import java.util.Vector;


class Cliente {

	private String nome;
	private Vector compras = new Vector();
	private double total;
	private int pontosFRequentes;

	public Cliente(String nome) {
		this.nome = nome;
	}

	public void addCompra(Compra arg) {
		compras.addElement(arg);
		total += arg.getTotal();
		pontosFRequentes++;
		pontosFRequentes += arg.morePoints();
	}

	public String getNome() {
		return nome;
	}
	
	public String historico() {
		String resultado = "Historico de compras de anuncios por " + getNome() + "\n"
				+ detalhesCompra()
				+ "Total devido é " + String.valueOf(total) + "\n"
				+ "Voce ganhou " + String.valueOf(pontosFRequentes) + " pontos";
		return resultado;


	}

	public String detalhesCompra(){
		String resultado = "";
		Enumeration comprasAnuncio = compras.elements();
		while (comprasAnuncio.hasMoreElements()) {
			Compra compra = (Compra) comprasAnuncio.nextElement();
			resultado += compra.toString();
		}
		return resultado;
	}

}