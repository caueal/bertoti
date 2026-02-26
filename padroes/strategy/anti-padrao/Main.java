public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Comum("João", 30, 12345);
        Cliente cliente2 = new Empresa("Empresa XYZ", 5, "12.345.678/0001-90");
        Cliente cliente3 = new Estudante("Maria", 65, "045982");

        cliente1.emprestar();
        cliente2.emprestar();
        cliente3.emprestar();
    }
    
}
