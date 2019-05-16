package com.udemy.inheritance.tableperclass;

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

        CarTPC car = new CarTPC(100, "name of car");
        BusTPC bus = new BusTPC(200, "bus name");
        
        entityManager.persist(bus);
        entityManager.persist(car);
        
        entityManager.getTransaction().commit();
        
        entityManager.close();
        entityManagerFactory.close();

    }

}
