import java.util.List;
// Clase que representa un animal en el zoológico.
public class Animal {
    // Atributos
    private String nombre;
    private String edad;
    private String peso;
    private TipoDeColumnaVertebral historialSalud;
    private List<Alimentacion> alimentacion;
    private TipoDeColumnaVertebral tipoDeColumna;

    // constructor
    public Animal(String nombre, String edad, String peso, TipoDeColumnaVertebral historialSalud) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historialSalud = historialSalud;
    }


    // getter and setter de la clase

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public TipoDeColumnaVertebral getHistorialSalud() {
        return historialSalud;
    }

    public void setHistorialSalud(TipoDeColumnaVertebral historialSalud) {
        this.historialSalud = historialSalud;
    }
}
