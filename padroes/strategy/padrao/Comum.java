package padroes.strategy.padrao;

public class Comum implements Clientela {
    
    Integer cadastro;

    public Comum(String name, Integer idade, Integer cadastro){
        this.cadastro = cadastro;
    }

    @Override 
    public void emprestar(){
        System.out.println("Emprestado pelo cliente comum de cadastro: " + cadastro );

    };
    
}
