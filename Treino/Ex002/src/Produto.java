public class Produto {
    String nome;
    double preco;
    int percentual;

    public void CadastrarProduto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.percentual = percentual;
    }

    public void atualizacaoPreco(double preco){
        this.preco = preco;
    }

    public void aplicarDesconto(int percentual){
        this.preco = preco - (preco * ((double) percentual /100));
        this.percentual = percentual;
    }

    public void apresentar_produto(){
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço do produto: " + this.preco);
        System.out.println("Desconto do produto: " + this.percentual + "%");
    }

}
