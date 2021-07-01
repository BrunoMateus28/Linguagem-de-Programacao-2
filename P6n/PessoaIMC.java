public abstract class PessoaIMC extends Pessoa{
    private double peso;
    private double altura;
    public String sexo;
    public PessoaIMC(String nome, String dataNascimento,double peso,double altura,String sexo) {
        super(nome,dataNascimento);
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        }

    public double getPeso(){
        return peso;
    }

    public String getSexo(){
        return sexo;
    }

    public double getAltura(){
        return altura;
    }

    public double calculaIMC(double altura, double peso){
        return peso/(altura*altura);
    }

    public abstract String resultIMC();

    @Override
    public String toString(){
        return super.toString() + "\nPeso: "+ getPeso() +
        "\nAltura: "+getAltura();
    }
}
