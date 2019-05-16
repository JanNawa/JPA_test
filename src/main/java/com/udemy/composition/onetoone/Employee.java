package com.udemy.composition.onetoone;

import javax.persistence.*;

/**
 *
 * @author Jan
 */

@Entity
@Table(name="employee_table")
public class Employee {
    @Id
    @GeneratedValue
    private int employeeId;
    
    @Column(name="employee_name")
    private String employeeName;
    
    @OneToOne(mappedBy="employee")
    private Address address;

    public Employee() {
    }

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}