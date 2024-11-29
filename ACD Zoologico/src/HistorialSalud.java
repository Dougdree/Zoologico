// Clase HistorialSalud: Almacena la información de salud de un animal.
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class HistorialSalud {
    private Date fecha; // Fecha del último registro.
    private String diagnostico; // Descripción del diagnóstico.
    private String tratamiento; // Tratamiento prescrito.
    private String veterinario; // Nombre del veterinario responsable.
    private String anamnesis; // Información previa sobre el animal.
    private List<Diagnostico> diagnosticoList; // Lista de diagnósticos.

    // Constructor de la clase HistorialSalud.
    public HistorialSalud(Date fecha, String diagnostico, String tratamiento, String veterinario, String anamnesis) {
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.veterinario = veterinario;
        this.anamnesis = anamnesis;
        this.diagnosticoList = new ArrayList<>();
    }

    // Método para agregar un diagnóstico al historial.
    public void agregarDiagnostico(Diagnostico diagnostico) {
        diagnosticoList.add(diagnostico);
        System.out.println("Diagnóstico agregado al historial: " + diagnostico.getSintoma());
    }

    // Métodos getters y setters.
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public List<Diagnostico> getDiagnosticoList() {
        return diagnosticoList;
    }
}
