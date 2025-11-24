public class ContaPoupanca extends ContaBancaria{

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor < this.saldo){
            this.saldo = this.saldo - (valor + (this.saldo * ((double) 5 /100)));
        } else {
            System.out.println("Valor de saque excedido!");
        }
    }

}
