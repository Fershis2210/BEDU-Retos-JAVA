package CajeroAutomatico;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        var saldo = 1000.00;
        int opcion;

        do {
            System.out.println("Bienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Tu saldo actual es: $ " + saldo + "MX");
                }
                case 2 -> {
                    System.out.print("Ingresa el monto a depositar: ");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0){
                        System.out.println("El monto debe ser mayor a 0.");
                        continue;
                    }
                    saldo += deposito;
                    System.out.println("Depósito realizado. Saldo actual: $" + saldo + "MX");
                }
                case 3 -> {
                    System.out.print("Ingresa el monto a retirar: ");
                    double retiro = scanner.nextDouble();

                    if (retiro <= 0) {
                        System.out.println("El monto debe ser mayor a 0.");
                        continue;
                    }

                    if (retiro>saldo) {
                        System.out.println("Saldo insuficiente. Tu saldo es: $ " + saldo + "MX");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Saldo restante: $" + saldo + "MX");
                    }
                }
                case 4 -> {
                    System.out.println("Gracias por su preferencia. ¡Buen día!");
                }
                default -> {
                    System.out.println("Opción invalida. Intente nuevamente.");
                }
            }
        } while (opcion != 4);

        scanner.close();
    }

}