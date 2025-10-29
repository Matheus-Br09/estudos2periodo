public class Conta {
    int numero;
    double saldo;
    Cliente titular;

    public void Conta(int numero, Cliente titular){
        this.saldo = 0;
        this.numero = numero;
        this.titular = titular;
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public boolean sacar(double valor){
        if (valor <= saldo){
            this.saldo = this.saldo - valor;
            return true;
        } else{
            System.out.println("VALOR ACIMA DO DISPONÍVEL, saque recusado.");
            return false;
        }
    }

    public void consultarSaldo(){
        System.out.println("Titular: " + this.titular.nome + " - Saldo: " + this.saldo);
    }

}
