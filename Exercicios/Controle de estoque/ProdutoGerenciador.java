import java.util.*;

public class ProdutoGerenciador{
    List<Produto> lista = new ArrayList<>();
    
    public void adicionarProduto(String nome, double preco, int quantidade){
        
        boolean achou = false;
        
        for(Produto produto : lista){
            if(produto.getNome().equalsIgnoreCase(nome)){
                achou = true;
                break;
            }
        }
        
        if(achou){
                System.out.println("Produto ja existe!");
            } else {
                lista.add(new Produto(nome, preco, quantidade));
                System.out.println("Produto adicionado com sucesso!");
            }
    }
    
    public void listarProdutos(){
        for(Produto produto : lista){
            System.out.println(produto);
        }
    }
    
    public void buscarPorNome(String nome){
        boolean achou = false;
        
        for(Produto produto : lista){
            if(produto.getNome().equalsIgnoreCase(nome)){
                System.out.println(produto);
                achou = true;
                break;
            }
        }
        
        if(!achou){
            System.out.printf("Produto %s não existe%n", nome);
        }
    }
    
    public void atualizarQuantidade(String nome, int quantidade){
        
        boolean achou = false;
        
        for(Produto produto : lista){
            if(produto.getNome().equalsIgnoreCase(nome)){
                
                int quantidadeA = produto.getQuantidade();
                
                produto.setQuantidade(produto.getQuantidade() + quantidade);
                achou = true;
                System.out.printf("Quantidade atualizada de %d para %d!%n", quantidadeA, produto.getQuantidade());
            }
        }
        
        if(!achou){
            System.out.printf("Produto %s não existe!%n", nome);
        }
    }
    
    
    public void removerProduto(String nome){
        
        boolean apagou = lista.removeIf(produto -> produto.getNome().equalsIgnoreCase(nome));
        
        if(apagou){
            System.out.printf("Produto %s excluido com sucesso%n", nome);
        } else {
            System.out.printf("Produto %s não existe!%n", nome);
        }
    }
    
    public void calcularEstoque(){
        double total = 0;
        
        for(Produto produto : lista){
            total += produto.getQuantidade() * produto.getPreco();
        }
        
        System.out.printf("O total do estoque é de R$ %.2f%n", total);
    }
}    
