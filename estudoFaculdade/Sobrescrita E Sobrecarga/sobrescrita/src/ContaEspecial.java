public class ContaEspecial extends Conta{

    private int limitePorSaque;

    @Override
    public void sacar(double valor){
        if(valor <= this.limitePorSaque){
            super.sacar(valor);
        } else {
            System.out.println("Limite de saque excedido!");
        }
    }

}
