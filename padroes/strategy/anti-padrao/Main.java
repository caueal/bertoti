public class Main  {

    public static void main(String[] args){

        CalculadoraFrete frete =
                new CalculadoraFrete();

        System.out.println(
            frete.calcularFrete(100, "normal")
        );

        System.out.println(
            frete.calcularFrete(100, "expresso")
        );
    }

}