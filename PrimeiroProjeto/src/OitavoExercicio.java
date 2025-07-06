import java.util.*;

public class OitavoExercicio{
	public static void main(String[] args) {
		exercicioTeste();
	}
	
	public static void exercicioTeste(){
	    
	    Scanner s = new Scanner(System.in);
	    List<Pessoa> nomes = new ArrayList<Pessoa>();
	    String resposta;
	    
	    do{
	        Pessoa nome = new Pessoa();
	        
	        System.out.print("Escreva um nome para adicionar:");
	        String temp = s.nextLine();
	        
	        nome.setNome(temp);
	        
	        nomes.add(nome);
	        
	        System.out.print("Deseja adicionar mais nomes?");
	        resposta = s.nextLine();
	        System.out.println(" ");
	    } while (resposta.equalsIgnoreCase("sim"));
	    
	    System.out.println("*****Nomes digitados*****");
	    
	    for(Pessoa nome : nomes){
	        System.out.println(nome);
	    }
	    
	    Collections.sort(nomes);
	    
	    System.out.println(" ");
	    
	    System.out.println("*****Nomes em ordem alfabetica");
	    
	    for(Pessoa nome : nomes){
	        System.out.print(nome);
	    }
	}
}
