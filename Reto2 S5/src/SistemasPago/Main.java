package SistemasPago;

public class Main {
    public static void main(String[] args) {
        MetodoPago[] pagos = {
                new Efectivo(120.00),
                new Tarjeta(200.00, 400.00),
                new Transferencia(250.00, true)
        };

        for (MetodoPago pago : pagos) {
            if (pago.autenticar()) {
                System.out.println("Auntenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válido.");
            }
            System.out.println();
        }
    }
}