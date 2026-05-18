package padroes.strategy.padrao;

class FreteNormal implements FreteStrategy {

    @Override
    public double calcular(double valorCompra) {
        return 10.0;
    }
}