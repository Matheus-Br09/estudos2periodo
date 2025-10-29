import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionario c1 = new Funcionario();
        Funcionario c2 = new Funcionario();

        Departamentos dp1 = new Departamentos();
        Departamentos dp2 = new Departamentos();

        c1.cadastro_funcionario("Matheus", 2006, 1234);
        c2.cadastro_funcionario("Kleiton rasta", 1978,2134);
        c1.mostrar_funcionarios();

        dp1.vincular_departamentos(c1,2);
        dp2.vincular_departamentos(c2,1);
        dp1.status();
        dp2.status();

    }
}