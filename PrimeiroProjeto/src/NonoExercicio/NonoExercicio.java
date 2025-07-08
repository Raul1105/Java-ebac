import java.util.*;

public class NonoExercicio{
	public static void main(String[] args) {
		exercicio9();
	}
	
	public static void exercicio9(){
	    String[] nomes = {"Raul - masculino", "Larissa - feminino", "Lorena - feminino", "Velton - masculino"};
		List<Pessoas> pessoas = new ArrayList<>();
		
		for(String pessoa : nomes){
		    String[] partes = pessoa.split(" - ");
		    pessoas.add(new Pessoas(partes[0], partes[1]));
		}
		
		for(Pessoas pessoa : pessoas){
		    System.out.println("Nome:" + pessoa.getNome() + " sexo:" + pessoa.getSexo());
		}
	}
}
