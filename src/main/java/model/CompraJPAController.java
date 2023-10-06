package model;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CompraJPAController {
    private EntityManagerFactory emf;

    public CompraJPAController() {
        emf = Persistence.createEntityManagerFactory("unilins-jpa");
    }

    public void create(Compra compra) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(compra);
        em.getTransaction().commit();
        em.close();
    }


    public  void create(){

    }

    public void edit(){

    }

    public void destroy(){

    }

    public void findAll(){

    }

    public void findById(){

    }
}