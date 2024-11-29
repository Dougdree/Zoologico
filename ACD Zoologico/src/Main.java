import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Mensaje de bienvenida
        System.out.println("¡Bienvenido al sistema de gestión del zoológico!");
        System.out.println("------------------------------------------------");

        // Creación del zoológico
        Zoologico zoologico = new Zoologico("Zoológico Nacional", "Av. Principal 123", "08:00 - 18:00");
        System.out.println("Zoológico creado: " + zoologico.getNombre());

        // Creación de zonas y su asociación con el zoológico
        Zona zonaAcuatica = new Zona("Zona Acuática", "Acuática");
        Zona zonaDesertica = new Zona("Zona Desértica", "Desértica");
        List<Zona> zonas = new ArrayList<>();
        zonas.add(zonaAcuatica);
        zonas.add(zonaDesertica);
        System.out.println("Zonas creadas y asociadas al zoológico:");

        for (Zona zona : zonas) {
            System.out.println("- " + zona.getNombreZona() + " (" + zona.getTipoZona() + ")");
        }

        // Creación de hábitats y su asignación a zonas
        Habitat habitat1 = new Habitat("Acuario", 25.0f, 100.5, "20 peces");
        Habitat habitat2 = new Habitat("Terrario Desértico", 40.0f, 50.0, "5 reptiles");
        System.out.println("Hábitats creados:");

        System.out.println("- " + habitat1.getTipoHabitat() + " con temperatura ideal de " + habitat1.getTemperatura() + "°C");
        System.out.println("- " + habitat2.getTipoHabitat() + " con temperatura ideal de " + habitat2.getTemperatura() + "°C");

        // Creación de un veterinario y su asociación con un animal
        Veterinario veterinario = new Veterinario(
                "1234567890", "Dr. José", "1985-06-15", "0999999999", "Veterinario Senior", "08:00 - 16:00", 1500.0f,
                "Reptiles", "Reptilario"
        );
        System.out.println("Veterinario creado: " + veterinario.getNombre());

        // Creación de un animal y asociación con el veterinario
        Animal iguana = new Animal("Iggy", "Iguana Verde", "Iguana iguana", TipoDeColumnaVertebral.VERTEBRADO);
        List<Animal> animales = new ArrayList<>();
        animales.add(iguana);
        System.out.println("Animal creado y asignado al veterinario: " + iguana.getNombre());

        // Asignación de animales al veterinario
        for (Animal animal : animales) {
            System.out.println(veterinario.getNombre() + " está asignado al animal: " + animal.getNombre());
        }

        // Creación de un panel informativo para el hábitat
        PanelInformativo panel = new PanelInformativo("Iguana iguana", "Iguana Verde", "Iguanidae",
                "Selvas tropicales", "Herbívoro", "Vulnerable");
        System.out.println("Panel informativo creado:");
        System.out.println("- Nombre común: " + panel.getNombreComun());
        System.out.println("- Hábitat natural: " + panel.getHabitatNatural());

        // Creación de una jaula y asignación de un animal
        Jaula jaula = new Jaula("JA-001", new ArrayList<>(), Estado.BUENO);
        jaula.alojarAnimal(iguana);

        // Simulación de diagnóstico en el historial de salud
        HistorialSalud historial = new HistorialSalud(new Date(), "Salud estable", "Ninguno", veterinario.getNombre(), "Revisión general");
        Diagnostico diagnostico = new Diagnostico("Pérdida de apetito", "Revisión de dieta");
        historial.agregarDiagnostico(diagnostico);

        // Mensaje final
        System.out.println("------------------------------------------------");
        System.out.println("¡Gracias por usar el sistema de gestión del zoológico! Hasta pronto.");
    }
}
