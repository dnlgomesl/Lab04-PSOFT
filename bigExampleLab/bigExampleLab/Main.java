package bigExampleLab;

public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente("Dandan");

        Anuncio a1 = new Video("Vidiozin");
        Anuncio a2 = new Imagem("image");
        Anuncio a3 = new Texto("brttexto");

        Compra c1 = new Compra(a1, 2);
        Compra c2 = new Compra(a2, 4);
        Compra c3 = new Compra(a3, 6);

        c.addCompra(c1);
        c.addCompra(c2);
        c.addCompra(c3);

        System.out.println(c.historico());
    }
}
