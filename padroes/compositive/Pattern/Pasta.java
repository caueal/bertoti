package padroes.compositive.Pattern;

import java.util.ArrayList;
import java.util.List;

class Pasta implements ArquivosSistema {
    
    private String nome;

    private List<ArquivosSistema> itens =
            new ArrayList<>();

    public Pasta(String nome){
        this.nome = nome;
    }

    public void adicionar(
            ArquivosSistema item){

        itens.add(item);

    }

    @Override
    public void mostrar(){

        System.out.println(
                "Pasta: " + nome
        );

        for(ArquivosSistema i : itens){
            i.mostrar();
        }

    }

}