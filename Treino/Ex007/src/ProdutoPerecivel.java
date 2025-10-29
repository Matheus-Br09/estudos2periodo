public class ProdutoPerecivel extends Produto{
    private final String dataDeValidade;

    public ProdutoPerecivel(String nome, double preco, int codigo, String dataDeValidade) {
        super(nome, preco, codigo);
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public void mostrarProduto() {
        super.mostrarProduto();
        System.out.println("Data de validade: " + this.dataDeValidade);
    }
}
