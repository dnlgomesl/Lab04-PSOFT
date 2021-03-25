package bigExampleLab;

public class Imagem extends Anuncio {

    public Imagem(String descricao) {
        super(descricao);
        precoBase = 2;
    }

    @Override
    public double getPreco(int dias){
        double result = precoBase;
        if (dias <= 2){
            result += (3*dias);
        }
        return result;
    }
}
