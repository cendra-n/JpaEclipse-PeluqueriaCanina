package persistencia;

/**
 * * @author Nadia Cendra
 */

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Duenio;
import logica.Mascota;

/*para poder administrar todos los jpacontroler vamos a crear una controladora de persitencia, esta controladora va a 
supervisar cada una de las instancias del jpaContoler que tengamos,(mascota y duenio).
creamos la controladora y cuando llamemos a este new para crear una nueva instancia, en nuestros dueJpa y masJpa
va a quedar lo que tenga que ver con el constructor personalizado(el extra que hicimos en las clases 
MascotaJpaControler y duenioJpaControler) teniendo en cuenta la unidad de persitencia que aca se
llama "peluqueriaJpaPU" nombre que pusimos como nombre en el primer input
del archivo persitence.xml*/

public class ControladoraPersistencia {
    DuenioJpaController dueJpa = new DuenioJpaController(); //instancia de la clase jpa de duenio
    MascotaJpaController masJpa = new MascotaJpaController(); //instancia de la clase jpa de mascota

    public void guardar(Duenio duenio, Mascota mascota) {
        //crear dueño en la BD
        dueJpa.create(duenio);
        
        //crear mascota en la BD
        masJpa.create(mascota);
    }

    public List<Mascota> traerListaMascota() {
        
        return masJpa.findMascotaEntities(); //retorno todos los objetos que estan en la entidad mascotas en este caso
    }

    public void eliminarMascota(int numCliente) {
        try {
            masJpa.destroy(numCliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota buscarMascota(int numCliente) {
      return  masJpa.findMascota(numCliente);
    }

    public void modificarMascota(Mascota masco) {
        try {
            masJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public Duenio traerDuenio(int idDuenio) { //me va a buscar el dueño mediante el id
        return dueJpa.findDuenio(idDuenio); 
    }
    
    
    public void cambiarDuenio(Duenio duenio) {//editar dueño
        try {
            dueJpa.edit(duenio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cerrarConexion() { //base 11
        if (masJpa != null && masJpa.getEntityManagerFactory().isOpen()) { //cerrar conexion con la bd
            masJpa.getEntityManagerFactory().close();
        }

        if (dueJpa != null && dueJpa.getEntityManagerFactory().isOpen()) {
            dueJpa.getEntityManagerFactory().close();
        }
    }

}
