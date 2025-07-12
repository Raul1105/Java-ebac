import java.util.*;

public class GerenciadorTarefa{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		List<Tarefa> tarefas = new ArrayList<>();
		int resposta;
		String descricao;

        do{
            System.out.println("[1] Adicionar tarefa");
            System.out.println("[2] Listar tarefas");
            System.out.println("[3] Concluir tarefa");
            System.out.println("[4] Remover tarefa");
            System.out.println("[5] Listar tarefas concluidas");
            System.out.println("[0] Sair");
            
            System.out.print("Escolha a opção desejada:");
            resposta = s.nextInt();
            s.nextLine();
            
            if(resposta < 0 || resposta > 5){
                System.out.println("Resposta invalida!");
            }
            
            switch(resposta){
                case 1:
                    System.out.println("======Adicionando tarefa======");
                    
                    System.out.print("Digite a tarefa:");
                    descricao = s.nextLine();
                    
                    Tarefa.adicionarTarefa(descricao, tarefas);
                    break;
                case 2:
                    System.out.println("======Listando tarefas======");
                    
                    Tarefa.listarTarefas(tarefas);
                    break;
                case 3:
                    System.out.println("======Concluindo tarefa======");
                    
                    System.out.print("Digite a tarefa concluida:");
                    descricao = s.nextLine();
                    
                    Tarefa.concluirTarefa(descricao, tarefas);
                    break;
                case 4:
                    System.out.println("======Removendo tarefa======");
                    
                    System.out.println("Digite a tarefa para excluir:");
                    descricao = s.nextLine();
                    
                    Tarefa.deletarTarefa(descricao, tarefas);
            }
        } while(resposta != 0);
	}
}
