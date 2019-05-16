package com.udemy.inheritance.tableperclass;

import javax.persistence.*;

/**
 *
 * @author Jan
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table
public class VehicleTPC {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    protected String name;

    public VehicleTPC() {
    }

    public VehicleTPC(String name) {
        this.name = name;
    }

}
