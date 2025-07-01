public class Aluno1 implements Comparable<Aluno1>{
    
    private String nome;
    private String curso;
    private double nota;
    private String sala;
    
    public Aluno(String nome, String curso, double nota){
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
        
    }
    
    public Aluno(String nome, String curso, double nota, String sala){
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
        this.sala = sala;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void SetCurso(String curso){
        this.curso = curso;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public void setNota(double nota){
        this.nota = nota;
    }
    
    public double getNota(){
        return nota;
    }
    
    public void setSala(String sala){
        this.sala = sala;
    }
    
    public String getSala(){
        return sala;
    }
    
    public String toString(){
        return "\nAluno:" + nome + " Curso:" + curso + " Nota:" + nota + "\n";
    
    }
    
    public int compareTo(Aluno1 aluno){
        return this.nome.compareTo(aluno.getNome());
    }
}
