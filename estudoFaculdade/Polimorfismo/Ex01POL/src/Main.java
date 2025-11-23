public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Figura();
        Figura figura2 = new Triangulo(2, 3);

        System.out.println(figura1.calcularArea());
        figura1.desenhar();

        System.out.println(figura2.calcularArea());
        figura2.desenhar();
    }
}
