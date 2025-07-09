import java.util.*;

public class Produto{
    private String nome;
    private double preco;
    private String categoria;
    
    public Produto(String nome, double preco, String categoria){
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }
    
    public Produto(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    public String toString(){
        return nome;
    }
    
    public static void comparaPreco(double valor, List<Produto> lista){
        
        System.out.printf("Os produtos com preço acima de %.2f são:%n", valor);
        
        for(Produto produto : lista){
            if(produto.getPreco() > valor){
                System.out.printf("Produto: %s preço: R$ %.2f%n", produto.getNome(), produto.getPreco());
            }
        }
        
        System.out.println("=================================");
    }
    
    public static void comparaCategoria(String categoria, List<Produto> lista){
        
        System.out.printf("Os produtos da categoria: %s são:%n", categoria);
        
        for(Produto nome : lista){
            if(nome.getCategoria().equals(categoria)){
                System.out.printf("Produto: %s preço: R$ %.2f%n", nome.getNome(), nome.getPreco());
            }
        }
        
        System.out.println("=================================");
    }
    
    public static void buscaProduto(String nome, List<Produto> lista){
        
        for(Produto produto : lista){
            if(produto.getNome().equals(nome)){
                System.out.printf("Produto: %s%n", produto.getNome());
                System.out.printf("Preço: R$ %.2f%n", produto.getPreco());
                System.out.printf("Categoria: %s%n", produto.getCategoria());
            }
        }
        
        System.out.println("=================================");
    }
    
    public static void removerProduto(String nome, List<Produto> lista){
        for(Produto produtos : lista){
            if(produtos.getNome().equals(nome)){
                lista.remove(nome);
                System.out.printf("Produto: %s removido com sucesso!%n", nome);
            }
        }
    }
    
    public static void verProdutos(List<Produto> lista){
        for(Produto produto : lista){
            System.out.printf("Produto: %s%n", produto.getNome());
            System.out.printf("Preço: R$ %.2f%n", produto.getPreco());
            System.out.printf("Categoria: %s%n", produto.getCategoria());
            System.out.println("=================================");
        }
    }
    
    public static void atualizarProduto(String produto, String nome, double preco, String categoria, List<Produto> lista){
        for(Produto item : lista){
            if(item.getNome().equals(produto)){
                item.setNome(nome);
                item.setPreco(preco);
                item.setCategoria(categoria);
                
                System.out.printf("Produto %s atualizado com sucesso%n", produto);
                System.out.println("=================================");
            }
        }
    }
    
    
}
