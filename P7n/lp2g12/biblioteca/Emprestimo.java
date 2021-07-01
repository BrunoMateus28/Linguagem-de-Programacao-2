package lp2g12.biblioteca;
import java.io.Serializable;
import java.util.GregorianCalendar;

public class Emprestimo implements Serializable{
    GregorianCalendar dataLocacao;
    String codigoLivro;
    protected Emprestimo(String codigoLivro,GregorianCalendar dataLocacao){
        this.codigoLivro = codigoLivro;
        this.dataLocacao = dataLocacao;
    }

    public GregorianCalendar getData(){
        return dataLocacao;
    }
    public String toString() {
        return "\nCodigo: "+codigoLivro+" - Data de Locacao: "+dataLocacao.get(GregorianCalendar.DAY_OF_MONTH)+"/"+(dataLocacao.get(GregorianCalendar.MONTH)+1)+"/"+dataLocacao.get(GregorianCalendar.YEAR);
    }
}

