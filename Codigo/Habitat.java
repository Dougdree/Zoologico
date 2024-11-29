// Clase Habitat:
public class Habitat {
    private String tipoHabitat; // Tipo de hábitat
    private float temperatura; // Temperatura ideal del hábitat.
    private double espacio; // Espacio disponible en metros cuadrados.
    private String capacidad; // Capacidad máxima en términos de animales.

    // Constructor de la clase Habitat.
    public Habitat(String tipoHabitat, float temperatura, double espacio, String capacidad) {
        this.tipoHabitat = tipoHabitat;
        this.temperatura = temperatura;
        this.espacio = espacio;
        this.capacidad = capacidad;
    }

    // Método para ajustar la temperatura del hábitat.
    public void ajustarTemperatura(float nuevaTemperatura) {
        this.temperatura = nuevaTemperatura;
        System.out.println("La temperatura del hábitat ha sido ajustada a: " + nuevaTemperatura + " °C");
    }

    // Métodos getters y setters.
    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public double getEspacio() {
        return espacio;
    }

    public void setEspacio(double espacio) {
        this.espacio = espacio;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
}
