public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Matheus", 1234);
        ContaBancaria conta2 = new ContaBancaria("Hugo", 3243);
        ContaBancaria conta3 = new ContaBancaria("Erick", 5312);
        ContaBancaria conta4 = new ContaBancaria("Marcos", 7654);
        ContaBancaria conta5 = new ContaBancaria("Gandalf", 8514);

        RepositorioConta rep1 = new RepositorioConta();

        rep1.inserirConta(conta1);
        rep1.inserirConta(conta2);
        rep1.inserirConta(conta3);
        rep1.inserirConta(conta4);
        rep1.inserirConta(conta5);
        rep1.listarContas();



    }
}
