package lp2g12.biblioteca;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Usuario extends Pessoa {
    protected String endereco;
    protected int codigoUsuario;
    protected ArrayList<Emprestimo> historico;
    protected int possuiLivro = 0;
    public Usuario(String nome, int dia, int mes, int ano,String endereco,int codigoUsuario){
        super(nome, dia,mes,ano);
        this.endereco = endereco;
        this.codigoUsuario = codigoUsuario;
        historico = new ArrayList<>();
    }

    public void addLivroHist(GregorianCalendar dataLocacao,String codigoEmprestimo){
        Emprestimo emprestimo = new Emprestimo(codigoEmprestimo,dataLocacao);
        historico.add(emprestimo);
    }

    public String toString(){
        return super.toString()+"Endereco: "+endereco+"\nCodigo: "+codigoUsuario+"\nHistorico: "+historico+"\n";
    }
}
