package Simulacion;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Path rutaCarpeta = Paths.get("src/Simulacion/config");
        Path rutaArchivo = rutaCarpeta.resolve("parametros.txt");

        String parametros = "Tiempo de ciclo: 55.8 segundos"
                + "Velocidad de línea: 1.2 m/s"
                + "Número de estaciones: 8";

        try {
            if (!Files.exists(rutaCarpeta)) {
                Files.createDirectory(rutaCarpeta);
                System.out.println("Carpeta 'config' creada.");
            }

            Files.write(rutaArchivo, parametros.getBytes());
            System.out.println("Archivos de parámetros escrito correctamente.");

            if (Files.exists(rutaArchivo)) {
                System.out.println("El archivo fue creado exitosamente en: " + rutaArchivo.toAbsolutePath());

                String contenidoLeido = Files.readString(rutaArchivo);
                System.out.println("contenido del archivo: ");
                System.out.println(contenidoLeido);
            } else {
                System.out.println("El archivo no fue creado.");
            }
        } catch (IOException e) {
            System.out.println("Error al trabajar con el archivo: " + e.getMessage());
        }
    }
}