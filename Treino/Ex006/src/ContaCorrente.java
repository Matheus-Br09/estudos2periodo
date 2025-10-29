public class ContaCorrente {
    private int numero;
    private double saldo;
    private String titular;

    public ContaCorrente(int numero, double saldo, String titular){
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositarSaldo(double valor){
        this.saldo += valor;
    }

    public void sacarSaldo(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
        } else {
            System.out.println("ERRO!!! valor acima do saldo disponível!!!");
        }
    }

    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getTitular(){
        return titular;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }


}
