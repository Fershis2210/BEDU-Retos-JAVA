package MuestrasGeneticas;

import java.util.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> muestras = new ArrayList<>();

        muestras.add("Homo Sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thalina");
        muestras.add("Homo sapiens");

        System.out.println("Muestras recibidas en orden: ");
        for (int i = 0; i < muestras.size(); i++) {
            System.out.println((i + 1) + ". " + muestras.get(i));
        }

        HashSet<String> especiesUnicas = new HashSet<>(muestras);

        System.out.println("Especies únicas procesadas: ");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        HashMap<String, String> muestrasInvestigador = new HashMap<>();

        muestrasInvestigador.put("M-1", "Dra. Vago");
        muestrasInvestigador.put("M-2", "Dr. Tellez");
        muestrasInvestigador.put("M-3", "Dr. Nyera");

        System.out.println("Asiganción de muestras a investigadores: ");
        for (Map.Entry<String, String> entry : muestrasInvestigador.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        String idBuscar = "M-1";
        System.out.println("Investigador responsable de la muestra " + idBuscar + ": " + muestrasInvestigador.get(idBuscar));
    }
}