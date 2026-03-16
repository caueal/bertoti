package padroes.observer.antiPadrao;

public class Main {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Joao");
        Usuario usuario2 = new Usuario("Jose");

        usuario1.update("Nova atualizacao disponível!");
        usuario2.update("Nova atualizacao disponível!");

        usuario1.update("Outra atualizacao!");
        usuario2.update("Outra atualizacao");
    }
}
