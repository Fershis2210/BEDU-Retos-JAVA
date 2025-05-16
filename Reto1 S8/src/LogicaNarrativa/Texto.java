package LogicaNarrativa;

public class Texto implements Gestor {
    public void mostrarDialogo(Narrativo paquete) {
        System.out.println("Escena actual: " + paquete.getEscenaActual());
        System.out.println("Una figura misteriosa aparece y te ofrece dos caminos... ");
    }
}
