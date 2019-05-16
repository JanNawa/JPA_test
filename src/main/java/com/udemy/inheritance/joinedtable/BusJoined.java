package com.udemy.inheritance.joinedtable;

import javax.persistence.*;

/**
 *
 * @author Jan
 */

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class BusJoined extends VehicleJoined{
    private int numberOfPassengers;
    
    public BusJoined(){}

    public BusJoined(int numberOfPassengers, String name) {
        super(name);
        this.numberOfPassengers = numberOfPassengers;
    }
}
