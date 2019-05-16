package com.udemy.inheritance.joinedtable;

import javax.persistence.*;

/**
 *
 * @author Jan
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="vehicle_joined_table")
public class VehicleJoined {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    protected String name;

    public VehicleJoined() {
    }

    public VehicleJoined(String name) {
        this.name = name;
    }

}
