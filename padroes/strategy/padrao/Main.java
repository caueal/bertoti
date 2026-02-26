package padroes.strategy.padrao;

public class Main {
    public static void main(String[] args) {
        Clientela cliente1 = new Comum("João", 30, 12345);
        Clientela cliente2 = new Empresa();
        Clientela cliente3 = new Universitario();
        Clientela cliente4 = new Aposentado("CTPS123456");

        cliente1.emprestar();
        cliente2.emprestar();
        cliente3.emprestar();
        cliente4.emprestar();
    }
    
}
