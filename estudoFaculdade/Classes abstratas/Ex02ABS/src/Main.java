public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaCorrente();
        ContaBancaria c2 = new ContaPoupanca();

        c1.depositar(200);
        c2.depositar(200);

        c1.sacar(10);
        c2.sacar(10);

        System.out.println(c1.saldo);
        System.out.println(c2.saldo);
    }
}
