package persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Duenio;
import logica.Mascota;

/**
 * Controladora principal de persistencia que gestiona las operaciones con la base de datos.
 * Actúa como intermediario entre los controladores JPA y la capa de lógica de negocio.
 */
public class ControladoraPersistencia {
    DuenioJpaController dueJpa = new DuenioJpaController();
    MascotaJpaController masJpa = new MascotaJpaController();

    /**
     * Guarda un nuevo dueño y su mascota en la base de datos.
     * @param duenio Objeto Duenio a persistir
     * @param mascota Objeto Mascota a persistir
     */
    public void guardar(Duenio duenio, Mascota mascota) {
        dueJpa.create(duenio);
        masJpa.create(mascota);
    }

    /**
     * Obtiene todas las mascotas registradas en la base de datos.
     * @return Lista de todas las mascotas
     */
    public List<Mascota> traerListaMascota() {
        return masJpa.findMascotaEntities();
    }

    /**
     * Elimina una mascota de la base de datos por su número de cliente.
     * @param numCliente ID de la mascota a eliminar
     */
    public void eliminarMascota(int numCliente) {
        try {
            masJpa.destroy(numCliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Busca una mascota específica por su número de cliente.
     * @param numCliente ID de la mascota a buscar
     * @return Mascota encontrada o null si no existe
     */
    public Mascota buscarMascota(int numCliente) {
        return masJpa.findMascota(numCliente);
    }

    /**
     * Actualiza los datos de una mascota existente.
     * @param masco Objeto Mascota con los datos actualizados
     */
    public void modificarMascota(Mascota masco) {
        try {
            masJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Busca un dueño por su ID.
     * @param idDuenio ID del dueño a buscar
     * @return Dueño encontrado o null si no existe
     */
    public Duenio traerDuenio(int idDuenio) {
        return dueJpa.findDuenio(idDuenio);
    }

    /**
     * Actualiza los datos de un dueño existente.
     * @param duenio Objeto Duenio con los datos actualizados
     */
    public void cambiarDuenio(Duenio duenio) {
        try {
            dueJpa.edit(duenio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Cierra las conexiones activas con la base de datos.
     */
    public void cerrarConexion() {
        if (masJpa != null && masJpa.getEntityManagerFactory().isOpen()) {
            masJpa.getEntityManagerFactory().close();
        }

        if (dueJpa != null && dueJpa.getEntityManagerFactory().isOpen()) {
            dueJpa.getEntityManagerFactory().close();
        }
    }
}