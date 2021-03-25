package bigExampleLab;
class Compra {
	private Anuncio anuncio;
	private int diasAnuncio;
	private double total;
	
	public Compra(Anuncio anuncio, int diasAnuncio) {
		this.anuncio = anuncio;
		this.diasAnuncio = diasAnuncio;
		this.total = anuncio.getPreco(this.diasAnuncio);
	}
	public int getDiasAnuncio() {
		return diasAnuncio;
	}
	public Anuncio getAnuncio() {
		return anuncio;
	}
	public double getTotal(){
		return total;
	}
	public String getDescricaoAnuncio(){
		return anuncio.getDescricao();
	}

	public int morePoints() {
		return anuncio.morePoints(diasAnuncio);
	}

	@Override
	public String toString(){
		return "\t" + anuncio.getDescricao() + "\t"
				+ String.valueOf(total) + "\n";
	}
}