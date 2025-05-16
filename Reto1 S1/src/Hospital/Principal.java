package Hospital;

import java.util.Scanner;

public class Principal {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Paciente p1 = new Paciente();

        System.out.print("Ingresa el nombre del paciente: ");
        p1.nombre = scanner.nextLine ();

        System.out.println("Ingresa la edad: ");
        p1.edad = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Ingresa el número de expendiente: ");
        p1.numExpediente = scanner.nextLine();

        p1.mostrarInformacion();

        scanner.close();
    }
}
