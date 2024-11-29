// Clase Empleado: Hereda de Persona e implementa Contrato.
public abstract class Empleado extends Persona implements Contrato {
    private String cargo; // Cargo del empleado (e.g., guía, taquillero, etc.).
    private String horario; // Horario laboral del empleado.
    private float sueldo; // Sueldo mensual del empleado.

    // Constructor de la clase Empleado.
    public Empleado(String cedula, String nombre, String fechaNacimiento, String numeroTelefono, String cargo, String horario, float sueldo) {
        super(cedula, nombre, fechaNacimiento, numeroTelefono);
        this.cargo = cargo;
        this.horario = horario;
        this.sueldo = sueldo;
    }

    // Implementación del método de la interfaz Contrato.
    @Override
    public void trabajar() {
        System.out.println(nombre + " está trabajando como " + cargo);
    }

    // Métodos getters y setters.
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
}
