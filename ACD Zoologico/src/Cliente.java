// Clase Cliente: Hereda de Persona, representa un cliente que compra boletos.
public class Cliente extends Persona {
    // Método para que el cliente compre un boleto
    public void comprarBoleto() {
        System.out.println(nombre + " ha comprado un boleto.");
    }

    // Constructor de la clase Cliente.
    public Cliente(String cedula, String nombre, String fechaNacimiento, String numeroTelefono) {
        super(cedula, nombre, fechaNacimiento, numeroTelefono);
    }
}
