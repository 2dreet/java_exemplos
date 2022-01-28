package orientacaoObjeto.models;

public class DesafioCompraCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("José");
        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        compra1.adicionarProduto(new Item(new Produto("Tic-Tac", 2.5), 5));
        compra1.adicionarProduto(new Item(new Produto("Bala", 0.5), 7));
        compra1.adicionarProduto(new Item(new Produto("Mentos", 6.9), 9));

        compra2.adicionarProduto(new Item(new Produto("Tenis", 250.99), 2));
        compra2.adicionarProduto(new Item(new Produto("Bola", 59.90), 3));
        compra2.adicionarProduto(new Item(new Produto("Meia", 10), 3));

        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        System.out.println(cliente.obterValorTotalCompras());


        System.out.println(2.5 * 5);
        System.out.println(0.5 * 7);
        System.out.println(6.9 * 9);
        System.out.println(250.99 * 2);
        System.out.println(59.90 * 3);
        System.out.println(10 * 3);
    }
}
