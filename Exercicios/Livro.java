import java.util.*;

public class Livro{
    private String titulo;
    private String autor;
    private int ano;
    private boolean emprestado;
    
    public Livro(String titulo, String autor, int ano, boolean emprestado){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = emprestado;
    }
    
    public Livro(){
        
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setEmprestado(boolean emprestado){
        this.emprestado = emprestado;
    }
    
    public boolean isEmprestado(){
        return emprestado;
    }
    
    public String toString(){
        return String.format("Livro:%s%nAutor:%s%nAno:%d%nEmprestado:%b%n", titulo, autor, ano, emprestado);
    }
    
    public static void adicionarLivro(String titulo, String autor, int ano, List<Livro> lista){
        
        
        
        Livro livro = new Livro(titulo, autor, ano, false);
        lista.add(livro);
        System.out.printf("Livro %s adicionado com sucesso!%n", titulo);
        System.out.println("==========================================");
    }
    
    public static void listarLivros(List<Livro> lista){
        
        
        for(Livro livro : lista){
            System.out.println(livro);
        }
        System.out.println("==========================================");
    }
    
    public static void emprestarLivro(String titulo, List<Livro> lista){
        
        for(Livro livro : lista){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                livro.setEmprestado(true);
                System.out.printf("Você emprestou o livro:%s%n", livro.getTitulo());
            }
        }
    }
    
    public static void devolverLivro(String titulo, List<Livro> lista){
        
        for(Livro livro : lista){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                if(livro.isEmprestado() == false){
                    System.out.printf("Não é possivel devolver o livro %s, pois não esta emprestado!", livro.getTitulo());
                } else {
                    System.out.printf("Livro %s devolvido!%n", livro.getTitulo());
                    livro.setEmprestado(false);
                }
            }
        }
    }
    
    public static void removerLivro(String titulo, List<Livro> lista){

        
        lista.removeIf(livro -> livro.getTitulo().equalsIgnoreCase(titulo));
    }
    
    public static void buscarLivro(String titulo, List<Livro> lista){
        
        for(Livro livro : lista){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println(livro);
            }
        }
    }
}




