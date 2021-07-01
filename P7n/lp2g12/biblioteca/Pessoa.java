package lp2g12.biblioteca;
import java.io.Serializable;
import java.util.GregorianCalendar;

public class Pessoa implements Serializable{
    protected String nome;
    protected GregorianCalendar dataNasc;

    public Pessoa(String nome, int dia, int mes, int ano){
        this.nome = nome;
        this.dataNasc = new GregorianCalendar(ano,mes,dia);
    }

    public String toString(){
        return "Nome: "+nome+"\nData de Nascimento: "+dataNasc.get(GregorianCalendar.DAY_OF_MONTH)+"/"+dataNasc.get(GregorianCalendar.MONTH)+"/"+dataNasc.get(GregorianCalendar.YEAR)+"\n";
    }
}
