package padroes.strategy.padrao;

public class Main {

    public static void main(String[] args){

        CalculadoraFrete frete =
                new CalculadoraFrete(new FreteNormal());

        System.out.println(
            frete.calcularFrete(100)
        );

        frete =
            new CalculadoraFrete(new FreteExpresso());

        System.out.println(
            frete.calcularFrete(100)
        );
    }

}
