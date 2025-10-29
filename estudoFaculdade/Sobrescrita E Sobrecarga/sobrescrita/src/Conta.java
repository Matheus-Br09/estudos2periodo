public class Conta {
    protected String titular;
    protected int numero;
    protected double saldo;

    public void sacar(double valor){
            this.saldo = this.saldo - valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

}
