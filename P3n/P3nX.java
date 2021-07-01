import java.util.Scanner;

public class P3nX {
    public static void main(String[] args) {
        int n = 0;    
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero de angulos: ");
        String numAng = scan.nextLine();
        try {
            int intAng = Integer.parseInt(numAng);
            if(intAng<1 ){
                throw new Exception("Numero deve ser positivo.");
            }
            else{
                AnguloObj[] angulos = new AnguloObj[intAng];
                while(n!=intAng){
                    System.out.println("Digite a medida em graus do "+(n+1)+" angulo: ");
                    try{
                        String angulo = scan.nextLine();
                        double anguloDouble = Double.parseDouble(angulo);
                        if(anguloDouble>360 || anguloDouble<0){
                            throw new Exception("Numero de angulo invalido.");
                        }
                        else{
                            angulos[n] = new AnguloObj(anguloDouble);
                            n++;
                        }
                    }
                    catch(Exception e){
                        if(e.getMessage()=="Numero de angulo invalido."){
                            System.out.println(e.getMessage());
                        }
                        else{
                            System.out.println("Valor deve ser um numero.");
                        }
                    }
                }
                n=0;
                while(n!=intAng){
                    System.out.println(angulos[n]);
                    n++;
                }
            }
        }
        catch(Exception e){
            if(e.getMessage()=="Numero deve ser positivo."){
                System.out.println(e.getMessage());
            }
            else{
                System.out.println("Valor deve ser um numero inteiro.");
            }
        }
        finally{
            scan.close();
        }
    }
}
