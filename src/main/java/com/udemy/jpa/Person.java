package com.udemy.jpa;

import javax.persistence.*;

/**
 *
 * @author Jan
 */

@Entity
@Table(name="person_table")
@NamedQueries({ @NamedQuery(name="person.getAll", query="SELECT p FROM Person p"),
                @NamedQuery(name="person.getPersonById", query="SELECT p FROM Person p WHERE p.id = :id")})
public class Person {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private int age;
    
    public Person() {
    }
    
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return String.format("%20s %20s %5d", name, email, age);
    }
}
