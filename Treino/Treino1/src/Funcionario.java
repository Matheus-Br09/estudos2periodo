public class Funcionario {
    String nome;
    int ano_nascimento;
    int codigo_funcionario;

    public void cadastro_funcionario(String nome, int ano_nascimento, int codigo_funcionario){
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.codigo_funcionario = codigo_funcionario;
    }

    public void mostrar_funcionarios(){
        System.out.println("=======================================");
        System.out.println("Nome Funcionário: " + this.nome);
        System.out.println("Código: " + this.codigo_funcionario);
        System.out.println("=======================================");
    }
}
