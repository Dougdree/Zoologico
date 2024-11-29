// Clase Boleto: Representa los boletos que se venden para ingresar al zoológico.
public class Boleto {
    private int numero; // Número único del boleto.
    private String fecha; // Fecha en que se emitió el boleto.
    private float precio; // Precio del boleto.
    private String tipoBoleto; // Tipo de boleto

    // Constructor de la clase Boleto.
    public Boleto(int numero, String fecha, float precio, String tipoBoleto) {
        this.numero = numero;
        this.fecha = fecha;
        this.precio = precio;
        this.tipoBoleto = tipoBoleto;
    }

    // Métodos getters y setters.
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTipoBoleto() {
        return tipoBoleto;
    }

    public void setTipoBoleto(String tipoBoleto) {
        this.tipoBoleto = tipoBoleto;
    }
}
