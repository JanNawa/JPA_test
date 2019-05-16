package com.udemy.inheritance.tableperclass;


import javax.persistence.*;

/**
 *
 * @author Jan
 */

@Entity
public class CarTPC extends VehicleTPC{
    private int speed;
    
    public CarTPC(){}

    public CarTPC(int speed, String name) {
        super(name);
        this.speed = speed;
    }
}
