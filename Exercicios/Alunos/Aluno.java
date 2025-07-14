import java.util.*;

public class Aluno{
    private String nome;
    private int idade;
    private double nota;
    
    public Aluno(String nome, int idade, double nota){
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
    
    public Aluno(){
        
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setNota(double nota){
        this.nota = nota;
    }
    
    public double getNota(){
        return nota;
    }
    
    public String toString(){
        return String.format("Aluno: %s | Idade: %d | Nota: %.2f", nome, idade, nota);
    }
    
}
