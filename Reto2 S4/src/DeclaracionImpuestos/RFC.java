package DeclaracionImpuestos;

import java.util.Objects;

public class RFC {

    private final String rfc;
    private double saldoDisponible;

    public  RFC(String rfc, double saldoDisponible) {
        this.rfc = rfc;
        if (saldoDisponible >= 0) {
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("El saldo no puede ser menor a 0. Se asignara a 0.");
            this.saldoDisponible = 0;
        }
    }

    public String getRfc() {return rfc; }

    public double getSaldoDisponible () { return saldoDisponible; }

    public boolean validarRFC(Declaracion d) { return Objects.equals(this.rfc, d.rfcContribuyente()); }

    public void mostrarCuenta() {
        System.out.println("Cuenta fiscal registrada con RFC: " + rfc + ", saldo disponible: $" + saldoDisponible + " MX");
    }
}
