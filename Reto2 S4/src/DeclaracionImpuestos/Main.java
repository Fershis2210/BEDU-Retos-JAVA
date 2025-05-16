package DeclaracionImpuestos;

public class Main {
    public static void main(String[] args){

        Declaracion declaracion = new Declaracion("MFVG1234", 5000.00);

        RFC cuenta = new RFC("MFVG1234", 9880.90);

        System.out.println("Declaración enviada por RFC: " + declaracion.rfcContribuyente() + " por $ " + declaracion.montoDeclarado() + " MX");
        cuenta.mostrarCuenta();

        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("¿RFC válido para esta cuenta?; " + rfcValido);
    }
}