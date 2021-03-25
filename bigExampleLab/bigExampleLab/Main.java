package bigExampleLab;

public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente("Dandan");

        Anuncio a1 = new Anuncio("Vidiozin", 1);
        Anuncio a2 = new Anuncio("image", 0);
        Anuncio a3 = new Anuncio("brttexto", 2);

        Compra c1 = new Compra(a1, 2);
        Compra c2 = new Compra(a2, 3);
        Compra c3 = new Compra(a3, 6);

        c.addCompra(c1);
        c.addCompra(c2);
        c.addCompra(c3);

        System.out.println(c.historico());
    }
}
