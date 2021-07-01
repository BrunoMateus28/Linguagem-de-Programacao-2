package lp2g12.biblioteca;
import java.io.Serializable;
import java.util.GregorianCalendar;

public class EmprestadoPara implements Serializable{
    GregorianCalendar dataLocacao;
    GregorianCalendar dataDevolucao;
    Integer codigoUsuario;

    protected EmprestadoPara(GregorianCalendar dataLocacao,
    GregorianCalendar dataDevolucao,
    Integer codigoUsuario){
        this.codigoUsuario = codigoUsuario;
        this.dataDevolucao = dataDevolucao;
        this.dataLocacao = dataLocacao;
    }

    public String toString() {
        return "\nCodigo: "+codigoUsuario+" - Data de Devolucao: "+dataDevolucao.get(GregorianCalendar.DAY_OF_MONTH)+"/"+(dataDevolucao.get(GregorianCalendar.MONTH)+1)+"/"+dataDevolucao.get(GregorianCalendar.YEAR)+" - Data de Locacao: "+dataLocacao.get(GregorianCalendar.DAY_OF_MONTH)+"/"+(dataLocacao.get(GregorianCalendar.MONTH)+1)+"/"+dataLocacao.get(GregorianCalendar.YEAR);
    }
}
