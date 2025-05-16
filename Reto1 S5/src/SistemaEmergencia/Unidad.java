package SistemaEmergencia;

public abstract class Unidad {
    String nombre;

    public Unidad (String nombre) { this.nombre = nombre; }

    public void activarUnidad() { System.out.println("Activando unidad: " + nombre); }

    public abstract void responder();
}
