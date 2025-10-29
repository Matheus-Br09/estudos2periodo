public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(14, 1200, true);
        elevador.fechar_porta();
        for (int i = 0; i < 12; i++){
            elevador.subir();
        }
        elevador.exibirSituacao();
    }
}
