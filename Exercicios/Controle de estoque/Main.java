import java.util.*;

public class Main{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		ProdutoGerenciador gerenciador = new ProdutoGerenciador();
		String nome;
		double preco;
		int quantidade;
		int opcao;
		
		do{
		    System.out.println("[1] Adicionar produto");
		    System.out.println("[2] Listar produtos");
		    System.out.println("[3] Buscar produto por nome");
		    System.out.println("[4] Atualizar quantidade");
		    System.out.println("[5] Remover produto");
		    System.out.println("[6] Calcular valor total do estoque!");
		    System.out.println("[0] Sair");
		    System.out.print("Digite a opção:");
		    opcao = s.nextInt();
		    s.nextLine();
		    
		    switch(opcao){
		        case 1:
		            System.out.println("========Adicionando produto========");
		            
		            System.out.print("Insira o nome:");
		            nome = s.nextLine();
		            System.out.print("Insira o preço:");
		            preco = s.nextDouble();
		            s.nextLine();
		            System.out.print("Insira a quantidade:");
		            quantidade = s.nextInt();
		            s.nextLine();
		            
		            gerenciador.adicionarProduto(nome, preco, quantidade);
		            
		            System.out.println("===================================");
		            break;
	            case 2:
	                System.out.println("========Listando produtos========");
	                
	                gerenciador.listarProdutos();
	                
	                System.out.println("===================================");
	                break;
                case 3:
                    System.out.println("========Buscando produto========");
                    
                    System.out.print("Digite o produto a ser buscado:");
                    nome = s.nextLine();
                    
                    gerenciador.buscarPorNome(nome);
                    
                    System.out.println("===================================");
                    break;
                case 4:
                    System.out.println("========Atualizando quantidade========");
                    
                    System.out.print("Qual produto deseja atualizar?");
                    nome = s.nextLine();
                    
                    System.out.print("Qual a quantidade:");
                    quantidade = s.nextInt();
                    s.nextLine();
                    
                    gerenciador.atualizarQuantidade(nome, quantidade);
                    
                    System.out.println("===================================");
                    break;
                case 5:
                    System.out.println("========Removendo produto========");
                    
                    System.out.print("Qual produto deseja excluir:");
                    nome = s.nextLine();
                    
                    gerenciador.removerProduto(nome);
                    
                    System.out.println("===================================");
                    break;
                case 6:
                    System.out.println("========Calculando valor do estoque========");
                    
                    gerenciador.calcularEstoque();
                    
                    System.out.println("===================================");
                    break;
		    }
		    
		} while (opcao != 0);
		
	}
}
