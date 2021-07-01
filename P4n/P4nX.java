import java.util.ArrayList;
import java.util.Scanner;

public class P4nX {
    private ArrayList<Funcionario> funcList;
    private static int n;
    private static Scanner scan = new Scanner(System.in);
    private P4nX(int n){
        funcList = new ArrayList<Funcionario>(n);
    }
    
    public static void main(String[] args) {
        int tentativas=0;
        while(tentativas<3){
            System.out.print("Digite o numero de funcionarios: ");
            try{
                n = Integer.parseInt(scan.nextLine());
                if(n<=0){
                    throw new Exception();
                }
                break;
            }
            catch(Exception ex){
                System.out.println("Entrada deve ser um numero inteiro positivo. "+ (tentativas+1) + " tentativas de 3");
                tentativas++;
            }
        }
            if(tentativas<3){
                P4nX p = new P4nX(n);
                p.entDados();
                p.geraFolha();
            }
    }

    private void entDados() {
        int i=0;
        System.out.println("--- Cadastro Funcionarios ---");
        while(i<n){
            System.out.print("Contratado ou Executivo (c/e)? ");
            String tipo = scan.next();
            if(tipo.equals("c")){
                while(true){
                    try {
                        System.out.print("Nome: ");
                        String nome = scan.next();
                        System.out.print("Codigo: ");
                        String codigo = scan.next();
                        System.out.print("Salario: ");
                        double salario = scan.nextDouble();
                        if(salario<0){
                            throw new Exception();
                        }
                        System.out.print("Numero de Dependentes: ");
                        int dependentes = scan.nextInt();
                        if(dependentes<0){
                            throw new Exception();
                        }
                        funcList.add(new FuncCntrd(nome, codigo, salario, dependentes));
                        i++;
                        break;
                    } catch (Exception e) {
                        System.out.println("Entrada invalida.");
                        scan.nextLine();
                    }

                }
            }
            else if(tipo.equals("e")){
                while(true){
                    try {
                        System.out.print("Nome: ");
                        String nome = scan.next();
                        System.out.print("Codigo: ");
                        String codigo = scan.next();
                        System.out.print("Salario: ");
                        double salario = scan.nextDouble();
                        if(salario<0){
                            throw new Exception();
                        }
                        System.out.print("Numero de Dependentes: ");
                        int dependentes = scan.nextInt();
                        if(dependentes<0){
                            throw new Exception();
                        }
                        System.out.print("Gratificacao: ");
                        double gratificacao = scan.nextDouble();
                        if(gratificacao<0){
                            throw new Exception();
                        }
                        funcList.add(new FuncExct(nome, codigo, salario, dependentes,gratificacao));
                        i++;
                        break;
                    } catch (Exception e) {
                        System.out.println("Entrada invalida.");
                        scan.nextLine();
                    }
                }
            }
            else{
                System.out.println("Tipo invalido!");
            }
        }
        scan.close();
    }

    private void geraFolha() {
        int i=0;
        System.out.println("---Folha Salarial---");
        while(i<n){
            System.out.println(funcList.get(i));
            System.out.println("--------------------");
            i++;
        }
    }
}
