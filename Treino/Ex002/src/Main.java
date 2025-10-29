public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.CadastrarProduto("Maçã", 4.25);
        p1.atualizacaoPreco(3.25);
        p1.apresentar_produto();
    }
}
