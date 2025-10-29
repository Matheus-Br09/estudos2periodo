public class Main {
    public static void main(String[] args) {
        Produto p1 = new ProdutoPerecivel("Maçã", 3.20, 21423, "2025-10-10");
        Produto p2 = new Produto("Notebook", 2250.25, 14424);
        p1.mostrarProduto();
        System.out.println();
        p2.mostrarProduto();
    }
}
