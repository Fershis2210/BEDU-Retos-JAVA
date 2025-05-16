package Facturas;

import java.util.Optional;

public class Factura {

    private double monto;
    private String descripcion;
    private Optional <String> rfc;

    public Factura (double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    public String getResumen() {
        String resumen = "Factura generada: ";
        resumen += "Descripción: " + descripcion + " ";
        resumen += "Monto: $ " + monto + "MX ";


        resumen += "RFC: " + rfc.orElse("[No encontrado]");

        return resumen;
    }
}
