package padroes.observer.padrao;

import java.util.List;
import java.util.ArrayList;

public class Observado {
    private List<Observer> observers = new ArrayList<>();

    public void adicionarObserver(Observer obs) {
        observers.add(obs);
    }

    public void removerObserver(Observer obs) {
        observers.remove(obs);
    }

    public void notificarObservers(String message) {
        for (Observer obs : observers) {
            obs.update(message);
        }
    }
    
}
