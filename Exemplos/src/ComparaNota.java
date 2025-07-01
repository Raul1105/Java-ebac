import java.util.Comparator;

public class ComparaNota implements Comparator<Aluno2>{
    
    public int compare(Aluno2 a1, Aluno2 a2){
        return Double.compare(a1.getNota(), a2.getNota());
    }
}
