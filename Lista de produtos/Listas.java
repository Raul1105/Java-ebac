import java.util.*;

public class Listas{
	public static void main(String[] args) {
		
		List<Produto> lista = new ArrayList<>();
		
		Produto celular = new Produto("Smartphone", 1200.00, "Eletronico");
		Produto livro = new Produto("Livro Java", 80.00, "Livros");
		Produto geladeira = new Produto("Geladeira", 2300.00, "Eletrodomestico");
		Produto cabo = new Produto("Cabo USB", 25.00, "Eletronico");
		Produto notebook = new Produto("Notebook", 3500.00, "Eletronico");
		
		lista.add(celular);
		lista.add(livro);
		lista.add(geladeira);
		lista.add(cabo);
		lista.add(notebook);
		
		
		
		Produto.comparaPreco(100.00,lista);
		
		Produto.comparaCategoria("Eletronico", lista);
		
		Produto.buscaProduto("Notebook", lista);
		
		Produto.removerProduto("Smartphone", lista);
		
		Produto.verProdutos(lista);
		
		Produto.atualizarProduto("Cabo USB", "Carregador", 50.00, "Acessorio", lista);
		
		Produto.verProdutos(lista);
	}
}
