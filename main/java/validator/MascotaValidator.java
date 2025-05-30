package validator;

import logica.Mascota;
import logica.Duenio;
import javax.swing.JOptionPane;

/**
 * Clase validadora para la entidad Mascota que verifica la integridad de los datos.
 * Contiene métodos para validar los atributos de una mascota antes de su persistencia.
 */
public class MascotaValidator {

    /**
     * Valida todos los atributos de un objeto Mascota.
     * 
     * @param mascota Objeto Mascota a validar
     * @return true si todos los atributos son válidos, false si alguno falla
     * 
     * @throws NullPointerException Si el objeto mascota es nulo
     */
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

    /**
     * Valida que el nombre de la mascota cumpla con los requisitos de longitud.
     * 
     * @param nombre Nombre de la mascota a validar
     * @return true si tiene entre 3 y 12 caracteres, false en caso contrario
     */
    private static boolean validarNombre(String nombre) {
        return nombre != null && nombre.length() >= 3 && nombre.length() <= 12;
    }

    /**
     * Valida que la raza cumpla con los requisitos de longitud.
     * 
     * @param raza Raza de la mascota a validar
     * @return true si tiene entre 5 y 15 caracteres, false en caso contrario
     */
    private static boolean validarRaza(String raza) {
        return raza != null && raza.length() >= 5 && raza.length() <= 15;
    }

    /**
     * Valida que el color cumpla con los requisitos de longitud.
     * 
     * @param color Color de la mascota a validar
     * @return true si tiene entre 4 y 15 caracteres, false en caso contrario
     */
    private static boolean validarColor(String color) {
        return color != null && color.length() >= 4 && color.length() <= 15;
    }

    /**
     * Valida que el campo alergico contenga un valor válido.
     * 
     * @param alergico Valor a validar ('SI' o 'NO', sin importar mayúsculas/minúsculas)
     * @return true si es válido, false en caso contrario
     */
    private static boolean validarAlergico(String alergico) {
        return alergico != null && (alergico.equalsIgnoreCase("SI") || alergico.equalsIgnoreCase("NO"));
    }

    /**
     * Valida que el campo atencionEspecial contenga un valor válido.
     * 
     * @param atencion Valor a validar ('SI' o 'NO', sin importar mayúsculas/minúsculas)
     * @return true si es válido, false en caso contrario
     */
    private static boolean validarAtencionEspecial(String atencion) {
        return atencion != null && (atencion.equalsIgnoreCase("SI") || atencion.equalsIgnoreCase("NO"));
    }

    /**
     * Valida que el dueño asociado a la mascota sea válido.
     * 
     * @param duenio Objeto Duenio a validar
     * @return true si el dueño es válido (no nulo y pasa las validaciones de DuenioValidator), 
     *         false en caso contrario
     */
    private static boolean validarDuenio(Duenio duenio) {
        return duenio != null && DuenioValidator.validarDuenio(duenio);
    }
}