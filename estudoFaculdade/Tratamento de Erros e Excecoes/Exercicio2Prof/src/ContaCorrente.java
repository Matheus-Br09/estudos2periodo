public class ContaCorrente {
    private double saldo;

    public void sacar(double valor) throws SaldoInsuficienteException{

        if (this.saldo > valor){
            this.saldo -= valor;
        } else {
            throw new SaldoInsuficienteException();
        }
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        } else {
            System.out.println("O valor para depositar deve ser positivo");
            throw new IllegalArgumentException();

        }
    }

}
