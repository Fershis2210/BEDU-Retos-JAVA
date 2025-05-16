package ComparacionFacturas;

import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        Factura F1 = new Factura("FAC01", "Mafer Vago", 10000.00);
        Factura F2 = new Factura("FAC02", "Alexis Tellez", 30000.00);

        System.out.println(F1);
        System.out.println(F2);

        System.out.println("¿Las facturas son iguales?: " + F1.equals(F2));
    }
}