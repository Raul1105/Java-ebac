import java.util.*;

public class Tarefa{
    private String descricao;
    private boolean concluida;
    
    public Tarefa(String descricao, boolean concluida){
        this.descricao = descricao;
        this.concluida = concluida;
    }
    
    public Tarefa(){
        
    }
    
    public void setDescricao(String descricao){
        this.descricao =  descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }
    
    public boolean isConcluida(){
        return concluida;
    }
    
    public String toString(){
        return descricao + concluida;
    }
    
    public static void adicionarTarefa(String descricao, List<Tarefa> lista){
        
        Tarefa tarefa = new Tarefa(descricao, false);
        lista.add(tarefa);
        System.out.println("Nova tarefa adicionada com sucesso!");
        System.out.println("==============================");
    }
    
    public static void listarTarefas(List<Tarefa> lista){
        for(Tarefa tarefa : lista){
            System.out.printf("Tarefa: %s concluida: %b%n", tarefa.getDescricao(), tarefa.isConcluida());
        }
        
        System.out.println("==============================");
    }
    
    public static void concluirTarefa(String descricao, List<Tarefa> lista){
        
        
        for(Tarefa tarefa : lista){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                if(tarefa.isConcluida()){
                    System.out.printf("Tarefa %s ja concluida ou não existe%n", descricao);
                } else {
                    tarefa.setConcluida(true);
                    System.out.printf("Tarefa %s concluida com sucesso%n", tarefa.getDescricao());
                }
            }
        }
        
        System.out.println("==============================");
            
    }
    
    public static void deletarTarefa(String descricao, List<Tarefa> lista){
        
        boolean sucesso = lista.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));
        
        if(sucesso == false){
            System.out.printf("Tarefa %s não existe!%n", descricao);
        } else {
            System.out.printf("Tarefa %s excluida com sucesso%n", descricao);
        }
        
        System.out.println("==============================");
        
    }
    
    public static void listarConcluidas(List<Tarefa> lista){
        for(Tarefa tarefa : lista){
            if(tarefa.isConcluida()){
                System.out.printf("Tarefa: %s%n", tarefa.getDescricao());
            }
        }
        
        System.out.println("==============================");
    }
    
    
}
