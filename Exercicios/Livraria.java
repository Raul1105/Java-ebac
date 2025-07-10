import java.util.*;

public class Livraria{
	public static void main(String[] args) {
	    
	    Scanner s = new Scanner(System.in);
	    
	    String titulo;
	    String autor;
	    int ano;
	    int resposta;
		
		List<Livro> livros = new ArrayList<>();
		
		do{
		    System.out.println("[1] Adicionar livro");
		    System.out.println("[2] Listar livros");
		    System.out.println("[3] Emprestar livro");
		    System.out.println("[4] Devolver livro");
		    System.out.println("[5] Remover livro");
		    System.out.println("[6] Buscar livro");
		    System.out.println("[0] Sair");
		    
		    System.out.print("Escolha a opção desejada:"); 
		    resposta = s.nextInt();
		    s.nextLine();
		    
		    if(resposta < 0 || resposta > 6){
		        System.out.println("Opção invalida!");
		    }
		    
		    switch(resposta){
		        case 1:
		            
		            System.out.println("======Adicionando livro======");
		            
		            System.out.print("Digite o titulo:");
		            titulo = s.nextLine();
		            
		            
		            System.out.print("Digite o autor:");
		            autor = s.nextLine();

		            
		            System.out.print("Digite o ano:");
		            ano = s.nextInt();
		            s.nextLine();
		            
		            Livro.adicionarLivro(titulo, autor, ano, livros);
		            break;
	            case 2:
	                System.out.println("======Listando livros======");
	                
	                Livro.listarLivros(livros);
	                break;
                case 3:
                    System.out.println("======Emprestando livro======");
                    
                    System.out.print("Digite o livro para emprestar:");
                    titulo = s.nextLine();
                    
                    Livro.emprestarLivro(titulo, livros);
                    break;
                case 4:
                    System.out.println("======Emprestando livro======");
                    
                    System.out.print("Digite o livro para devolver:");
                    titulo = s.nextLine();
                    
                    Livro.devolverLivro(titulo, livros);
                    break;
                case 5:
                    System.out.println("======Removendo livro======");
                    
                    System.out.print("Digite o livro que deseja remover:");
                    titulo = s.nextLine();
                    
                    Livro.removerLivro(titulo, livros);
                    break;
                case 6:
                    System.out.println("======Buscando livro======");
                    
                    System.out.print("Digite o livro que você busca:");
                    titulo = s.nextLine();
                    
                    Livro.buscarLivro(titulo, livros);
                    break;
		    }
		    
		    
		} while(resposta != 0);
		
		for(Livro livro : livros){
		    System.out.println(livro.getTitulo());
		}
	}
}
