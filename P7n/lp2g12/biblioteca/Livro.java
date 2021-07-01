package lp2g12.biblioteca;
import java.util.GregorianCalendar;
import java.io.Serializable;
import java.util.ArrayList;

public class Livro implements Serializable {
    protected String codigoLivro;
    protected String titulo;
    protected String categoria;
    protected int quantidade;
    protected int emprestados;
    protected ArrayList<EmprestadoPara> historico;
    public Livro(String codigoLivro,String titulo,String categoria,int quantidade,int emprestados){
        this.codigoLivro = codigoLivro;
        this.titulo = titulo;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.emprestados = emprestados;
        historico = new ArrayList<>();
    }


    protected Livro(String titulo){
        this.titulo = titulo;
    }

    protected void empresta() throws CopiaNaoDisponivelEx{
            if(emprestados==quantidade){
                throw new CopiaNaoDisponivelEx("Todas as copias estao emprestadas.");
            }
            emprestados++;
    }
    protected void devolve() throws NenhumaCopiaEmprestadaEx{
            if(emprestados==0){
                throw new NenhumaCopiaEmprestadaEx("Nenhuma copia a ser devolvida.");
            }
            emprestados--;
    }

    protected void addUsuarioHist(GregorianCalendar dataLocacao, GregorianCalendar dataDevolucao, Integer codigoUsuario){
        //Para testar multa! adiciona 15 ao dia da devolucao, já que a multa é para 14 dias!
        //dataDevolucao.add(5, 15);
        EmprestadoPara emprestadoPara = new EmprestadoPara(dataLocacao,dataDevolucao,codigoUsuario);
        historico.add(emprestadoPara);
    }

    public String toString() {
        return "Codigo: "+codigoLivro+"\nTitulo: "+titulo+
        "\nCategoria: "+categoria+"\nQuantidade: "+quantidade+"\nEmprestados: "+emprestados+
        "\nHistorico: "+historico;
    }
}
