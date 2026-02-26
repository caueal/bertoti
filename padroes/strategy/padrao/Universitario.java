package padroes.strategy.padrao;

public class Universitario implements Clientela {

    String matricula;
    
    @Override
    public void emprestar() {
        System.out.println("Emprestado pelo cliente universitário de matrícula: " + matricula);
    }


}
