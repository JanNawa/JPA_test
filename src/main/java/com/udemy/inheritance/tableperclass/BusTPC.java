package com.udemy.inheritance.tableperclass;

import javax.persistence.*;

/**
 *
 * @author Jan
 */

@Entity
public class BusTPC extends VehicleTPC{
    private int numberOfPassengers;
    
    public BusTPC(){}

    public BusTPC(int numberOfPassengers, String name) {
        super(name);
        this.numberOfPassengers = numberOfPassengers;
    }
}
