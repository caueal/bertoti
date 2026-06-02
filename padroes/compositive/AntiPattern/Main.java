package padroes.compositive.AntiPattern;

public class Main {

    public static void main(String[] args){

        Arquivo pdf =
            new Arquivo("relatorio.pdf");

        Arquivo txt =
            new Arquivo("notas.txt");

        Pasta fotos =
            new Pasta("Fotos");

        fotos.adicionarArquivo(
            new Arquivo("img1.png")
        );

        Pasta documentos =
            new Pasta("Documentos");

        documentos.adicionarArquivo(pdf);
        documentos.adicionarArquivo(txt);

        documentos.adicionarPasta(fotos);


        documentos.mostrar();

    }

}