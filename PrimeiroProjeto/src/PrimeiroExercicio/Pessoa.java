package PrimeiroExercicio;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private float altura;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getSexo(){
        return sexo;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getAltura(){
        return altura;
    }

    public void cadastrarPessoa(String nome, int idade, String sexo, float altura){
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setAltura(altura);
    }

    public void mostrarPessoa(){
        System.out.println("Nome:" + this.nome);
        System.out.println("Idade:" + this.idade);
        System.out.println("Sexo:" + this.sexo);
        System.out.println("Altura" + this.altura);
    }


}
