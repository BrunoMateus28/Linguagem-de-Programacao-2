public class FuncCntrd extends Funcionario {
    protected int dependentes;
    protected double salarioF;
    final double valorPorDep = 9.58;
    final double aliquotaIR = 0.15;

    public FuncCntrd(String nome,String codigo,double salario,int dependentes){
        super(nome, codigo, salario);
        this.dependentes = dependentes;
        calculaSalario(dependentes);
    }

    public int getDependentes(){
        return dependentes;
    }

    public double calculaSalario(){
        return super.calculaSalario(aliquotaIR);
    }
    
    public double calculaSalario(int numeroDependentes){
        salarioF = numeroDependentes*valorPorDep;
        salarioL = salario + salarioF;
        return  calculaSalario();
    }
    @Override
    public String toString() {
        return super.toString()+"\nSalario-Liquido:"+getSalarioL();
    }
}
