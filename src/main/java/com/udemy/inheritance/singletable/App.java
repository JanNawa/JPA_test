package com.udemy.inheritance.singletable;

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

        Car car = new Car(100, "name of car");
        Bus bus = new Bus(200, "bus name");
        
        entityManager.persist(bus);
        entityManager.persist(car);
        
        entityManager.getTransaction().commit();
        
        entityManager.close();
        entityManagerFactory.close();

    }

}
