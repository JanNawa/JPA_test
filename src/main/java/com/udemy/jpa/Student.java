package com.udemy.jpa;

import javax.persistence.*;

/**
 *
 * @author Jan
 */

@Entity
@Table(name="Student")
public class Student {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO) //generate id automatically
    private int id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="age")
    private int age;
    
    @Transient
    private String address;
    
    @Column(name="student_grade")
    private int grade;
    
    public Student(){}

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
