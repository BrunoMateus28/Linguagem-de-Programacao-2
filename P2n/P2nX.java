import java.util.Scanner;

public class P2nX {
    public static void main(String[] args) {
        String line = null;
        Angulo angulo = new Angulo();
        Scanner scan = new Scanner(System.in);
        if (args.length > 0) {
            fTrigo(args[0]);

        }
        line = scan.nextLine();
        while (!(line).isEmpty()) {
            fTrigo(line);

            line = scan.nextLine();
        }
        scan.close();
    }

    public static void fTrigo(String entrada) {
        Angulo angulo = new Angulo();
        try {
            double anguloRad = angulo.cvtAngulo(Double.parseDouble(entrada));
            if(anguloRad<0 || anguloRad >2*Math.PI){
                throw new Exception("Angulo invalido.");
            }
            System.out.printf("Seno: %.2f\n", angulo.fSeno(anguloRad));
            System.out.printf("Cosseno: %.2f\n", angulo.fCosseno(anguloRad));
            System.out.printf("Tangente: %.2f\n", angulo.fTangente(anguloRad));
            System.out.printf("Cotangente: %.2f\n", angulo.fCotangente(anguloRad));            
        } catch (Exception e) {
            if(e.getMessage()=="Angulo invalido."){
                System.out.println(e.getMessage());
            }
            else{
                System.out.println("Valor deve ser um numero.");
            }
        }
    }
}
