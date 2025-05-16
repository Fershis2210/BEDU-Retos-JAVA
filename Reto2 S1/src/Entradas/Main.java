package Entradas;

public class Main {
    public static void main(String[] args) {
        Entrada entr1 = new Entrada("Concierto de Morat", 1000.00);
        Entrada entr2 = new Entrada("Obra de Teatro Mentiras", 799.99);

        entr1.mostrarInformacion();
        entr2.mostrarInformacion();

        Entrada_Record entr3= new Entrada_Record("Concierto Lady Gaga", 1899.99);
        entr3.mostrarInformacion();
    }
}