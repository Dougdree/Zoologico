public class Conserje extends Empleado {
    private String areaLimpieza;

    // constructor de la clase y la herencia
    public Conserje(String cedula, String nombre, String fechaNacimiento, String numeroTelefono, String cargo, String horario, float sueldo, String areaLimpieza) {
        super(cedula, nombre, fechaNacimiento, numeroTelefono, cargo, horario, sueldo);
        this.areaLimpieza = areaLimpieza;
    }


    // getter and setter de la clase
    public String getAreaLimpieza() {
        return areaLimpieza;
    }

    public void setAreaLimpieza(String areaLimpieza) {
        this.areaLimpieza = areaLimpieza;
    }
}
