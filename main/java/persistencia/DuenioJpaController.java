package persistencia;

import logica.Duenio;
import persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;

/*
  @author Nadia Cendra
*/

public class DuenioJpaController implements Serializable {
    private EntityManagerFactory emf = null;
    
    
    public DuenioJpaController(EntityManagerFactory emf) { ////constructor por defecto que puso el ide
        this.emf = emf;
    }
    
    
    public DuenioJpaController() { //Constructor personalizado para que pueda crear nuevas instancias 
        emf = Persistence.createEntityManagerFactory("peluqueriaJpaPU");//a partir de la Persistence Unit llamada "peluqueriaJpaPU"
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
   
    public EntityManagerFactory getEntityManagerFactory() {
      return emf; //para que pueda cerrar conexion con la base 11
    }
    

    public void create(Duenio duenio) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(duenio);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void edit(Duenio duenio) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            if (em.find(Duenio.class, duenio.getIdDuenio()) == null) {
                throw new NonexistentEntityException("El duenio con id " + duenio.getIdDuenio() + " no existe.");
            }
            duenio = em.merge(duenio);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void destroy(int id) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Duenio duenio = em.getReference(Duenio.class, id);
            em.remove(duenio);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public List<Duenio> findDuenioEntities() {
        EntityManager em = getEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Duenio.class));
        return em.createQuery(cq).getResultList();
    }

    public Duenio findDuenio(int id) {
        EntityManager em = getEntityManager();
        return em.find(Duenio.class, id);
    }
}

