import java.util.*;

public class Main{
	public static void main(String[] args) {
		Biblioteca livro = new Biblioteca();
		
		livro.adicionarLivro("Harry Potter", "JK", "Fantasia", 2005);
		livro.buscarLivro("Harry");
	}
}
