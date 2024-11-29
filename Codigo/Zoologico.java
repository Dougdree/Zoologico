import java.util.List;
// Clase Zoologico:
public class Zoologico {
    private String nombre; // Nombre del zoológico.
    private String direccion; // Dirección del zoológico.
    private String horarioAtencion; // Horario de atención.
    private List<Zona> zonas;

    // Constructor de la clase Zoologico.
    public Zoologico(String nombre, String direccion, String horarioAtencion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horarioAtencion = horarioAtencion;
        this.zonas = zonas;
    }

    // Métodos getters y setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }
    public List<Zona> getZonas() {
        return zonas;
    }
}
