package PrimeiraAula;

public class PrimeiraClasse {
    public static void main(String[] args){

        Cliente cliente = new Cliente();

        cliente.cadastrarEndereco("Rua peroba");
        cliente.mostrarEndereco();

        cliente.cadastrarNome("Raul");
        cliente.mostrarNome();

    }
}
