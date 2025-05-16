package LogicaNarrativa;

public class Main {
    public static void main(String[] args) {
        Narrativo paquete = new Narrativo("Inicio del Viaje");

        Historia transicion = new Simple();
        Gestor dialogo = new Texto();
        Logica decision = new Binario();

        dialogo.mostrarDialogo(paquete);
        String accion = decision.tomarDecision();
        transicion.realizarTransicion(accion);
    }
}