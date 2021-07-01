import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class MinhaListaOrdenavel{
    ArrayList<PessoaIMC> listaOrdenada = new ArrayList();
    public void add(PessoaIMC p){
        listaOrdenada.add(p);
    }

    public int getTamanho(){
        return listaOrdenada.size();
    }

    public PessoaIMC get(int i){
        return listaOrdenada.get(i);
    }

    public Comparator NomeC = new Comparator(){
        public int compare(Object p1, Object p2){
            PessoaIMC pf1 = (PessoaIMC) p1;
            PessoaIMC pf2 = (PessoaIMC) p2;
            return pf1.getNome().compareTo(pf2.getNome());
        }
    };

    public Comparator DataC = new Comparator(){
        public int compare(Object p1, Object p2){
            PessoaIMC pf1 = (PessoaIMC) p1;
            PessoaIMC pf2 = (PessoaIMC) p2;
            String data1[] = pf1.getData().split("/");
            String data2[] = pf2.getData().split("/"); 
            int somaData1 = Integer.parseInt(data1[0]) + (Integer.parseInt(data1[1])-1)*30 + (((Integer.parseInt(data1[2])-1)*365));
            int somaData2 = Integer.parseInt(data2[0]) + (Integer.parseInt(data2[1])-1)*30 + (((Integer.parseInt(data2[2])-1)*365));
            return somaData1 - somaData2;
        }
    };

    public Comparator PesoC = new Comparator(){
        public int compare(Object p1, Object p2){
            PessoaIMC pf1 = (PessoaIMC) p1;
            PessoaIMC pf2 = (PessoaIMC) p2;
            return (int)Math.round(pf1.getPeso()*100-pf2.getPeso()*100);
        }
    };

    public Comparator AlturaC = new Comparator(){
        public int compare(Object p1, Object p2){
            PessoaIMC pf1 = (PessoaIMC) p1;
            PessoaIMC pf2 = (PessoaIMC) p2;
            return (int)Math.round(pf1.getAltura()*100-pf2.getAltura()*100);
        }
    };

    public Comparator IMCC = new Comparator(){
        public int compare(Object p1, Object p2){
            PessoaIMC pf1 = (PessoaIMC) p1;
            PessoaIMC pf2 = (PessoaIMC) p2;
            return (int)Math.round((pf1.calculaIMC(pf1.getAltura(), pf1.getPeso())*100)-(pf2.calculaIMC(pf2.getAltura(), pf2.getPeso())*100));
        }
    };

    public Comparator SexoC = new Comparator(){
        public int compare(Object p1, Object p2){
            PessoaIMC pf1 = (PessoaIMC) p1;
            return (pf1.getSexo().equals("Homem")?1:-1);
        }
    };

    public ArrayList ordena(int criterio){
        switch(criterio){
            case 1:
                Collections.sort(listaOrdenada, NomeC);
                break;
            case 2:
                Collections.sort(listaOrdenada, NomeC.reversed());
                break;
            case 3:
                Collections.sort(listaOrdenada, PesoC);
                break;
            case 4:
                Collections.sort(listaOrdenada, PesoC.reversed());
                break;
            case 5:
                Collections.sort(listaOrdenada, AlturaC);
                break;
            case 6:
                Collections.sort(listaOrdenada, AlturaC.reversed());
                break;
            case 7:
                Collections.sort(listaOrdenada, IMCC);
                break;
            case 8:
                Collections.sort(listaOrdenada, IMCC.reversed());
                break;
            case 9:
                Collections.sort(listaOrdenada, SexoC);
                break;
            case 10:
                Collections.sort(listaOrdenada, SexoC.reversed());
                break;
            case 11:
                Collections.sort(listaOrdenada, DataC);
                break;
            case 12:
                Collections.sort(listaOrdenada, DataC.reversed());
                break;
            }
        return this.listaOrdenada;
    }
}
