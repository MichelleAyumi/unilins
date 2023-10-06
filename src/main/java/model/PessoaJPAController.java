package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

    public class PessoaJPAController {

        private EntityManagerFactory emf;

        public PessoaJPAController() {
            emf = Persistence.createEntityManagerFactory("sua-unidade-de-persistencia"); // Substitua pelo nome da sua unidade de persistência
        }

        public void create(Pessoa pessoa) {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(pessoa);
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