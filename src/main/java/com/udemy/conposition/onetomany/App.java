package com.udemy.conposition.onetomany;

import com.udemy.composition.onetoone.Address;
import com.udemy.composition.onetoone.Employee;
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

        University uni = new University("XYZ");
        
        UniStudent s1 = new UniStudent("Joe Smith");
        s1.setUniversity(uni);
        UniStudent s2 = new UniStudent("Dave Link");
        s2.setUniversity(uni);
        
        uni.addStudent(s1);
        uni.addStudent(s2);
        
        entityManager.persist(uni);
        entityManager.persist(s1);
        entityManager.persist(s2);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }

}
