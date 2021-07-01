public class Funcionario{
    protected String nome;
    protected String codigo;
    protected double salario;
    protected double salarioL;

    public Funcionario(String nome,String codigo,double salario){
        this.nome = nome;
        this.codigo = codigo;
        this.salario =  Math.round(salario*100.0)/100.0;
        this.salarioL = Math.round(salario*100.0)/100.0;
    }

    public String getNome(){
        return nome;
    }

    public String getCodigo(){
        return codigo;
    }

    public double getSalario(){
        return Math.round(salario*100.0)/100.0;
    }

    public double getSalarioL(){
        return Math.round(salarioL*100.0)/100.0;
    }

    public double calculaSalario(double desconto){
        salarioL = salarioL - salarioL*desconto;
        return salarioL ;
    }

    public String toString(){
        return "Nome: "+getNome()+
        "\nCodigo: "+getCodigo()+
        "\nSalario-Base: "+getSalario();
    }

}