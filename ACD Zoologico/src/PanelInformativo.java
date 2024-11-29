// Clase PanelInformativo: Proporciona información sobre una especie.
public class PanelInformativo {
    private String nombreCientifico; // Nombre científico de la especie.
    private String nombreComun; // Nombre común de la especie.
    private String familia; // Familia biológica a la que pertenece.
    private String habitatNatural; // Descripción de su hábitat natural.
    private String dieta; // Dieta del animal.
    private String estadoDeConservacion; // Estado de conservación de la especie.

    // Constructor de la clase PanelInformativo.
    public PanelInformativo(String nombreCientifico, String nombreComun, String familia,
                            String habitatNatural, String dieta, String estadoDeConservacion) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.familia = familia;
        this.habitatNatural = habitatNatural;
        this.dieta = dieta;
        this.estadoDeConservacion = estadoDeConservacion;
    }

    // Método para clasificar una especie.
    public void clasificarEspecie() {
        System.out.println("Clasificación de la especie: " + nombreCientifico + " - " + familia);
    }

    // Método para verificar el estado de conservación.
    public void verificarConservacion() {
        System.out.println("El estado de conservación de la especie " + nombreComun + " es: " + estadoDeConservacion);
    }

    // Método para obtener el hábitat ideal.
    public void obtenerHabitatIdeal() {
        System.out.println("El hábitat ideal para " + nombreComun + " es: " + habitatNatural);
    }

    // Métodos getters y setters.
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getHabitatNatural() {
        return habitatNatural;
    }

    public void setHabitatNatural(String habitatNatural) {
        this.habitatNatural = habitatNatural;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getEstadoDeConservacion() {
        return estadoDeConservacion;
    }

    public void setEstadoDeConservacion(String estadoDeConservacion) {
        this.estadoDeConservacion = estadoDeConservacion;
    }
}
