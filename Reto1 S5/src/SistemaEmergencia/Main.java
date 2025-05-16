package SistemaEmergencia;

public class Main {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Mafer");
        Patrulla patrulla = new Patrulla("Patrulla", "Alexis");
        Bomberos bomberos = new Bomberos("Bomberos", "Luis");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
}