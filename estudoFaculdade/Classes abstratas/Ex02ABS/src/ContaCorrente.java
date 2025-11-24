public class ContaCorrente extends ContaBancaria{

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor < this.saldo){
            this.saldo -= valor;
        } else {
            System.out.println("Valor de saque excedido!");
        }
    }

}
