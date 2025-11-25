public class ValidadorProdutos extends Produto{
    private Produto titular;

    public ValidadorProdutos(Produto titular, String nome, double preco, int quantidade) throws PrecoInvalidoException{
        super(nome, preco, quantidade);
        if (preco <= 0){
            throw new PrecoInvalidoException();
        }


    }
}
