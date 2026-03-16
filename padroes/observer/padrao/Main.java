package padroes.observer.padrao;

public class Main {
    public static void main(String[] args) {
        Observado observado = new Observado();

        Usuario usuario1 = new Usuario("Joao");
        Usuario usuario2 = new Usuario("Jose");

        observado.adicionarObserver(usuario1);
        observado.adicionarObserver(usuario2);

        observado.notificarObservers("Nova atualização disponível!");

        observado.removerObserver(usuario1);

        observado.notificarObservers("Outra atualização disponível!");
    }
    
}
