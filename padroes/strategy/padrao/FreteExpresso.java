package padroes.strategy.padrao;

class FreteExpresso implements FreteStrategy {

    @Override
    public double calcular(double valorCompra) {
        return 25.0;
    }
}