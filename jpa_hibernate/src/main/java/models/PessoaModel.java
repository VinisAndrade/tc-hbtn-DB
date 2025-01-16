package models;
import entities.Produto;
import javax.persistence.*;
import java.util.List;
public class ProdutoModel {
    public void create(Produto p) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    public Produto findById(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();
        return em.find(Produto.class, id);
    }
    public List<Produto> findAll() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();
        return em.createQuery("from Produto", Produto.class).getResultList();
    }
    public void update(Produto p) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    public void delete(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Produto p = em.find(Produto.class, id);
            if (p != null) {
                em.remove(p);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}