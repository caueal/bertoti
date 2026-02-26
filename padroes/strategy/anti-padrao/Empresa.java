public class Empresa extends Cliente {

    String cnpj;

    public Empresa(String name, Integer idade, String cnpj){
        super(name, idade);
        this.cnpj = cnpj;
    }


}
