package com.udemy.inheritance.singletable;

import javax.persistence.*;

/**
 *
 * @author Jan
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="vehicle_single_table")
@DiscriminatorColumn(name = "type")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    protected String name;

    public Vehicle() {
    }

    public Vehicle(String name) {
        this.name = name;
    }

}
