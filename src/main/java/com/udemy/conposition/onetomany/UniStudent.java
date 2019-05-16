package com.udemy.conposition.onetomany;

import javax.persistence.*;

/**
 *
 * @author Jan
 */

@Entity
public class UniStudent {
    @Id
    @Column(name="student_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int studentId;
    
    @Column(name="student_name")
    private String studentName;
    
    @ManyToOne
    @JoinColumn(name="universityId")
    private University university;

    public UniStudent() {
    }

    public UniStudent(String studentName) {
        this.studentName = studentName;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}