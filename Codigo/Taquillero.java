// Clase Taquillero: Hereda de Empleado y realiza funciones de venta y asignación de boletos.
public class Taquillero extends Empleado {
    // Constructor de la clase Taquillero.
    public Taquillero(String cedula, String nombre, String fechaNacimiento, String numeroTelefono,
                      String cargo, String horario, float sueldo) {
        super(cedula, nombre, fechaNacimiento, numeroTelefono, cargo, horario, sueldo);
    }

    // Método para vender boletos.
    public void venderBoleto() {
        System.out.println(nombre + " está vendiendo un boleto.");
    }

    // Método para asignar un boleto a un cliente.
    public void asignarBoleto(Boleto boleto) {
        System.out.println(nombre + " ha asignado el boleto número " + boleto.getNumero());
    }
}
