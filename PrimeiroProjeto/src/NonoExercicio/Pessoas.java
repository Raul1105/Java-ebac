public class Pessoas{
    private String nome;
    private String sexo;
    
    public Pessoas(String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
    }
    
    public Pessoas(){
        
    }
    
    public void setNome(String nome){ this.nome = nome; }
    
    public String getNome(){ return nome; }
    
    public void setSexo(String sexo){ this.sexo = sexo; }
    
    public String getSexo(){ return sexo; }
    
    public String toString(){
        return nome;
    }
    
}
