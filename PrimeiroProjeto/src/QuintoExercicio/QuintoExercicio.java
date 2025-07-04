import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuintoExercicio{
	public static void main(String[] args) {
		
		List<Aluno1> alunos = new ArrayList<Aluno>();
		
		Aluno1 a = new Aluno1("Raul","Ciencias",0);
		Aluno1 b = new Aluno1("Larissa","Fotografia",0);
		
		alunos.add(a);
		alunos.add(b);
		
		System.out.println("Antes do sort: " + alunos);
		Collections.sort(alunos);
		System.out.println("Depois do sort: " + alunos);
		
	}
}
