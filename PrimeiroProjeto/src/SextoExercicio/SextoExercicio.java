import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SextoExericio{
	public static void main(String[] args) {
		
		List<Aluno2> alunos = new ArrayList<Aluno2>();
		
		Aluno2 a = new Aluno2("Raul","Ciencias",5);
		Aluno2 b = new Aluno2("Larissa","Fotografia",8);
		
		alunos.add(a);
		alunos.add(b);
		
		System.out.println("Antes do sort: " + alunos);
		Collections.sort(alunos);
		System.out.println("Depois do sort: " + alunos);
		
		ComparaNota comparaNota = new ComparaNota();
		Collections.sort(alunos, comparaNota);
    	System.out.println("sort por nota: " + alunos);
        
		
	}
}
