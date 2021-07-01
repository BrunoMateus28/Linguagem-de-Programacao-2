public class FuncExct extends FuncCntrd {
    private double gratificacao;

    public FuncExct(String nome,String codigo,double salario,int dependentes,double gratificacao){
        super(nome, codigo, salario, dependentes);
        this.gratificacao = gratificacao;
        super.calculaSalario(dependentes);
    }

    public double getGratificacao(){
        return Math.round(gratificacao*100.0)/100.0;
    }

    public double calculaSalario(){
        salarioL+=gratificacao;
        super.calculaSalario(aliquotaIR);
        return salarioL ;
    }

    @Override
    public String toString() {
        codigo=codigo +" *";
        return super.toString()+"\nValor da Gratificacao: "+getGratificacao();
    }
}
