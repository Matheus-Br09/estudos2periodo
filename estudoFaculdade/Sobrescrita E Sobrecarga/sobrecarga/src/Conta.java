public class Conta {
    protected String titular;
    protected int numero;
    protected double saldo;

    public Conta(String titular, int numero){
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }

    public Conta(String titular, int numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

}
