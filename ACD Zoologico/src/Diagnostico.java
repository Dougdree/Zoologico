// Clase Diagnostico: Representa un diagnóstico realizado por un veterinario a un animal.
import java.util.Date;

public class Diagnostico {
    private String sintoma; // Síntoma observado en el animal.
    private String fecha; // Fecha del diagnóstico.

    // Constructor de la clase Diagnostico.
    public Diagnostico(String sintoma, String fecha) {
        this.sintoma = sintoma;
        this.fecha = fecha;
    }

    // Método para agregar un diagnóstico (puede vincularse a una lista de diagnósticos).
    public void agregarDiagnostico() {
        System.out.println("Diagnóstico registrado: " + sintoma + " en la fecha: " + fecha);
    }

    // Métodos getters y setters.
    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = String.valueOf(fecha);
    }
}
