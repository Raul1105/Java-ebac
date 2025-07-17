import java.util.*;

public class Biblioteca {
	List<Livro> lista = new ArrayList<>();

	public boolean achouTitulo(String titulo) {
		for(Livro livro : lista) {
			if(livro.getTitulo().equalsIgnoreCase(titulo)) {
				return true;
			}
		}

		return false;
	}
	
	public boolean achouGenero(String genero){
	    for(Livro livro : lista){
	        if(livro.getGenero().equalsIgnoreCase(genero)){
	            return true;
	        }
	    }
	    
	    return false;
	}

	public void adicionarLivro(String titulo, String autor, String genero, int ano) {

		boolean achou = achouTitulo(titulo);

		if(achou) {
			System.out.printf("Livro %s ja existe!%n", titulo);
		} else {
			lista.add(new Livro(titulo, autor, genero, ano));
			System.out.println("Livro adicionado com sucesso!");
		}
	}


	public void listarLivros() {
		for(Livro livro : lista) {
			System.out.println(livro);
		}
	}

	public void buscarLivro(String titulo) {

		boolean achou = achouTitulo(titulo);

		if(achou) {
			for(Livro livro : lista) {
				if(livro.getTitulo().contains(titulo)) {
					System.out.println(livro);
				}
			}
		} else {
		    System.out.printf("Livro %s não existe!%n", titulo);
		}


	}

	public void listarGenero(String genero) {
		boolean achou = achouGenero(genero);
		int quantidade = 0;
		
		if(achou){
		    for(Livro livro : lista){
		        if(livro.getGenero().equalsIgnoreCase(genero)){
		            System.out.println(livro);
		            quantidade ++;
		        }
		    }
		} else {
		    System.out.printf("Não existe nenhum livro do genero %s", genero);
		}
		
		System.out.printf("Possui %d livros do genero %s", quantidade, genero);
	}
	
	public void removerLivro(String titulo){
	    
	    boolean achou = achouTitulo(titulo);
	    
	    if(achou){
	        lista.removeIf(i -> i.getTitulo().equalsIgnoreCase(titulo));
	    } else {
	        System.out.printf("Livro %s não existe!", titulo);
	    }
	}


}
