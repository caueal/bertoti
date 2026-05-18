package padroes.observer.padrao;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Observer> clientes =
            new ArrayList<>();

    public void adicionar(Observer o){
        clientes.add(o);
    }

    public void remover(Observer o){
        clientes.remove(o);
    }

    public void notificar(String msg){

        for(Observer o : clientes){
            o.atualizar(msg);
        }

    }

}