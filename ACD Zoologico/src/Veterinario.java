import java.util.List;

// Clase Veterinario: Representa al veterinario del zoológico.
public class Veterinario extends Empleado {
    private String especialidad; // Especialidad del veterinario
    private String animalCargo; // Tipo de animal bajo su cuidado
    private List<Animal> animalesBajoCuidado;

    // Constructor de la clase Veterinario.
    public Veterinario(String cedula, String nombre, String fechaNacimiento, String numeroTelefono, String cargo, String horario, float sueldo, String especialidad, String animalCargo) {
        super(cedula, nombre, fechaNacimiento, numeroTelefono, cargo, horario, sueldo);
        this.especialidad = especialidad;
        this.animalCargo = animalCargo;
        this.animalesBajoCuidado = animalesBajoCuidado;
    }

    // Método para cuidar a un animal.
    public void cuidarAnimal() {
        System.out.println(nombre + " está cuidando a los animales del tipo: " + animalCargo);
    }

    // Métodos getters y setters.
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getAnimalCargo() {
        return animalCargo;
    }

    public void setAnimalCargo(String animalCargo) {
        this.animalCargo = animalCargo;
    }
    public List<Animal> getAnimalesBajoCuidado() {
        return animalesBajoCuidado;
    }
}

