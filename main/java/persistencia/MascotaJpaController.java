package persistencia;

import logica.Mascota;
import persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;

/**
 * Controlador JPA para la entidad Mascota que maneja operaciones CRUD en la base de datos.
 * Implementa Serializable para permitir la serialización de instancias.
 */
public class MascotaJpaController implements Serializable {
    private EntityManagerFactory emf = null;
    
    /**
     * Constructor que recibe un EntityManagerFactory configurado externamente.
     * @param emf EntityManagerFactory para la creación de EntityManagers
     */
    public MascotaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    /**
     * Constructor por defecto que inicializa el EntityManagerFactory
     * usando la unidad de persistencia "peluqueriaJpaPU".
     */
    public MascotaJpaController() {
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
     * Persiste una nueva mascota en la base de datos.
     * Si la mascota tiene dueño asociado, lo actualiza primero.
     * @param mascota Objeto Mascota a persistir
     */
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

    /**
     * Actualiza una mascota existente en la base de datos.
     * @param mascota Objeto Mascota con los datos actualizados
     * @throws Exception Si la mascota no existe o ocurre un error durante la actualización
     */
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

    /**
     * Elimina una mascota de la base de datos por su ID.
     * @param id Identificador único de la mascota a eliminar
     * @throws Exception Si la mascota no existe o ocurre un error durante la eliminación
     */
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

    /**
     * Obtiene todas las mascotas registradas en la base de datos.
     * @return Lista de todos los objetos Mascota
     */
    public List<Mascota> findMascotaEntities() {
        EntityManager em = getEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Mascota.class));
        return em.createQuery(cq).getResultList();
    }

    /**
     * Busca una mascota específica por su ID.
     * @param id Identificador único de la mascota
     * @return Objeto Mascota encontrado o null si no existe
     */
    public Mascota findMascota(int id) {
        EntityManager em = getEntityManager();
        return em.find(Mascota.class, id);
    }
}

