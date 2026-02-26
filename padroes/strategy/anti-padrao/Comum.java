public class Comum extends Cliente {

    Integer cadastro;

    public Comum(String name, Integer idade, Integer cadastro){
        super(name, idade);
        this.cadastro = cadastro;
    }

    @Override 
    public void emprestar(){
        System.out.println("Emprestado pelo cliente: " + name + " De cadastro: " + cadastro );

    };



}
