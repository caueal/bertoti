package padroes.observer.padrao;

public class Main {

    public static void main(String[] args){

        Loja loja = new Loja();

        Cliente c1 =
                new Cliente("Ana");

        Cliente c2 =
                new Cliente("Carlos");

        loja.adicionar(c1);
        loja.adicionar(c2);

        loja.notificar(
            "Promoção 50%"
        );

    }

}