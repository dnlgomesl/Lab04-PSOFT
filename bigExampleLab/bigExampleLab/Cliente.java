package bigExampleLab;

import java.util.Enumeration;
import java.util.Vector;


class Cliente {
	private String nome;
	private Vector compras = new Vector();

	public Cliente(String nome) {
		this.nome = nome;
	}

	public void addCompra(Compra arg) {
		compras.addElement(arg);
	}

	public String getNome() {
		return nome;
	}
	
	public String historico() {
		double total = 0;
		int pontosFRequentes = 0;
		Enumeration comprasAnuncio = compras.elements();
		String resultado = "Historico de compras de anuncios por " + getNome() + "\n";
		while (comprasAnuncio.hasMoreElements()) {
			double totalParcial = 0;
			Compra cada = (Compra) comprasAnuncio.nextElement();
			switch (cada.getAnuncio().getCodigoPreco()) {
			case Anuncio.IMAGEM:
				totalParcial += 2;
				if (cada.getDiasAnuncio() > 2)
					break;
			case Anuncio.VIDEO:
				totalParcial += cada.getDiasAnuncio() * 3;
				break;
			case Anuncio.TEXTO:
				totalParcial += 1.5;
				if (cada.getDiasAnuncio() > 3)
					totalParcial += (cada.getDiasAnuncio() - 3) * 1.5;
				break;
			}
			pontosFRequentes++;
			if ((cada.getAnuncio().getCodigoPreco() == Anuncio.VIDEO) && cada.getDiasAnuncio() > 1)
				pontosFRequentes++;
			resultado += "\t" + cada.getAnuncio().getDescricao() + "\t" + String.valueOf(totalParcial) + "\n";
			total += totalParcial;
		}
		resultado += "Total devido é " + String.valueOf(total) + "\n";
		resultado += "Voce ganhou " + String.valueOf(pontosFRequentes) + " pontod";
		return resultado;
	}

}