public class CalculadoraFrete {

    public double calcular(String tipo){

        if(tipo.equals("NORMAL")){
            return 10;
        }

        else if(tipo.equals("EXPRESSO")){
            return 25;
        }

        else if(tipo.equals("URGENTE")){
            return 50;
        }

        return 0;
    }

}