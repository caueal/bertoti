package padroes.strategy.padrao;

public class Aposentado implements Clientela {
    String carteiraTrabalho;

    public Aposentado(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    @Override
    public void emprestar() {
        System.out.println("Emprestado pelo cliente aposentado de carteira de trabalho: " + carteiraTrabalho);
    }
    
}
