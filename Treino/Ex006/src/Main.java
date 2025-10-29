public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(2522, 100, "Matheus");
        c1.depositarSaldo(100);

        System.out.println(c1.getTitular() + " - R$" + c1.getSaldo());
    }
}
