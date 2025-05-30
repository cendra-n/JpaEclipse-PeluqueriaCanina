package persistencia;

import logica.Duenio;
import persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;

/**
 * Controlador JPA para la entidad Duenio que maneja operaciones CRUD en la base de datos.
 * Implementa Serializable para permitir la serialización de instancias.
 */
public class DuenioJpaController implements Serializable {
    private EntityManagerFactory emf = null;
    
    /**
     * Constructor que recibe un EntityManagerFactory configurado externamente.
     * @param emf EntityManagerFactory para la creación de EntityManagers
     */
    public DuenioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    /**
     * Constructor por defecto que inicializa el EntityManagerFactory
     * usando la unidad de persistencia "peluqueriaJpaPU".
     */
    public DuenioJpaController() {
        emf = Persistence.createEntityManagerFactory("peluqueriaJpaPU");
    }

    /**
     * Obtiene un nuevo EntityManager para operaciones con la base de datos.
     * @return EntityManager recién creado
     */
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
   
    /**
     * Devuelve el EntityManagerFactory actual.
     * @return EntityManagerFactory utilizado por este controlador
     */
    public EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
    
    /**
     * Persiste un nuevo dueño en la base de datos.
     * @param duenio Objeto Duenio a persistir
     */
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

    /**
     * Actualiza un dueño existente en la base de datos.
     * @param duenio Objeto Duenio con los datos actualizados
     * @throws Exception Si el dueño no existe o ocurre un error durante la actualización
     */
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

    /**
     * Elimina un dueño de la base de datos por su ID.
     * @param id Identificador único del dueño a eliminar
     * @throws Exception Si el dueño no existe o ocurre un error durante la eliminación
     */
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

    /**
     * Obtiene todos los dueños registrados en la base de datos.
     * @return Lista de todos los objetos Duenio
     */
    public List<Duenio> findDuenioEntities() {
        EntityManager em = getEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Duenio.class));
        return em.createQuery(cq).getResultList();
    }

    /**
     * Busca un dueño específico por su ID.
     * @param id Identificador único del dueño
     * @return Objeto Duenio encontrado o null si no existe
     */
    public Duenio findDuenio(int id) {
        EntityManager em = getEntityManager();
        return em.find(Duenio.class, id);
    }
}