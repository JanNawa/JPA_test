package com.udemy.composition.onetoone;

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
        
        Address address = new Address("Wall Street", 1123);
        Employee employee = new Employee("Joe Smith");
        employee.setAddress(address);
        address.setEmployee(employee);
        
        entityManager.persist(address);
        entityManager.persist(employee);
        
        entityManager.getTransaction().commit();
        
        entityManager.close();
        entityManagerFactory.close();

    }
}