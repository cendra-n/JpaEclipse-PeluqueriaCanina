package logica;

/**
 * Clase que actúa como intermediaria entre la capa de persistencia y la interfaz gráfica.
 * Centraliza la lógica de negocio y valida los datos antes de enviarlos a persistencia.
 * @author Nadia Cendra
 */

import persistencia.ControladoraPersistencia;
import validator.DuenioValidator;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import validator.MascotaValidator;


public class Controladora {
    /**
     * Instancia de ControladoraPersistencia para manejar operaciones con la base de datos
     */
    ControladoraPersistencia controlPersis = new ControladoraPersistencia(); 
    
    /**
     * Guarda los datos de mascota y dueño en la base de datos después de validarlos.
     * 
     * @param nombreMas Nombre de la mascota
     * @param raza Raza de la mascota
     * @param color Color de la mascota
     * @param alergico Indicador de alergias (SI/NO)
     * @param atencion Indicador de atención especial (SI/NO)
     * @param nombreDue Nombre del dueño
     * @param dniDue DNI del dueño
     * @param celular Número de celular del dueño
     * @param observacion Observaciones adicionales
     */
    public void guardarDatos(String nombreMas, String raza, String color, String alergico, String atencion, String nombreDue, String dniDue, String celular, String observacion) {
    
        Duenio duenio = new Duenio();
        duenio.setNombreDuenio(nombreDue);
        duenio.setDniDuenio(dniDue);
        duenio.setCelDuenio(celular);

        Mascota mascota= new Mascota();
        mascota.setNombrePerro(nombreMas);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atencion);
        mascota.setObservaciones(observacion);
        mascota.setUnDuenio(duenio);
      
      
        if (!DuenioValidator.validarDuenio(duenio) || !MascotaValidator.validarMascota(mascota)) {
            JOptionPane.showMessageDialog(null, "¡No cumple las reglas!\nRevise los datos ingresados.","Error de validación", JOptionPane.ERROR_MESSAGE);
        } else {
            System.out.println("Procedo al insert en la base de datos");
            // Aquí llamamos a la persistencia para guardar
            controlPersis.guardar(duenio, mascota);
            JOptionPane.showMessageDialog(null, "La información fue guardada con éxito en la BD.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
        }
      
      
    }
    
   /**
     * Obtiene la lista completa de mascotas desde la base de datos
     * @return Lista de objetos Mascota
     */
    public List<Mascota> traerMascotas() {
       return controlPersis.traerListaMascota();
    }

      /**
     * Elimina una mascota de la base de datos según su número de cliente
     * @param numCliente Identificador único de la mascota
     */
    public void borrarMascota(int numCliente) {
       controlPersis.eliminarMascota(numCliente);
    }

    /**
     * Obtiene una mascota específica desde la base de datos
     * @param numCliente Identificador único de la mascota
     * @return Objeto Mascota encontrado
     */
    public Mascota traerUnaMascota(int numCliente) {
       return controlPersis.buscarMascota(numCliente);
    }
    
       /**
     * Modifica los datos de una mascota y su dueño en la base de datos
     * 
     * @param masco Objeto Mascota a modificar
     * @param nombreMas Nuevo nombre de la mascota
     * @param raza Nueva raza de la mascota
     * @param color Nuevo color de la mascota
     * @param alergico Nuevo indicador de alergias
     * @param atencion Nuevo indicador de atención especial
     * @param nombreDue Nuevo nombre del dueño
     * @param dniDuenio Nuevo DNI del dueño
     * @param celular Nuevo número de celular del dueño
     * @param observacion Nuevas observaciones
     */
    public void modificarDatos(Mascota masco, String nombreMas, String raza, String color, String alergico, String atencion, String nombreDue, String dniDuenio, String celular, String observacion) {
       masco.setNombrePerro(nombreMas);
       masco.setRaza(raza);
       masco.setColor(color);
       masco.setObservaciones(observacion);
       masco.setAlergico(alergico);
       masco.setAtencionEspecial(atencion);
     
       controlPersis.modificarMascota(masco);
       Duenio duenio = this.buscarDuenio(masco.getUnDuenio().getIdDuenio()); 
       duenio.setNombreDuenio(nombreDue);
       duenio.setDniDuenio(dniDuenio);
       duenio.setCelDuenio(celular);
     
       this.modificarDuenio(duenio);
       
    }
    
    
     /**
     * Busca un dueño por su ID
     * @param idDuenio Identificador único del dueño
     * @return Objeto Duenio encontrado
     */
    private Duenio buscarDuenio(int idDuenio) { 
        return controlPersis.traerDuenio(idDuenio);
    }

    
    /**
     * Modifica los datos de un dueño en la base de datos
     * @param duenio Objeto Duenio con los datos actualizados
     */
    private void modificarDuenio(Duenio duenio) {
        controlPersis.cambiarDuenio(duenio);
    }
    

    
}
