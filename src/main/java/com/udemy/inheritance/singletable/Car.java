package com.udemy.inheritance.singletable;

import javax.persistence.*;

/**
 *
 * @author Jan
 */

@Entity
@DiscriminatorValue(value="C")
public class Car extends Vehicle{
    private int speed;
    
    public Car(){}

    public Car(int speed, String name) {
        super(name);
        this.speed = speed;
    }
}
