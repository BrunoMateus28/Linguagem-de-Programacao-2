import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import lp2g12.biblioteca.*;

public class P7nX {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("usuarios.txt", "livros.txt");
         while(true){
            System.out.println("Escolha o modo:\n1.Cadastrar.\n2.Ver relatorio.\n3.Para realizar um emprestimo ou uma devolucao.\n(Digite qualquer outra coisa para sair.)");
            String menu = scan.nextLine();
            if(menu.equals("1")){
                 cadastro(biblioteca);
            }
            else if(menu.equals("2")){
                System.out.println("Escolha o relatorio:\n1.Usuarios\n2.Livros\n3.Usuario especifico\n4.Livro especifico\n(Digite qualquer outra coisa para voltar.)");
                String modo = scan.nextLine();
                if(modo.equals("1")||modo.equals("2")||modo.equals("3")||modo.equals("4")){
                    int relatorioModo=Integer.parseInt(modo);
                    relatorio(relatorioModo,biblioteca);
                }
            }
            else if(menu.equals("3")){
                System.out.println("Escolha o modo:\n1.Emprestimo\n2.Devolucao.\n(Digite qualquer outra coisa para voltar.)");
                String modo = scan.nextLine();
                if(modo.equals("1")||modo.equals("2")){
                    int emprestimoMode=Integer.parseInt(modo);
                    System.out.print("Insira o codigo do usuario: ");
                    int codigoUsuario = Integer.parseInt(scan.nextLine());
                    System.out.print("Insira o codigo do livro: ");
                    String codigoLivro = scan.nextLine();
                    emprestimo(biblioteca,emprestimoMode,codigoUsuario,codigoLivro);
                }
            }
            else{
                break;
            }
        }
        scan.close();
    }
    
    private static void cadastro(Biblioteca biblioteca) {
        while(true){
            System.out.println("Escolha o modo:\n1.Cadastrar usuario.\n2.Cadastrar livro.\n3.Salvar em arquivo.\n(Caso deseje voltar, digite qualquer outra coisa.)");
            String modo = scan.nextLine();
            if(modo.equals("1")){
                while(true){
                    try {
                        System.out.println("Digite o nome do usuario:");
                        String nome = scan.nextLine();
                        System.out.println("Digite o dia de nascimento do usuario:");
                        int dia = Integer.parseInt(scan.nextLine());
                        System.out.println("Digite o mes de nascimento do usuario:");
                        int mes = Integer.parseInt(scan.nextLine());
                        System.out.println("Digite o ano de nascimento do usuario:");
                        int ano = Integer.parseInt(scan.nextLine());
                        System.out.println("Digite o endereco do usuario:");
                        String endereco = scan.nextLine();
                        System.out.println("Digite o codigo do usuario:");
                        int codigoUsuario = Integer.parseInt(scan.nextLine());
                        Usuario usuario = new Usuario(nome, dia, mes, ano, endereco, codigoUsuario);
                        biblioteca.cadastroUsuario(usuario);
                        break;
                    } catch (Exception e) {
                        System.out.println("Valor invalido, digite os dados novamente.");
                    }
                }
            }
            else if(modo.equals("2")){
                while(true){
                    try {
                        System.out.println("Digite o codigo do livro:");
                        String codigoLivro = scan.nextLine(); 
                        System.out.println("Digite o titulo do livro:");
                        String titulo = scan.nextLine();
                        System.out.println("Digite a categoria do livro:");
                        String categoria = scan.nextLine();
                        System.out.println("Digite a quantidade de livros:");
                        int quantidade = Integer.parseInt(scan.nextLine());
                        System.out.println("Digite digite a quantidade de livros emprestados:");
                        int emprestados = Integer.parseInt(scan.nextLine());
                        Livro livro = new Livro(codigoLivro, titulo, categoria, quantidade, emprestados);
                        biblioteca.cadastroLivro(livro);
                        break;
                    } catch (Exception e) {
                        System.out.println("Dado invalido, digite novamente.");
                    }
                }
            }
            else if(modo.equals("3")){
                System.out.println("Escolha o modo:\n1.Salvar cadastro de usuarios.\n2.Salvar cadastro de livros.\n3.Salvar os dois.\n(Caso deseje voltar, digite qualquer outra coisa.)");
                String modoSalvar = scan.nextLine();
                if(modoSalvar.equals("1")){
                    manutencao(1,biblioteca);
                }
                else if(modoSalvar.equals("2")){
                    manutencao(2,biblioteca);
                }
                else if(modoSalvar.equals("3")){
                    manutencao(3,biblioteca);
                }
            }
            else{
                break;
            }
        }
    }

    private static void manutencao(int tipo,Biblioteca biblioteca){
        if(tipo==1||tipo==3){

            try {
                FileOutputStream usuarioOut = new FileOutputStream("usuarios.txt");
                ObjectOutputStream usuario = new ObjectOutputStream(usuarioOut);
                
                usuario.writeObject(biblioteca.cadastroUsuario);
                
                usuario.close();
                usuarioOut.close();
            } catch (Exception e) {
                System.out.println("Não foi possivel escrever no arquivo.");
            }
        }
        if(tipo==2||tipo==3){
            try {
                FileOutputStream livroOut = new FileOutputStream("livros.txt");
                ObjectOutputStream livro = new ObjectOutputStream(livroOut);
                livro.writeObject(biblioteca.cadastroLivro);
                livro.close();
                livroOut.close();
            } catch (Exception e) {
                System.out.println("Não foi possivel escrever no arquivo.");
            }
        }
    }

    private static void relatorio(int tipoRelatorio, Biblioteca biblioteca){
        if(tipoRelatorio==1){
            for(int key: biblioteca.cadastroUsuario.keySet()){
                try {
                    Usuario usuario = biblioteca.getUsuario(key);
                    System.out.println(usuario);    
                } catch (UsuarioNaoCadastradoEx ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        if(tipoRelatorio==2){
            for(String key: biblioteca.cadastroLivro.keySet()){
                try {
                    Livro livro = biblioteca.getLivro(key);
                    System.out.println(livro);
                } catch (LivroNaoCadastradoEx ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        if(tipoRelatorio==3){
            System.out.println("Digite o codigo do usuario que deseja: ");
            try {
                int key =Integer.parseInt(scan.nextLine());
                Usuario usuario = biblioteca.getUsuario(key);
                System.out.println(usuario);
            }catch(UsuarioNaoCadastradoEx ex){
                    System.out.println(ex.getMessage());
                }
            catch (Exception e) {
                System.out.println("Valor deve ser um numero.");
            }

        }
        if(tipoRelatorio==4){
            System.out.println("Digite o codigo do livro que deseja: ");
            try {
                String key = scan.nextLine();
                Livro livro = biblioteca.getLivro(key); 
                System.out.println(livro);
            } catch (LivroNaoCadastradoEx ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static void emprestimo(Biblioteca biblioteca,int tipo,int codigoUsuario,String codigoLivro){
        try {
            Usuario usuario = biblioteca.getUsuario(codigoUsuario);
            Livro livro = biblioteca.getLivro(codigoLivro);
            if(tipo==1){
                biblioteca.emprestaLivro(usuario, livro);
                manutencao(3,biblioteca);
            }
            else if(tipo==2){
                biblioteca.devolveLivro(usuario, livro);
                manutencao(3,biblioteca);
            }
            else{
                System.out.println("Tipo invalido.");
            }
        } catch (UsuarioNaoCadastradoEx ex) {
            System.out.println(ex.getMessage());
        }
        catch (LivroNaoCadastradoEx ex) {
            System.out.println(ex.getMessage());
        }
    }
}
