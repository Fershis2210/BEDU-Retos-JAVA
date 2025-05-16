package SistemasPago;

public class Transferencia extends MetodoPago{
    private boolean validadoExterno;

    public Transferencia (double monto, boolean validadoExterno) {
        super(monto);
        this.validadoExterno = validadoExterno;
    }

    @Override
    public boolean autenticar () { return validadoExterno; }

    @Override
    public void procesarPago () { System.out.println("Procesando transferencia por $ "+ monto + " MX"); }
}
