package bigExampleLab;

public class Texto extends Anuncio{

    public Texto(String descricao) {
        super(descricao);
        precoBase = 1.5;
    }

    @Override
    public double getPreco(int dias){
        double result = precoBase;
        if (dias > 3) {
            result += (dias - 3) * precoBase;
        }
        return result;
    }

}
