import java.util.*;

public class Livro{
    private String titulo;
    private String autor;
    private String genero;
    private int ano;
    
    public Livro(String titulo, String autor, String genero, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ano = ano;
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
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public int getAno(){
        return ano;
    }
    
    public String toString(){
        return String.format("Titulo: %s | Autor: %s | Genero: %s | Ano: %d", titulo, autor, genero, ano);
    }
}
