package com.udemy.mappersuperclass;

import javax.persistence.*;

/**
 *
 * @author Jan
 */

@Entity
@Table
public class PersonalDriver extends Driver{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
    private int age;

    public PersonalDriver() {
    }

    public PersonalDriver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%15s %5d", name, age);
    }
}