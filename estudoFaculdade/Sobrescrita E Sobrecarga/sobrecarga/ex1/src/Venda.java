public class Venda {
    private int quantidade;
    private double precoUnitario;

    public void cadastrarItem(double precoUnitario, int quantidade){
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public double calcularPrecoTotal(){
        return precoUnitario * quantidade;
    }

    public double calcularPrecoTotal(double percentualDesconto){
        return  (precoUnitario * quantidade) - ((precoUnitario * quantidade) * (percentualDesconto/100));
    }

    public double calcularPrecoTotal(double percentualDesconto, double taxaEntrega){
        return (precoUnitario * quantidade + taxaEntrega) - ((precoUnitario * quantidade) * (percentualDesconto / 100));
    }

}
