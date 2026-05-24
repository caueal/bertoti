package padroes.compositive.Pattern;

public class Main {

    public static void main(String[] args){

        Arquivo pdf =
            new Arquivo("relatorio.pdf");

        Arquivo txt =
            new Arquivo("notas.txt");

        Pasta documentos =
            new Pasta("Documentos");

        documentos.adicionar(pdf);
        documentos.adicionar(txt);

        documentos.mostrar();

    }

}