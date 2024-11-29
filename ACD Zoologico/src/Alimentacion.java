// atributos de la clase
public class Alimentacion {
    private TipoAlimentacion tipoAlimento;
    private String cantidad;
    private int frecuencia;
    private String horaAlimentacion;

    // Constructor
    public Alimentacion(TipoAlimentacion tipoAlimento, String cantidad, int frecuencia, String horaAlimentacion) {
        this.tipoAlimento = tipoAlimento;
        this.cantidad = cantidad;
        this.frecuencia = frecuencia;
        this.horaAlimentacion = horaAlimentacion;
    }

    // Getter y Setter para tipoAlimento
    public TipoAlimentacion getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(TipoAlimentacion tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    // Métodos para los otros atributos
    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getHoraAlimentacion() {
        return horaAlimentacion;
    }

    public void setHoraAlimentacion(String horaAlimentacion) {
        this.horaAlimentacion = horaAlimentacion;
    }

    // Método alimentar
    public void alimentar() {
        // Implementación del método según la lógica necesaria
        System.out.println("Alimentando al animal con " + cantidad + " de alimento.");
    }
}
