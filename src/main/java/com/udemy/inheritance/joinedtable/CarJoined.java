package com.udemy.inheritance.joinedtable;

import javax.persistence.*;

/**
 *
 * @author Jan
 */

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class CarJoined extends VehicleJoined{
    private int speed;
    
    public CarJoined(){}

    public CarJoined(int speed, String name) {
        super(name);
        this.speed = speed;
    }
}
