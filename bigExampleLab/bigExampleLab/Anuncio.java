package bigExampleLab;

public class Anuncio {

	protected String descricao;
	protected double precoBase;

	public Anuncio(String descricao) {
		this.descricao = descricao;
		this.precoBase = 0;
	}
	public String getDescricao (){
		return descricao;
	}
	public double getPreco(int dias){
		return 0;
	}

	public int morePoints(int dias) {
		return 0;
	}
}