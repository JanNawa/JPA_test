package com.udemy.mappersuperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jan
 */
public class App {
        public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.udemy.jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        PersonalDriver pd = new PersonalDriver("Joe Smith", 29);
        pd.setDrivingLicense("Valid");
        
        entityManager.persist(pd);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }

}
