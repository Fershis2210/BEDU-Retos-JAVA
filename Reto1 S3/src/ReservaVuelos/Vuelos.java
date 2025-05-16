package ReservaVuelos;

public class Vuelos {
    final String codigoVuelo;
    String destino;
    String horaSalida;
    Pasajeros asientoResrvado;

    public Vuelos(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoResrvado = null;
    }

    public boolean reservarAsiento (Pasajeros p) {
        if (asientoResrvado == null) {
            asientoResrvado = p;
            return true;
        } else {
            return false;
        }
    }

    public boolean reservarAsiento (String nombre, String pasaporte) {
        Pasajeros nuevoPasajero = new Pasajeros(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }

    public void cancelarReserva () { asientoResrvado = null; }

    public String obtenerItinerario() {
        String info = "Itinerario del vuelo:\n";
        info += "Código: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        if (asientoResrvado != null) {
            info += "Pasajero: " + asientoResrvado.nombre + "\n";
        } else {
            info += "Pasajero: [Sin reserva]\n";
        }
        return info;
    }
}
