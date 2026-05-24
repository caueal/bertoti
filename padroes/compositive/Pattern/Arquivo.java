package padroes.compositive.Pattern;

class Arquivo implements ArquivosSistema {

    private String nome;

    public Arquivo(String nome){
        this.nome = nome;
    }

    @Override
    public void mostrar(){
        System.out.println(
            "Arquivo: " + nome
        );
    }

}