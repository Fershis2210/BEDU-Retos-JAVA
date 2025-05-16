package SistemaEmergencia;

public class Ambulancia extends Unidad {
    private GPS gps;
    private Sirena sirena;
    private Operador operador;

    public Ambulancia (String nombre, String nombreOperador) {
        super(nombre);
        this.gps = new GPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    @Override
    public void responder() { System.out.println("Ambulancia en camino al hospital mas cercano."); }
}
