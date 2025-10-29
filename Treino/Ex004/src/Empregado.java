public class Empregado {
    private final String nome;
    private final String sobrenome;
    private double salario;

    public Empregado(String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }
    public void exibir_funcionario(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Sobrenome: " + this.sobrenome);
        System.out.println("Salário: R$" + this.salario);
    }
    public void aumentoSalario(int percentual){
        this.salario += salario * ((double) percentual /100);
    }


}
