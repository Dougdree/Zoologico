// Cuidador extiende de Empleado y añade funcionalidad específica
public class Cuidador extends Empleado {
    private String areaResponsable; // Área de responsabilidad del cuidador

    // Constructor
    public Cuidador(String cedula, String nombre, String fechaNacimiento, String numeroTelefono,
                    String cargo, String horario, float sueldo, String areaResponsable) {
        super(cedula, nombre, fechaNacimiento, numeroTelefono, cargo, horario, sueldo);
        this.areaResponsable = areaResponsable;
    }

    // Método para alimentar a un animal
    public void alimentarAnimal(Animal animal) {
        System.out.println("El cuidador " + getNombre() + " está alimentando a " + animal.getNombre());
    }
}
