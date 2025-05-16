package SistemasPago;

public class Efectivo extends MetodoPago {

    public Efectivo (double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar () { return true; }

    @Override
    public void procesarPago () {System.out.println("Procesando pago en efectivo por $ " + monto + " MX");}
}
