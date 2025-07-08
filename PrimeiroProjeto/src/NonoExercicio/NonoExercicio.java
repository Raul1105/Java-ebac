import java.util.*;

public class NonoExercicio{
	public static void main(String[] args) {
		exercicio9();
	}
	
	public static void exercicio9(){
	    String[] nomes = {"Raul - masculino", "Larissa - feminino", "Lorena - feminino", "Joao - masculino"};
		List<Pessoas> pessoas = new ArrayList<>();
		
		for(String pessoa : nomes){
		    String[] partes = pessoa.split(" - ");
		    pessoas.add(new Pessoas(partes[0], partes[1]));
		}
		
		for(Pessoas pessoa : pessoas){
		    System.out.println("Nome:" + pessoa.getNome() + " sexo:" + pessoa.getSexo());
		}
		
		List<Pessoas> homens = new ArrayList<>();
    	List<Pessoas> mulheres = new ArrayList<>();
    	
    	for(Pessoas pessoa : pessoas){
    	    if(pessoa.getSexo().equals("masculino")){
    	        homens.add(pessoa);
    	    }
    	}
    	
    	for(Pessoas pessoa : pessoas){
    	    if(pessoa.getSexo().equals("feminino")){
    	        mulheres.add(pessoa);
    	    }
    	}
    	
    	System.out.println("***Lista de homens***");
    	
    	for(Pessoas homem : homens){
    	    System.out.println(homem);
    	}
    	
    	System.out.println("***Lista de mulheres");
    	
    	for(Pessoas mulher : mulheres){
    	    System.out.println(mulher);
    	}
	}
	
	
}
