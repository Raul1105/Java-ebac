import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		GerenciadorAluno aluno = new GerenciadorAluno();
		int opcao;
		String nome;
		int idade;
		double nota;

		do {
			System.out.println("[1] Adicionar aluno");
			System.out.println("[2] Listar alunos");
			System.out.println("[3] Buscar aluno por nome");
			System.out.println("[4] Remover aluno");
			System.out.println("[5] Ver media de notas");
			System.out.println("[0] Sair");
			System.out.print("Opção:");

			opcao = s.nextInt();
			s.nextLine();

			if(opcao < 0 || opcao > 5) {
				System.out.println("Opção invalida!");
			}

			switch(opcao) {
			case 1:
				System.out.println("========Adicionando aluno=======");

				System.out.print("Digite o nome:");
				nome = s.nextLine();

				System.out.print("Digite a idade:");
				idade = s.nextInt();
				s.nextLine();

				System.out.print("Digite a nota:");
				nota = s.nextDouble();
				s.nextLine();

				aluno.adicionarAluno(nome, idade, nota);
				System.out.println("================================");
				break;
			case 2:
				System.out.println("========Listando alunos========");

				aluno.listarAlunos();
				System.out.println("================================");
				break;
			case 3:
				System.out.println("========Buscando por nome========");

				System.out.print("Digite o aluno a ser buscado:");
				nome = s.nextLine();

				aluno.buscarAluno(nome);
				System.out.println("================================");
				break;
			case 4:
				System.out.println("========Removendo aluno========");

				System.out.print("Digite o aluno a ser removido:");
				nome = s.nextLine();

				aluno.removerAluno(nome);
				System.out.println("================================");
				break;
			case 5:
				System.out.println("========Mostrando media de notas========");

				aluno.mediaNotas();
				System.out.println("================================");
			}
		} while(opcao != 0);
	}
}
