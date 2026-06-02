package padroes.compositive.AntiPattern;
import java.util.ArrayList;
import java.util.List;

class Pasta {

    private String nome;

    // Separando listas por tipo
    private List<Arquivo> arquivos =
            new ArrayList<>();

    private List<Pasta> subPastas =
            new ArrayList<>();


    public Pasta(String nome){
        this.nome = nome;
    }

    public void adicionarArquivo(
            Arquivo arquivo){

        arquivos.add(arquivo);

    }

    public void adicionarPasta(
            Pasta pasta){

        subPastas.add(pasta);

    }


    public void mostrar(){

        System.out.println(
                "Pasta: " + nome
        );

        for(Arquivo a : arquivos){
            a.mostrar();
        }

        for(Pasta p : subPastas){
            p.mostrar();
        }

    }

}