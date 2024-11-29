// Clase que representa una jaula dentro de un hábitat
import java.util.ArrayList;
import java.util.List;

public class Jaula {
    private String codigo; // Código identificador de la jaula
    private List<Animal> animalList; // Lista de animales en la jaula
    private Estado estado;

    // Constructor
    public Jaula(String codigo, List<Animal> animalList,Estado estado) {
        this.codigo = codigo;
        this.animalList = new ArrayList<>();
        this.estado = estado;
    }

    // Método para alojar un animal en la jaula
    public void alojarAnimal(Animal animal) {
        animalList.add(animal);
        System.out.println("El animal " + animal.getNombre() + " ha sido alojado en la jaula " + codigo);
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

}
