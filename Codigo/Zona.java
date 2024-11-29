// Clase Zona:
public class Zona {
    private String nombreZona; // Nombre de la zona.
    private String tipoZona; // Tipo de zona (e.g., acuática, desértica).

    // Constructor de la clase Zona.
    public Zona(String nombreZona, String tipoZona) {
        this.nombreZona = nombreZona;
        this.tipoZona = tipoZona;
    }

    // Métodos getters y setters.
    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public String getTipoZona() {
        return tipoZona;
    }

    public void setTipoZona(String tipoZona) {
        this.tipoZona = tipoZona;
    }
}
