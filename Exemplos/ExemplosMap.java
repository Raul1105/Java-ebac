import java.util.Map;
import java.util.HashMap;

public class ExemplosMap{
	public static void main(String[] args) {
	    
	    
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1,"Raul de Souza");
        lista.put(2,"Larissa Santos");
        lista.put(3,"João da Silva");
        
        int tamanho = lista.size();
        
        for(String value : lista.values()){
            System.out.println(value);
        }
        
        for(Integer value : lista.keySet()){
            System.out.println(value);
        }
        
        lista.entrySet().forEach(e -> {
           System.out.print("Chave:" + e.getKey() + " ");
           System.out.println("Valor:" + e.getValue());
        });
        

        lista.entrySet().forEach(e -> {
           System.out.print("Chave:" + e.getKey() + " ");
           System.out.println("Valor:" + e.getValue());
        });
        
         for(int i = 1; i <= tamanho; i++){
             System.out.println(lista.get(i));
         }
         
         
         
	}
	
	
}
