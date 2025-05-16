package Hospital;

public class Paciente {
    String nombre;
    int edad;
    String numExpediente;

    public void mostrarInformacion(){
        System.out.println("Información del(la) paciente: ");
        System.out.println("Paciente "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Expediente "+ numExpediente);
    }
}
