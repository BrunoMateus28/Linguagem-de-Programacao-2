import java.util.ArrayList;
import java.util.Scanner;

public class P5nX {
    public static void main(String[] args) {
        int numeroPessoa;
        String sexo;
        double altura;
        double peso;
        String nome;
        String dataNascimento;
        System.out.println("Digite o numero de pessoas:");
        Scanner scan = new Scanner(System.in);
        numeroPessoa = scan.nextInt();
        ArrayList<Pessoa> pessoas = new ArrayList(numeroPessoa);
        for(int i = 0;i<numeroPessoa;i++){
            System.out.println("Inserir homem (h) ou mulher(m)?");
            sexo = scan.next();
            System.out.println("Digite o nome:");
            nome = scan.next();
            System.out.println("Digite a data de nascimento:");
            dataNascimento = scan.next();
            System.out.println("Digite o peso:");
            peso = scan.nextDouble();
            System.out.println("Digite a altura:");
            altura = scan.nextDouble();
            if(sexo.equals("h")){
                pessoas.add(new Homem(nome,dataNascimento,peso,altura));
            }
            else{
                pessoas.add(new Mulher(nome,dataNascimento,peso,altura));
            }
        }
        scan.close();
        for(int i = 0; i<numeroPessoa;i++){
            System.out.println(pessoas.get(i));
        }
    }
}
