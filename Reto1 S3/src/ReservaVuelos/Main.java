package ReservaVuelos;

public class Main {
    public static void main(String[] args) {
        Pasajeros pasajeros = new Pasajeros("Mafer Vazquez", "P221003");

        Vuelos vuelos = new Vuelos("Mx4410", "Alemania", "22:15");

        boolean reservado = vuelos.reservarAsiento(pasajeros);
        if (reservado) {
            System.out.println("Reserva realizada con éxito.");
        } else {
            System.out.println("No se pudo realizar la reserva.");
        }

        System.out.println(vuelos.obtenerItinerario());

        System.out.println("Cancelando reserva...");
        vuelos.cancelarReserva();

        System.out.println(vuelos.obtenerItinerario());

        vuelos.reservarAsiento("Alexis Tellez", "P090699");
        System.out.println(vuelos.obtenerItinerario());
    }
}