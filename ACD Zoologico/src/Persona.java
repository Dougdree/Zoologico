// Clase Persona: Clase base con atributos generales para una persona.
public class Persona {
    protected String cedula; // Identificador único de la persona.
    protected String nombre; // Nombre de la persona.
    protected String fechaNacimiento; // Fecha de nacimiento.
    protected String numeroTelefono; // Número de contacto.

    // Constructor de la clase Persona.
    public Persona(String cedula, String nombre, String fechaNacimiento, String numeroTelefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefono = numeroTelefono;
    }


    // Métodos getters y setters.
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
