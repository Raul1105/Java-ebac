import java.util.Scanner;

public class Programa3{
	public static void main(String[] args) {
	    Scanner numero = new Scanner(System.in);
	    
	    Aluno aluno1 = new Aluno();
	    
	    System.out.print("Digite a primeira nota:");
	    aluno1.setN1(numero.nextInt());
	    
	    System.out.print("Digite a segunda nota:");
	    aluno1.setN2(numero.nextInt());
	    
	    System.out.print("Digite a terceira nota:");
	    aluno1.setN3(numero.nextInt());
	    
	    System.out.print("Digite a quarta nota:");
	    aluno1.setN4(numero.nextInt());
	    
	    aluno1.calcularMedia();
	    
	}
}

