package be.bstorm.akimts.exo.maven;

import be.bstorm.akimts.exo.maven.entity.Personne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exo-maven");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Personne> query = em.createQuery("SELECT p FROM Personne p", Personne.class);
        query.getResultList().forEach( System.out::println );

        emf.close();

    }

}
