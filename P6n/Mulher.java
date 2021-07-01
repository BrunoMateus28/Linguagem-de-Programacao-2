public class Mulher extends PessoaIMC {
    double imc = calculaIMC(getAltura(),getPeso());
    public Mulher(String nome, String dataNascimento,double peso,double altura){
        super(nome,dataNascimento,peso,altura,"Mulher");
    }
    public String resultIMC() {
        if (imc > 25.8) {
            return "Acima do peso ideal";
        }
        if (imc > 19) {
            return "Peso ideal";
        }
        return "Abaixo do peso ideal";
    }

    public String toString(){
        return super.toString() + "\nImc: " + Math.round(this.imc*100.0)/100.0+
        "\t"+resultIMC()+"\n";
    }
}
