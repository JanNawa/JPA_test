package com.udemy.inheritance.singletable;

import javax.persistence.*;

/**
 *
 * @author Jan
 */

@Entity
@DiscriminatorValue(value="B")
public class Bus extends Vehicle{
    private int numberOfPassengers;
    
    public Bus(){}

    public Bus(int numberOfPassengers, String name) {
        super(name);
        this.numberOfPassengers = numberOfPassengers;
    }
}
