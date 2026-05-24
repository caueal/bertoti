package padroes.compositive.AntiPattern;

class Pasta {

    Arquivo pdf;
    Arquivo txt;
    Arquivo imagem;

    void mostrar(){

        pdf.mostrar();
        txt.mostrar();
        imagem.mostrar();

    }

}