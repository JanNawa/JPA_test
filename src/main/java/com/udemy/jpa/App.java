package com.udemy.jpa;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Jan
 */
public class App {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.udemy.jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

//first JPA test
//        insertStudent(entityManager);
//CRUD - Person (create/insert)
//        crudPersonInsert(entityManager);

//CRUD - Person (read/retrieve data)     
//        crudPersonRead(entityManager);

//CRUD - Person (delete)
//        crudPersonDelete(entityManager);

//JPQL - retrieve Person by jpql
//        jpqlPersonRetrieve(entityManager);

//JPQL - native query (not good solution because mix java code with sql code)
//        jpqlPersonNativeQuery(entityManager);

//JPQL - named query (better because seperate java code and sql code)
        jpqlPersonNamedQuery(entityManager);

        entityManager.close();
        entityManagerFactory.close();

    }

    public static void insertStudent(EntityManager entityManager) {
        Student s = new Student("Bob", 34, "New York");
        s.setAge(30);
        s.setName("Dave");

        entityManager.persist(s);
        entityManager.getTransaction().commit();
    }

    public static void crudPersonInsert(EntityManager entityManager) {
        Person p1 = new Person("Kevin", "kevin@gmail.com", 16);
        Person p2 = new Person("Joe", "joe@gmail.com", 29);
        Person p3 = new Person("Dave", "dave@gmail.com", 20);
        Person p4 = new Person("Fred", "fred@gmail.com", 43);

        entityManager.persist(p1);
        entityManager.persist(p2);
        entityManager.persist(p3);
        entityManager.persist(p4);
        entityManager.getTransaction().commit();
    }

    public static void crudPersonRead(EntityManager entityManager) {
        Person p = entityManager.find(Person.class, 1);
        System.out.println(p);
    }
    
    public static void crudPersonDelete(EntityManager entityManager) {
        Person p = entityManager.find(Person.class, 2);

        entityManager.remove(p);
        entityManager.getTransaction().commit();
    }
    
    public static void jpqlPersonRetrieve(EntityManager entityManager){
//      normal Query returns List<Object> --> need to cast
        Query query1 = entityManager.createQuery("SELECT p FROM Person p");
        jpqlPrintQuery(query1);
        
        Query query2 = entityManager.createQuery("SELECT p FROM Person p WHERE p.age > 25");
        jpqlPrintQuery(query2);
        
        Query query3 = entityManager.createQuery("SELECT p FROM Person p WHERE p.name LIKE '%e'");
        jpqlPrintQuery(query3);
        
        Query query4 = entityManager.createQuery("SELECT p FROM Person p WHERE p.age BETWEEN 25 AND 40");
        jpqlPrintQuery(query4);
        
        Query query5 = entityManager.createQuery("SELECT p FROM Person p ORDER BY p.age DESC");
        jpqlPrintQuery(query5);
    }
    
    public static void jpqlPersonNativeQuery(EntityManager entityManager){
//      normal Query returns List<Object> --> need to cast
        Query query = entityManager.createNativeQuery("SELECT * FROM person_table WHERE age > 25", Person.class);
        jpqlPrintQuery(query);
    }
    
    public static void jpqlPersonNamedQuery(EntityManager entityManager) {
//      TypedQuery return List<Person> --> no need to cast
        TypedQuery<Person> query1 = entityManager.createNamedQuery("person.getAll", Person.class);
        jpqlPrintQuery(query1);
        
        TypedQuery<Person> query2 = entityManager.createNamedQuery("person.getPersonById", Person.class);
        query2.setParameter("id", 1);
        jpqlPrintQuery(query2);
    }
    
    public static void jpqlPrintQuery(Query query){
        List<Person> people = (List<Person>) query.getResultList();
        for(Person p : people){
            System.out.println(p);
        }
        System.out.println("============================");
    }
}
