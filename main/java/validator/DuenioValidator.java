package validator;

import logica.Duenio;
import javax.swing.JOptionPane;

public class DuenioValidator {

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

    private static boolean validarNombreApellido(String texto) {
        return texto != null && texto.length() >= 2 && texto.length() <= 30;
    }
    
    private static boolean validarDni(String dni) {
       return dni != null && dni.matches("\\d{8}"); // Solo permite exactamente 8 números
    }

    private static boolean validarTelefono(String telefono) {
       return telefono != null && telefono.matches("\\d{10}");
    }
}

