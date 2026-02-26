public class Estudante extends Cliente {

    String matricula;

    public Estudante(String name, Integer idade, String matricula){
        super(name, idade);
        this.matricula = matricula;
    }

    @Override 
    public void emprestar(){
        System.out.println("Emprestado pelo cliente: " + name + " De matrícula: " + matricula );

    };

}
