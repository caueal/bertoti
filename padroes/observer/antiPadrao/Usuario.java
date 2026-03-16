package padroes.observer.antiPadrao;

public class Usuario extends Observer {
    private String name;

    public Usuario(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Usuário " + name + " recebeu a mensagem: " + message);
    }

}
