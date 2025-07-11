package PrimeiraAula;

public class Cliente {

    private int codigo;
    private String nome;
    private String endereco;

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void cadastrarNome(String nome){
        this.nome = nome;
        System.out.println("Nome cadastrado com sucesso!");
    }

    public void mostrarNome(){
        System.out.println(this.nome);
    }

    public void cadastrarEndereco(String endereco){
        setEndereco(endereco);
    }

    public void mostrarEndereco(){
        System.out.println(this.endereco);
    }
}
