import java.util.List;
import java.util.ArrayList;

public class TerceiroExercicio{
	public static void main(String[] args) {
		executando();
		
	}
	
	public static void executando(){
	    List<TEPessoas> pessoas = new ArrayList<TEPessoas>();
	    
	    pessoas.add(new Pessoas("Raul", "masculino"));
	    pessoas.add(new Pessoas("Larissa", "feminino"));
	    pessoas.add(new Pessoas("Elisete","feminino"));
	    pessoas.add(new Pessoas("Jose","masculino"));
	    pessoas.add(new Pessoas("Lorena", "feminino"));
	    
	    List<TEPessoas> mulheres = new ArrayList<Pessoas>();
	    List<TEPessoas> homens = new ArrayList<Pessoas>();
	    
	    for(TEPessoas pessoa : pessoas){
	        if(pessoa.getSexo().equals("feminino")){
	            mulheres.add(pessoa);
	        }
	    }
	    
	    for(TEPessoas pessoa : pessoas){
	        if(pessoa.getSexo().equals("masculino")){
	            homens.add(pessoa);
	        }
	    }
	    
	    System.out.println("Os homens são: " + homens);
	    
	    System.out.println("As mulheres são: " + mulheres);
	    
	}
}
