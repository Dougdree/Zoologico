// Clase que representa una exhibición dentro del zoológico
import java.util.ArrayList;
import java.util.List;

public class Exhibicion {
    private String nombre; // Nombre de la exhibición
    private String horario; // Horario de la exhibición
    private String ubicacion; // Ubicación de la exhibición
    private String tema; // Tema de la exhibición
    private List<Animal> exhibicionList; // Lista de animales en la exhibición

    // Constructor
    public Exhibicion(String nombre, String horario, String ubicacion, String tema) {
        this.nombre = nombre;
        this.horario = horario;
        this.ubicacion = ubicacion;
        this.tema = tema;
        this.exhibicionList = new ArrayList<>();
    }

    // Método para agregar un animal a la exhibición
    public void agregarAnimal(Animal animal) {
        exhibicionList.add(animal);
        System.out.println("El animal " + animal.getNombre() + " ha sido añadido a la exhibición " + nombre);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public List<Animal> getExhibicionList() {
        return exhibicionList;
    }
}
