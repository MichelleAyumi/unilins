package aplicacao;

import model.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        //Instanciando os objetos
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unilins-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa p1 = new Pessoa(null,"abc", "789","carlos@gmail","Carlos da Silva",1,"20/05/2003","seila");
        Pessoa p2 = new Pessoa(null, "def","456","joaquim@gmail","Joaquim Torres",1,"20/05/2003","seila");
        Pessoa p3 = new Pessoa(null, "ghi","123","ana@gmail","Ana Maria",1,"20/05/2003","seila");

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}