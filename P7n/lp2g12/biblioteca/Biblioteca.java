package lp2g12.biblioteca;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.GregorianCalendar;
import java.util.Hashtable;

public class Biblioteca {
    public Hashtable<Integer, Usuario> cadastroUsuario;
    public Hashtable<String, Livro> cadastroLivro;

    public Biblioteca(){
        cadastroLivro = new Hashtable<>();
        cadastroUsuario = new Hashtable<>();
    }

    public Biblioteca(String usuario, String livro){
        cadastroLivro = new Hashtable<String, Livro>();
        cadastroUsuario = new Hashtable<Integer, Usuario>();
        try {
            FileInputStream fileInUsuario = new FileInputStream(usuario);
            ObjectInputStream inUsuario = new ObjectInputStream(fileInUsuario);
            cadastroUsuario = (Hashtable)inUsuario.readObject();
            inUsuario.close();
            fileInUsuario.close();
            FileInputStream fileInLivro = new FileInputStream(livro);
            ObjectInputStream inLivro = new ObjectInputStream(fileInLivro);
            cadastroLivro = (Hashtable)inLivro.readObject();
            inLivro.close();
            fileInLivro.close();    
        } catch (Exception e) {
            new Biblioteca();
        }
    }

    public void cadastroUsuario(Usuario usuario){
        cadastroUsuario.put(usuario.codigoUsuario,usuario);
    }

    public void cadastroLivro(Livro livro){
        cadastroLivro.put(livro.codigoLivro,livro);
    }

    public void emprestaLivro(Usuario usuario, Livro livro){
        if(usuario.possuiLivro==1){
            System.out.println("Ja possui livro emprestado. So pode um livro por vez.");
        }
        else{
            try {
                livro.empresta();
                usuario.possuiLivro=1;
                usuario.addLivroHist(new GregorianCalendar(),livro.codigoLivro);
                System.out.println("Livro:\n"+cadastroLivro.get(livro.codigoLivro)+"\n\nEmprestado para:\n"+cadastroUsuario.get(usuario.codigoUsuario));
            }catch(Exception copiaNaoDisponiveException){
                System.out.println(copiaNaoDisponiveException.getMessage());
            }
        }
    }
    
    public void devolveLivro(Usuario usuario, Livro livro){
        if(usuario.possuiLivro==0){
            System.out.println("Nao possui livro para devolver.");
        }
        else{
            try {
                livro.devolve();
                usuario.possuiLivro = 0;
                GregorianCalendar dataDevolucao = new GregorianCalendar();
                livro.addUsuarioHist(usuario.historico.get(usuario.historico.size() - 1).dataLocacao, dataDevolucao, usuario.codigoUsuario);
                System.out.println("Usuario:\n"+cadastroUsuario.get(usuario.codigoUsuario)+"\n\nDevolveu:\n"+cadastroLivro.get(livro.codigoLivro));
                livro.historico.get(livro.historico.size() - 1).dataLocacao.add(5, 14);
                if((livro.historico.get(livro.historico.size() - 1)).dataLocacao.compareTo(dataDevolucao)<0){
                    System.out.println("\n\nDeve pagar multa!\n\n");
                }
                else{
                    System.out.println("\n\nSem multa!\n\n");
                }
            }catch(Exception NenhumaCopiaEmprestadaEx){
                System.out.println(NenhumaCopiaEmprestadaEx.getMessage());
            }
        }
    }

    public Livro getLivro(String codigo) throws LivroNaoCadastradoEx{
        Livro livro = cadastroLivro.get(codigo);
        if(livro==null){
            throw new LivroNaoCadastradoEx();
        }
        return livro;

    }
    public Usuario getUsuario(Integer codigo) throws UsuarioNaoCadastradoEx{
        Usuario usuario = cadastroUsuario.get(codigo);
        if(usuario==null){
            throw new UsuarioNaoCadastradoEx();
        }
        return usuario;
    }
}
