public class main {
    public static void main(String[] args) {
        Venda t1 = new Venda();

        t1.cadastrarItem(100, 2);
        System.out.println(t1.calcularPrecoTotal());
        System.out.println(t1.calcularPrecoTotal(10));
        System.out.println(t1.calcularPrecoTotal(10, 15));
    }
}
