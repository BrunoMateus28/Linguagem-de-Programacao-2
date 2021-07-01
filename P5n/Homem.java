public class Homem extends PessoaIMC{
    double imc = calculaIMC(getAltura(),getPeso());
    public Homem(String nome, String dataNascimento,double peso,double altura){
        super(nome,dataNascimento,peso,altura);
    }

    public String resultIMC() {
        if (imc > 26.4) {
            return "Acima do peso ideal";
        }
        if (imc > 20.7) {
            return "Peso ideal";
        }
        return "Abaixo do peso ideal";
    }
    public String toString(){
        return super.toString() + "\nImc: " + Math.round(this.imc*100.0)/100.0+
        "\t"+resultIMC();
    }
}
