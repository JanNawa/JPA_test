package com.udemy.conposition.onetomany;

import java.util.*;
import javax.persistence.*;

/**
 *
 * @author Jan
 */

@Entity
public class University {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="university_id")
    private int universityId;
    
    @Column(name="university_name")
    private String universityName;
    
    @OneToMany(mappedBy="university")
    private List<UniStudent> students;

    public University() {
        this.students = new ArrayList<>();
    }

    public University(String universityName) {
        this();
        this.universityName = universityName;
    }
    
    public void addStudent(UniStudent student){
        this.students.add(student);
    }
}