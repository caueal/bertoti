package padroes.strategy.padrao;

class CalculadoraFrete {

    private FreteStrategy strategy;

    public CalculadoraFrete(FreteStrategy strategy){
        this.strategy = strategy;
    }

    public double calcularFrete(double valor){
        return strategy.calcular(valor);
    }
}
