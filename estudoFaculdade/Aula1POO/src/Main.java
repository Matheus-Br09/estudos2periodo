public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Hexagonal";
        c1.cor = "Azul";
        c1.ponta = 0.7f;
        c1.carga = 10;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}