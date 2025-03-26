package persistencia;

import logica.Mascota;
import persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;

/*
  @author Nadia Cendra
*/

public class MascotaJpaController implements Serializable {
    private EntityManagerFactory emf = null;
    
    
    public MascotaJpaController(EntityManagerFactory emf) { //constructor por defecto que puso el ide
        this.emf = emf;
    }

    
    public MascotaJpaController() { //Constructor personalizado para que pueda crear nuevas instancias 
        emf = Persistence.createEntityManagerFactory("peluqueriaJpaPU"); //, a partir de la Persistence Unit llamada "peluqueriaJpaPU"
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    
    public EntityManagerFactory getEntityManagerFactory() {
      return emf; //para que pueda cerrar conexion con la base 11
    }

    public void create(Mascota mascota) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            if (mascota.getUnDuenio() != null) {
                mascota.setUnDuenio(em.merge(mascota.getUnDuenio()));
            }
            em.persist(mascota);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void edit(Mascota mascota) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            if (em.find(Mascota.class, mascota.getNumCliente()) == null) {
                throw new NonexistentEntityException("La mascota con id " + mascota.getNumCliente() + " no existe.");
            }
            if (mascota.getUnDuenio() != null) {
                mascota.setUnDuenio(em.merge(mascota.getUnDuenio()));
            }
            mascota = em.merge(mascota);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void destroy(int id) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Mascota mascota = em.getReference(Mascota.class, id);
            em.remove(mascota);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public List<Mascota> findMascotaEntities() {
        EntityManager em = getEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Mascota.class));
        return em.createQuery(cq).getResultList();
    }

    public Mascota findMascota(int id) {
        EntityManager em = getEntityManager();
        return em.find(Mascota.class, id);
    }
}

