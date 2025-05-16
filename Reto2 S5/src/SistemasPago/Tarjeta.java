package SistemasPago;

public class Tarjeta  extends MetodoPago {
    private double saldoDisponible;

    public Tarjeta (double monto, double saldoDisponible) {
        super(monto);
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public boolean autenticar(){ return saldoDisponible >= monto; }

    @Override
    public void procesarPago() { System.out.println("Procesando pago con tarjeta por $ " + monto + " MX"); }
}
