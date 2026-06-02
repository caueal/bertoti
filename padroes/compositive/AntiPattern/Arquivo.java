package padroes.compositive.AntiPattern;

class Arquivo {

    private String nome;

    public Arquivo(String nome){
        this.nome = nome;
    }

    public void mostrar(){
        System.out.println(
            "Arquivo: " + nome
        );
    }

}