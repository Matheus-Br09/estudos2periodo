public class Produto {
    private final String nome;
    private final double preco;
    private final int codigo;

    public Produto(String nome, double preco, int codigo){
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public void mostrarProduto(){
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Código: " + this.codigo);
    }


}
