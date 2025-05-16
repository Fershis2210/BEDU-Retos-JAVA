package Facturas;

public class Main {
    public static void main(String[] args) {

        Factura facturaRFC = new Factura(10000.00, "Enganche de carro", "MFVG1234");

        Factura facturaSinRFC = new Factura(3000.00, "Compra en línea", null);

        System.out.println(facturaRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}