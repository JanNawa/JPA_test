package com.udemy.composition.onetoone;

import javax.persistence.*;

/**
 *
 * @author Jan
 */

@Entity
@Table(name="address_table")
public class Address {
    @Id
    @GeneratedValue
    private int addressId;
    
    @Column(name="address_name")
    private String addressName;
    
    @Column(name="zip_code")
    private int zipCode;
    
    @OneToOne
    @JoinColumn(name="employeeId") //foreign key
    private Employee employee;

    public Address() {
    }

    public Address(String addressName, int zipCode) {
        this.addressName = addressName;
        this.zipCode = zipCode;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}