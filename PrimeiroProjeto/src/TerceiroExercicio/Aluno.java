public class Aluno{
    
    private int n1;
    private int n2;
    private int n3;
    private int n4;
    public int media;
    
    public void setN1(int n1){
        this.n1 = n1;
    }
    
    public int getN1(){
        return n1;
    }
    
    public void setN2(int n2){
        this.n2 = n2;
    }
    
    public int getN2(){
        return n2;
    }
    
    public void setN3(int n3){
        this.n3 = n3;
    }
    
    public int getN3(){
        return n3;
    }
    
    public void setN4(int n4){
        this.n4 = n4;
    }
    
    public int getN4(){
        return n4;
    }
    
    public void calcularMedia(){
        media = (n1 + n2+ n3 + n4) / 4;
        if(media >= 7){
            System.out.println("Com a media de " + media + " você foi aprovado!");
        } else if(media >= 5){
            System.out.println("Com a media de " + media + " você esta de recuperação!");
        } else {
            
            System.out.print("Com a media de " + media + " você foi reprovado!");
        }
    }
}
