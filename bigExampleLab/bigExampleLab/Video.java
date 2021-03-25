package bigExampleLab;

public class Video extends Anuncio{

    public Video(String descricao) {
        super(descricao);
        precoBase = 3;
    }

    @Override
    public double getPreco(int dias){
        return dias*precoBase;
    }

    @Override
    public int morePoints(int dias){
        if (dias > 1) {
            return 1;
        }
        return 0;
    }
}
