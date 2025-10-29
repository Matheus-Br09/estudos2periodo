public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.Cliente("Matheus", 19, "132.435.984-54");

        Cliente c2 = new Cliente();
        c2.Cliente("Marcos", 18, "178.984.324-34");

        Conta conta1 = new Conta();
        conta1.Conta(842, c1);

        Conta conta2 = new Conta();
        conta2.Conta(777, c2);

        conta1.depositar(150);

        conta2.depositar(1000);
        conta2.sacar(500);

        conta1.consultarSaldo();
        conta2.consultarSaldo();
    }
}