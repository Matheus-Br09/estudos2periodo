public class Main {
    public static void main(String[] args) {
        Espectador e1 = new Espectador();
        Espectador e2 = new EspectadorEstudante();

        System.out.println(e1.valorEntradaAPagar(200));
        System.out.println(e2.valorEntradaAPagar(200));

    }
}
