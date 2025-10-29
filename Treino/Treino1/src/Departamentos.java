public class Departamentos {
    Funcionario empregado;
    int numero_departamento;
    String item_Escolhido;

    public void vincular_departamentos(Funcionario empregado, int numero_departamento){
        this.empregado = empregado;
        this.numero_departamento = numero_departamento;
        String[] Departamentos = {"Mercado Livre", "Amazon", "iFood"};
        this.item_Escolhido = Departamentos[this.numero_departamento];
        empregado.nome += " - " + this.item_Escolhido;
    }

    public void status(){
        System.out.println(this.empregado.nome);
    }
}
