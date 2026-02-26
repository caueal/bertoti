public class Aposentado extends Cliente {

    String carteiraTrabalho;

    public Aposentado(String name, Integer idade, String carteiraTrabalho){
        super(name, idade);
        this.carteiraTrabalho = carteiraTrabalho;
    }

}
