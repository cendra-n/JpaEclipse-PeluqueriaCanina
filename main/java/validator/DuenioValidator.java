package validator;
import logica.Duenio;
import javax.swing.JOptionPane;

/**
 * Clase validadora para la entidad Duenio que verifica la integridad de los datos.
 * Contiene métodos para validar los atributos de un dueño antes de su persistencia.
 */
public class DuenioValidator {

    /**
     * Valida todos los atributos de un objeto Duenio.
     * 
     * @param duenio Objeto Duenio a validar
     * @return true si todos los atributos son válidos, false si alguno falla
     * 
     * @throws NullPointerException Si el objeto duenio es nulo
     */
    public static boolean validarDuenio(Duenio duenio) {
        if (duenio == null) {
            JOptionPane.showMessageDialog(null, "Error: El dueño no puede ser nulo.");
            return false;
        }

        if (!validarNombreApellido(duenio.getNombreDuenio())) {
            JOptionPane.showMessageDialog(null, "Error: El nombre debe tener entre 2 y 30 caracteres.");
            return false;
        }
        
        if(!validarDni(duenio.getDniDuenio())){
           JOptionPane.showMessageDialog(null, "Error el Dni debe tener 8 números.");
           return false;      
        }

        if (!validarTelefono(duenio.getCelDuenio())) {
            JOptionPane.showMessageDialog(null, "Error: El teléfono debe contener 10 dígitos.");
            return false;
        }

        return true;
    }

    /**
     * Valida que un nombre/apellido cumpla con los requisitos de longitud.
     * 
     * @param texto Nombre o apellido a validar
     * @return true si tiene entre 2 y 30 caracteres, false en caso contrario
     */
    private static boolean validarNombreApellido(String texto) {
        return texto != null && texto.length() >= 2 && texto.length() <= 30;
    }
    
    /**
     * Valida que un DNI tenga exactamente 8 dígitos numéricos.
     * 
     * @param dni Número de documento a validar
     * @return true si tiene 8 dígitos, false en caso contrario
     */
    private static boolean validarDni(String dni) {
       return dni != null && dni.matches("\\d{8}"); 
    }

    /**
     * Valida que un número de teléfono tenga exactamente 10 dígitos numéricos.
     * 
     * @param telefono Número de teléfono a validar
     * @return true si tiene 10 dígitos, false en caso contrario
     */
    private static boolean validarTelefono(String telefono) {
       return telefono != null && telefono.matches("\\d{10}");
    }
}

