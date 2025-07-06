public class Pessoa implements Comparable<Pessoa>{
    
    private String nome;
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public Pessoa(){
        
    }
    
    public void setNome(String nome){ this.nome = nome; }
    
    public String getNome(){ return nome; }
    
    
    public int compareTo(Pessoa pessoa){
        return this.nome.compareTo(pessoa.getNome());
        }
        
    public String toString(){
        return nome;
    }
}
