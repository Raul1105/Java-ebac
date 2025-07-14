import java.util.*;

public class GerenciadorAluno{
    List<Aluno> lista = new ArrayList<>();
    
    public void buscarAluno(String nome){
        for(Aluno aluno : lista){
            if(aluno.getNome().equalsIgnoreCase(nome)){
              System.out.println(aluno);
            }
        }

    }
    
    public void adicionarAluno(String nome, int idade, double nota){
        lista.add(new Aluno(nome, idade, nota));
        System.out.println("Aluno adicionado com sucesso!");

    }
    
    public void listarAlunos(){
        for(Aluno aluno : lista){
            System.out.println(aluno);
        }
    }
    
    public void removerAluno(String nome){
        lista.removeIf(aluno -> aluno.getNome().equalsIgnoreCase(nome));

        }
        
        
    
    
    public void mediaNotas(){
        double contador = 0;
        double soma = 0;
        double media = 0;
        
        for(Aluno nota : lista){
            soma = soma + nota.getNota();
            contador += 1;
        }
        
        media = soma / contador;
        
        System.out.printf("A soma das notas dos alunos é de %.2f%n", media);
    }
}
