package validator;

import logica.Mascota;
import logica.Duenio;
import javax.swing.JOptionPane;

public class MascotaValidator {

    public static boolean validarMascota(Mascota mascota) {
        if (mascota == null) {
            JOptionPane.showMessageDialog(null, "Error: La mascota no puede ser nula.");
            return false;
        }

        if (!validarNombre(mascota.getNombrePerro())) {
            JOptionPane.showMessageDialog(null, "Error: El nombre de la mascota debe tener entre 3 y 12 caracteres.");
            return false;
        }

        if (!validarRaza(mascota.getRaza())) {
            JOptionPane.showMessageDialog(null, "Error: La raza debe tener entre 5 y 15 caracteres.");
            return false;
        }

        if (!validarColor(mascota.getColor())) {
            JOptionPane.showMessageDialog(null, "Error: El color debe tener entre 4 y 15 caracteres.");
            return false;
        }

        if (!validarAlergico(mascota.getAlergico())) {
            JOptionPane.showMessageDialog(null, "Error: Alergico debe ser 'Sí' o 'No'.");
            return false;
        }

        if (!validarAtencionEspecial(mascota.getAtencionEspecial())) {
            JOptionPane.showMessageDialog(null, "Error: Atención especial debe ser 'Sí' o 'No'.");
            return false;
        }

        if (!validarDuenio(mascota.getUnDuenio())) {
            JOptionPane.showMessageDialog(null, "Error: La mascota debe tener un dueño válido.");
            return false;
        }

        return true;
    }

    private static boolean validarNombre(String nombre) {
        return nombre != null && nombre.length() >= 3 && nombre.length() <= 12;
    }

    private static boolean validarRaza(String raza) {
        return raza != null && raza.length() >= 5 && raza.length() <= 15;
    }

    private static boolean validarColor(String color) {
        return color != null && color.length() >= 4 && color.length() <= 15;
    }

    private static boolean validarAlergico(String alergico) {
        return alergico != null && (alergico.equalsIgnoreCase("SI") || alergico.equalsIgnoreCase("NO"));
    }

    private static boolean validarAtencionEspecial(String atencion) {
        return atencion != null && (atencion.equalsIgnoreCase("SI") || atencion.equalsIgnoreCase("NO"));
    }

    private static boolean validarDuenio(Duenio duenio) {
        return duenio != null && DuenioValidator.validarDuenio(duenio);
    }
}
