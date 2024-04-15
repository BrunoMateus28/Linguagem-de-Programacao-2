import java.util.Scanner;

public class P6nX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);       
        MinhaListaOrdenavel lista = new MinhaListaOrdenavel();
        int modo,ordenacao;
        lista.add(new Homem("Bruno","28/08/2000",65.6,1.71));
        lista.add(new Mulher("Anna","14/02/1993",55.7,1.51));
        lista.add(new Mulher("Laura","23/05/1999",60,1.65));
        lista.add(new Mulher("Sophia","01/09/2005",45.9,1.65));
        lista.add(new Homem("Yuri","12/07/2001",57.8,1.55));
        lista.add(new Mulher("Valentina","13/11/1965",64.3,1.65));
        lista.add(new Homem("Davi","25/04/1990",100,1.75));
        lista.add(new Homem("Samuel","22/07/2003",20,1.80));
        lista.add(new Mulher("Julia Maria","17/10/2001",53,1.71));
        lista.add(new Homem("Lorenzo","05/10/1987",57,1.76));
        while(true){
            System.out.println("Escolha o modo:\n1.Imprimir\n2.Sair");
            try {
                modo = Integer.parseInt(scan.nextLine());
                if(modo==1){
                    System.out.println("Escolha o modo de ordenacao\n1.Nome (A-Z)\n2.Nome (Z-A)\n3.Peso (crescente)\n4.Peso (decrescente)\n5.Altura\n6.IMC\n7.Sexo");
                        ordenacao = Integer.parseInt(scan.nextLine());
                        if(ordenacao==1){
                            lista.ordena(1);
                            for(int i = 0; i<10;i++){
                                System.out.println(lista.get(i));
                            }
                        }
                        if(ordenacao==2){
                            lista.ordena(2);
                            for(int i = 0; i<10;i++){
                                System.out.println(lista.get(i));
                            }
                        }
                        if(ordenacao==3){
                            lista.ordena(3);
                            for(int i = 0; i<10;i++){
                                System.out.println(lista.get(i));
                            }
                        }
                        if(ordenacao==4){
                            lista.ordena(4);
                            for(int i = 0; i<10;i++){
                                System.out.println(lista.get(i));
                            }
                        }
                        if(ordenacao==5){
                            lista.ordena(5);
                            for(int i = 0; i<10;i++){
                                System.out.println(lista.get(i));
                            }
                        }
                        if(ordenacao==6){
                            lista.ordena(6);
                            for(int i = 0; i<10;i++){
                                System.out.println(lista.get(i));
                            }
                        }
                        if(ordenacao==7){
                            lista.ordena(7);
                            for(int i = 0; i<10;i++){
                                System.out.println(lista.get(i));
                            }
                        }
                        if(ordenacao==8){
                            lista.ordena(8);
                            for(int i = 0; i<10;i++){
                                System.out.println(lista.get(i));
                            }
                        }
                }
                if(modo==2){
                    break;
                }
                else{
                    System.out.println("Escolha um modo valido.");
                }
                modo=0;ordenacao=0;
            } catch (Exception e) {
                System.out.println("Valor deve ser um numero.");
            }
            
        }
        scan.close();
    }
}
